package model;

import java.time.LocalDate;

public class DirectStudent extends Student {
    private AwardLevel awardLevel;
    private String awardName;
    private int yearWonAward;
    private Classification awardClassification;

    public DirectStudent(String fullName, LocalDate dob, Gender gender, String address, String homeTown, String phone, String email,
                         AwardLevel awardLevel, String awardName, int yearWonAward, Classification awardClassification) {
        super(fullName, dob, gender, address, homeTown, phone, email);
        this.awardLevel = awardLevel;
        this.awardName = awardName;
        this.yearWonAward = yearWonAward;
        this.awardClassification = awardClassification;
    }

    enum AwardLevel {
        NATION, INTERNATIONAL
    }

    enum Classification {
        FIRST, SECOND, THIRD, ENCOURAGE
    }
}
