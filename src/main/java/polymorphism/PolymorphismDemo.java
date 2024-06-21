package polymorphism;

import abstraction.Circle;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Tính đa hình
        // Student -> Person
        Student student = new Student("Huy", 24);
        student.run();

        Person person = student;
        person.run();

        // instanceof
        if(person instanceof Student) {
            Student s = (Student) person;
            s.study();
        }
        boolean isStudent = person instanceof Student;
        System.out.println("isStudent = " + isStudent);

        long n = 8000000000L;
        System.out.println("n = " + n);
        int m = (int) n;
        System.out.println("m = " + m);
        long k = m;
        System.out.println("k = " + k);
    }
}
