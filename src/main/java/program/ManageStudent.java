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
            byte[] bytes = new byte[fis.available()];

            String content = new String(bytes);
            System.out.println(content);
            return true;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
}
