package modestasnd.app.sorters;

import modestasnd.entities.Student;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BenchmarkedSort implements Sorter {

    private long lastRunTime = 0;
    private Algorithms algorithm;

    public BenchmarkedSort(Algorithms algorithm) {
        this.algorithm = algorithm;
    }

    public List<Student> sort(List<Student> students) {
        long startTime = System.nanoTime();
        List<Student> output = algorithm.sort(students);
        long endTime = System.nanoTime();
        lastRunTime = endTime - startTime;
        return output;
    }

    public long getLastRunTime() {
        return lastRunTime;
    }
}
