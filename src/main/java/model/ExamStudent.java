package model;

import java.time.LocalDate;

public class ExamStudent extends Student {
    private LocalDate testDay;
    private double totalScore;

    public ExamStudent(String fullName, LocalDate dob, Gender gender, String address, String homeTown, String phone, String email,
                       LocalDate testDay, double totalScore) {
        super(fullName, dob, gender, address, homeTown, phone, email);
        this.testDay = testDay;
        this.totalScore = totalScore;
    }
}
