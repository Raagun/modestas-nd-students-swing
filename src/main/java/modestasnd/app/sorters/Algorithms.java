package modestasnd.app.sorters;

import modestasnd.entities.Student;

import java.util.List;

public enum Algorithms {
    BUBBLE {
        public List<Student> sort(List<Student> students) {
            return new BubbleSort().sort(students);
        }
    },
    HEAP {
        public List<Student> sort(List<Student> students) {
            return new HeapSort().sort(students);
        }
    };

    public abstract List<Student> sort(List<Student> students);
}
