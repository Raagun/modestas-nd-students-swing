package modestasnd.app.sorters;

import modestasnd.entities.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BubbleSort implements Sorter {

    public List<Student> sort(List<Student> students) {
        final List<Student> copiedList = new ArrayList<>(students);
        Student temp;
        for (int i = 0; i < copiedList.size() - 1; i++) {

            for (int j = 1; j < copiedList.size() - i; j++) {
                if (copiedList.get(j - 1).compareTo(copiedList.get(j)) == 1) {
                    temp = copiedList.get(j - 1);
                    copiedList.set(j - 1, copiedList.get(j));
                    copiedList.set(j, temp);
                }
            }
        }
        return copiedList;
    }
}
