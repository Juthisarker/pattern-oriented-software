package Sorter;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("S12345", "Alice"));
        students.add(new Student("S54321", "Bob"));

        for (Student student : students) {
            System.out.println(student);
        }
        Student student1 = new Student("S12345", "Alice");
        Student student2 = new Student("S12345", "Alice");
        System.out.println("Are student1 and student2 equal? " + student1.equals(student2));
    }
}
