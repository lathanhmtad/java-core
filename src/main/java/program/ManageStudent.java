package program;

import model.ExamStudent;
import model.Student;
import utils.IOManager;

import java.util.List;

public class ManageStudent {
    private List<Student> students;

    public void readStudentDataByFile(String path) {
        byte[] bytes = IOManager.readFile(path);

        if (bytes == null) return;

        String content = new String(bytes);
        String[] data = content.split("\n");

        for (int i = 0; i < data.length; i++) {
            String line = data[i];
            String[] studentInfo = line.split(", ");

            int studentType = Integer.parseInt(studentInfo[0]);
            String fullName = studentInfo[1];
            String dob = studentInfo[2];
            String gender = studentInfo[3];
            String address = studentInfo[4];
            String homeTown = studentInfo[5];
            String phone = studentInfo[6];
            String email = studentInfo[7];

            if (studentType == 1) { // Sinh viên thi tuyển
                String testDay = studentInfo[8];
                double totalScore = Double.parseDouble(studentInfo[9]);
                ExamStudent examStudent = new ExamStudent(fullName, dob);

            } else if (studentType == 2) {  // Sinh viên tuyển thẳng
                String awardLevel = studentInfo[9];
                String awardName = studentInfo[10];
                int yearWonAward = Integer.parseInt(studentInfo[11]);
                String awardClassification = studentInfo[12];
            }
        }

    }
}
