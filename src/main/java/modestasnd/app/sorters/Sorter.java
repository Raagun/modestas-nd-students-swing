package modestasnd.app.sorters;

import modestasnd.entities.Student;

import java.util.List;

public interface Sorter {

    List<Student> sort(List<Student> students);
}
