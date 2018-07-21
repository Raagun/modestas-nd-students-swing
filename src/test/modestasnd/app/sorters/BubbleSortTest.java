package modestasnd.app.sorters;

import modestasnd.entities.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    @Test
    public void should_sort_from_best() {
        List<Student> input = Arrays.asList(
                new Student("A", 2.0),
                new Student("B", 8.0),
                new Student("C", 7.0),
                new Student("D", 8.0),
                new Student("E", 3.0),
                new Student("F", 5.0)
        );
        List<Student> output = Algorithms.BUBBLE.sort(input);
        assertThat(output, is(Arrays.asList(
                new Student("B", 8.0),
                new Student("D", 8.0),
                new Student("C", 7.0),
                new Student("F", 5.0),
                new Student("E", 3.0),
                new Student("A", 2.0)
        )));
    }
}
