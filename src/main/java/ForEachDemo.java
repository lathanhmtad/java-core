public class ForEachDemo {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 9, 2, 5, 1};
        for(int num : numbers) {
            System.out.printf("num = %d%n", num);
            // System.out.println("num = " + num);
        }
    }
}
