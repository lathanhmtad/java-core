package exercise;

import java.time.LocalDate;

public class Question {
    int id;
    String content;
    CategoryQuestion category;
    TypeQuestion typeQuestion;
    Account creator;
    LocalDate createdDate;
}
