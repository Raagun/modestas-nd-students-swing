package modestasnd.io;

import modestasnd.entities.Student;

import java.io.IOException;
import java.util.List;

public interface Reader {

    public List<Student> readStudents() throws IOException;
}
