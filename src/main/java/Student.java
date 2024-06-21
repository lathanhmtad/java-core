public class Student extends Person {
    double score;

    public Student(int age, int id, String name, double score) {
        super(age, id, name);
        this.score = score;
    }

    int test() {
        return 1;
    }
}
