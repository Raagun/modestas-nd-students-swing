package modestasnd.app.sorters;

import modestasnd.entities.Student;

import java.util.List;

public enum Algorithms {
    BUBBLE {
        @Override
        public List<Student> sort(List<Student> students) {
            return new BubbleSort().sort(students);
        }
    },
    HEAP {
        @Override
        public List<Student> sort(List<Student> students) {
            return new HeapSort().sort(students);
        }
    },
    MERGE {
        @Override
        public List<Student> sort(List<Student> students) {
            return new MergeSort().sort(students);
        }
    };

    public abstract List<Student> sort(List<Student> students);
}
