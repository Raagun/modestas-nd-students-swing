package modestasnd.io;

import modestasnd.entities.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextFileWriter implements Writer {
    private String fileName;

    public TextFileWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(List<Student> students) throws IOException {
        try {
            try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get(fileName)))) {
                students.stream().map(String::valueOf).forEach(writer::println);
            }
        } catch (IOException e) {
            //TODO: custom exception file incorrect
            throw e;
        }
    }
}
