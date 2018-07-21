package modestasnd.entities;

public class Student implements Comparable {
    private String name;
    private Double performance;

    public Student(String name, Double performance) {
        this.name = name;
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public Double getPerformance() {
        return performance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return performance != null ? performance.equals(student.performance) : student.performance == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (performance != null ? performance.hashCode() : 0);
        return result;
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Student)
            return ((Student) o).performance.compareTo(performance);
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return name + "," + performance;
    }
}
