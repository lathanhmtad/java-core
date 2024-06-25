import program.ManageStudent;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "src/main/resources/input.txt";

        ManageStudent manageStudent = new ManageStudent();
        manageStudent.readStudentDataByFile(inputFilePath);

    }
}
