package modestasnd.app.sorters;

import modestasnd.entities.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BubbleSort {

    List<Student> sort(List<Student> students) {
        final List<Student> copiedList = new ArrayList<>();
        copiedList.add(new Student("X", 0.0));
        copiedList.addAll(students);

        final List<Student> bubbleSorted = new ArrayList<>();

        copiedList.stream()
                .reduce((c, e) ->
                        {
                            if ( c.getPerformance() > e.getPerformance() ){
                                bubbleSorted.add(c);
                                return e;
                            }
                            else
                            {
                                bubbleSorted.add(e);
                                return c;
                            }
                        }
                );
        return bubbleSorted;
    }
}
