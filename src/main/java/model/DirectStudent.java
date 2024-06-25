package model;

public class DirectStudent extends Student {
    private AwardLevel awardLevel;
    private String awardName;
    private int yearWonAward;
    private Classification awardClassification;


    enum AwardLevel {
        NATION, INTERNATIONAL
    }

    enum Classification {
        FIRST, SECOND, THIRD, ENCOURAGE
    }
}
