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

    enum Gender {
        MALE, FEMALE
    }
}
