package exercise.ex2.q2;

/*
Question 2:
Tạo class Student có property id,
name hãy thiết kế class Student sao cho khi đã
khởi tạo Student thì id là không thể thay đổi
trong suốt quá trình chạy chương trình chương trình
 */
public class Student {
    private final int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
