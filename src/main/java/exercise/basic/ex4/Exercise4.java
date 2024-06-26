package exercise.basic.ex4;

public class Exercise4 {
    String question10(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();

        if (length1 != length2) return "KO";

        int length = length1 % 2 == 0 ? length1 / 2 : length1 / 2 + 1;

        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(length2 - i - 1))
                return "KO";
        }
        return "OK";
    }


    String question15(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        String res = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty())
                res = res + words[i] + " ";
        }
        return res.substring(0, res.length() - 1);
    }
}
