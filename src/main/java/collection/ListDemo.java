package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Long"); // ["Long"]
        students.add("Huy");  // ["Long", "Huy"]
        students.add(0, "Đạt"); // ["Đạt", "Long", "Huy"]

        System.out.println("students.size() = " + students.size()); // 3

        System.out.println("students.isEmpty() = " + students.isEmpty()); // false

        System.out.println("students.get(0) = " + students.get(0)); // Đạt

        System.out.println("students.indexOf(\"Đạt\") = " + students.indexOf("Đạt")); // 0

        System.out.println("students.contains(\"Hà\") = " + students.contains("Hà")); // false

        students.remove(0);
        students.remove("Long");
        students.clear();

    }
}
