package modestasnd.entities;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void should_work_with_greater(){
        assertEquals(-1, new Student("A", 10.0).compareTo(new Student("B", 7.0)));
    }
    @Test
    public void should_work_with_lesser(){
        assertEquals(1, new Student("B", 7.0).compareTo(new Student("A", 10.0)));
    }
    @Test
    public void should_sort_in_desc(){
        List<Student> input = new ArrayList<Student>();
        input.add(new Student("A", 10.0));
        input.add(new Student("B", 7.0));
        input.add(new Student("C", 8.0));

        Collections.sort(input);

        assertEquals("A", input.get(0).getName());
        assertEquals("C", input.get(1).getName());
        assertEquals("B", input.get(2).getName());
    }
}
