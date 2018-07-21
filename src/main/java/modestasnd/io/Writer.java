package modestasnd.io;

import modestasnd.entities.Student;

import java.io.IOException;
import java.util.List;

public interface Writer {

    public void write(List<Student> students) throws IOException;
}
