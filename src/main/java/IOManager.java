import java.io.*;

public class IOManager {
    public static void writeFile(String path, byte[] bytes, boolean append) {
        try (
                FileOutputStream fos = new FileOutputStream(path, append);
        ) {
            fos.write(bytes);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static byte[] readFile(String path) {
        try (
                FileInputStream fis = new FileInputStream(path)
        ) {
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            return bytes;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static void writeObject(String path, Object object, boolean append) {
        try (
                FileOutputStream fos = new FileOutputStream(path, append);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(object);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static Object readObject(String path) {
        try (
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}