package modestasnd.app.sorters;

import modestasnd.entities.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {
    private BubbleSort sort;

    @Before
    public void setup() {
        sort = new BubbleSort();
    }


    @Test
    public void should_sort_from_best() {
        List<Student> input = Arrays.asList(
                new Student("A", 2.0),
                new Student("B", 8.0),
                new Student("C", 3.0),
                new Student("D", 5.0)
        );
        List<Student> output = sort.sort(input);
        assertEquals(input.get(1).getName(), output.get(0).getName());
        assertEquals(input.get(3).getName(), output.get(1).getName());
    }
}
