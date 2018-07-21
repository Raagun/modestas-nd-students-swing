package modestasnd.io;

import modestasnd.entities.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextFileReader implements Reader {

    private String fileName;

    public TextFileReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Student> readStudents() throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            return getStudentsFromData(stream);
        } catch (IOException e) {
            //TODO: custom exception file incorrect
            throw e;
        }
    }

    List<Student> getStudentsFromData(Stream<String> stream) {
        try {
            return stream
                    .map(line -> line.split(","))
                    .map(inData -> new Student(inData[0], new Double(inData[1])))
                    .collect(Collectors.toList());
        } catch (IndexOutOfBoundsException e) {
            //TODO: custom exception for invalid file data
            throw e;
        }
    }
}
