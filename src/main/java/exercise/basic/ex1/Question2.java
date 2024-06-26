package exercise.basic.ex1;

import java.util.Random;

public class Question2 {
    public static void main(String[] args) {
        /*
        Question 2:
        Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)
         */
        Random random = new Random();
        int n = random.nextInt(100000);
        String result = String.format("%05d", n);
        System.out.println("result = " + result);
    }
}
