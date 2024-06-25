package utils;

import java.io.FileInputStream;
import java.io.IOException;

public class IOManager {
    public static byte[] readFile(String path) {
        try(
                FileInputStream fis = new FileInputStream(path);
                ) {
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            return bytes;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
