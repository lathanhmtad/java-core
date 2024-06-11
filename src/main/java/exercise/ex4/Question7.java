package exercise.ex4;

import java.util.Random;

public class Question7 {
    public static void main(String[] args) {
        // Lấy ngẫu nhiên 1 số có 3 chữ số.
        Random random = new Random();

        // 100 <= n < 1000
        System.out.println(random.nextInt(1000 - 100) + 100);

    }
}
