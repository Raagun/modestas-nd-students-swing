package modestasnd.io;

import modestasnd.entities.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;

public class TextFileReaderTest {
    private TextFileReader reader;

    @Before
    public void setup(){
        reader = new TextFileReader("fileName");
    }

    @Test
    public void should_split_lines_to_students(){
        Stream<String> input = Arrays.stream(new String[]{"Student1,8.5", "Student2,6.5"});
        List<Student> output = reader.getStudentsFromData(input);
        Assert.assertThat(output.get(0), is(new Student("Student1", 8.5)));
        Assert.assertThat(output.get(1), is(new Student("Student2", 6.5)));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void should_throw_exception_for_invalid_data(){
        Stream<String> input = Arrays.stream(new String[]{"Student1,8.5", "Student2"});
        List<Student> output = reader.getStudentsFromData(input);
    }
}
