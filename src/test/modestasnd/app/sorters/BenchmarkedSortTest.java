package modestasnd.app.sorters;

import modestasnd.entities.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public class BenchmarkedSortTest {

    @Test
    public void should_benchmark_sort_algorithm(){
        List<Student> input = Arrays.asList(
                new Student("A", 2.0),
                new Student("B", 8.0),
                new Student("C", 7.0),
                new Student("D", 8.0),
                new Student("E", 3.0),
                new Student("F", 5.0)
        );
        BenchmarkedSort sorter = new BenchmarkedSort(Algorithms.BUBBLE);
        sorter.sort(input);
        Assert.assertThat(sorter.getLastRunTime(), is(not((long)0)));
    }

    @Test
    public void should_show_zero_if_not_run(){
        Assert.assertThat(new BenchmarkedSort(Algorithms.BUBBLE).getLastRunTime(), is((long)0));
    }
}
