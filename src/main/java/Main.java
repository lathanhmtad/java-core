public class Main {
    public static void main(String[] args) {
        Person person = new Person(18, 1, "Duy");
        Student student = new Student(18, 2, "Long", 4.5);

        Person person1 = (Person) student;
        Student student1 = (Student) person1;
        boolean isTrue = person1 instanceof Student;
        System.out.println("isTrue = " + isTrue);
    }
}
