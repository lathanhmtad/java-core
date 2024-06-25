import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class IOStreamDemo {
    public static void main(String[] args) {
        String path = "src/main/resources/abc.txt";

        byte[] bytes = "Java core".getBytes(StandardCharsets.UTF_8);
        // byte[] bytes = {78, 103, 117, 121, -31, -69, -123, 110, 32, -60, -112, -60, -125, 110, 103, 32, 68, 117, 121, 32, -60, -112, -31, -70, -71, 111, 32, 116, 114, 117, 97, 32};
        IOManager.writeFile(path, bytes, true);
        IOManager.writeFile(path, bytes, true);
        IOManager.writeFile(path, bytes, false);

        byte[] output = IOManager.readFile(path);
        String content = new String(output);
        System.out.println("content = " + content);


        Account account = new Account(1, "khoa.nv", "123456");
        IOManager.writeObject(path, account, false);
        Account savedAccount = (Account) IOManager.readObject(path);
        System.out.println("savedAccount = " + savedAccount);


    }
}
