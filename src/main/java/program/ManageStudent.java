package program;

import model.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class ManageStudent {
    private List<Student> students;

    public boolean readStudentDataByFile(String path) {
        try (
                FileInputStream fis = new FileInputStream(path);
                ) {
            while(fis.read)
        } catch (IOException e) {

        }
    }
}
