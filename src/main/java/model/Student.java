package model;

import java.time.LocalDate;

public class Student {
    private String fullName;
    private LocalDate dob;
    private Gender gender;
    private String address;
    private String homeTown;
    private String phone;
    private String email;

    public Student(String fullName, LocalDate dob, Gender gender, String address, String homeTown, String phone, String email) {
        this.fullName = fullName;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.homeTown = homeTown;
        this.phone = phone;
        this.email = email;
    }

    enum Gender {
        MALE, FEMALE
    }
}
