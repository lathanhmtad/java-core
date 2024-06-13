import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        // Tạo số nguyên ngẫu nhiên
        int n = random.nextInt();
        System.out.println("n = " + n);

        // 0 <= n < max
        int m = random.nextInt(100);
        System.out.println("m = " + m);

        // min <= k <= max
        int min = 1;
        int max = 10;
        System.out.println("------------");
        for (int i = 0; i < 100; i++) {
            int k = min + random.nextInt(max - min + 1);
            System.out.println("k = " + k);
        }

        // Lấy ngẫu nhiên phần tử trong mảng
        String[] fruits = {"Cam", "Quýt", "Táo", "Dứa"};
        int index = random.nextInt(fruits.length);
        // System.out.println("fruits[" + index + "] = " + fruits[index]);
        System.out.printf("fruits[%d] =  %s%n", index, fruits[index]);

        System.out.println(random.nextExponential());

        // -7 <= n <= -5
        // 5 <= n <= 7
        System.out.println((random.nextInt(7 + 1 - 5) + 5) * -1);
    }
}
