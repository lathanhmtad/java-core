package exercise.basic.ex4;

import java.util.Random;

public class Question3 {
    public static void main(String[] args) {
        /* Khai báo 1 array bao gồm các tên của các bạn trong lớp,
        sau đó in ngẫu nhiên ra tên của 1 bạn */
        String names[] = {"Duy", "Vinh", "Hoa", "Du"};

        Random random = new Random();
        System.out.println(names[random.nextInt(names.length)]);
    }
}
