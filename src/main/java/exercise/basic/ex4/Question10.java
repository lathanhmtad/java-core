package exercise.basic.ex4;

public class Question10 {
    public static void main(String[] args) {
        /*
        Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
        Nếu có xuất ra “OK” ngược lại “KO”.
        Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
        */
        Exercise4 exercise4 = new Exercise4();
        System.out.println(exercise4.question10("WORD3", "3DYOW"));
        System.out.println(exercise4.question10("word", "drow"));
    }
}
