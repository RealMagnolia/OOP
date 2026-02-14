package lab1;

import java.util.ArrayList;
import java.util.Scanner;
import practice2.Student;

public class GradebookTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<String> prereqs = new ArrayList<>();
        prereqs.add("Algorithms and Data Structures");

        Course course = new Course(
                "CS101",
                "Object-Oriented Programming",
                5,
                prereqs
        );

        Gradebook gradebook = new Gradebook(course);

        System.out.print("How many students? ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Name: ");
            String name = s.next();

            System.out.print("ID: ");
            int id = s.nextInt();

            System.out.print("Year of study: ");
            int yos = s.nextInt();

            System.out.print("Grade (0–100): ");
            double grade = s.nextDouble();

            Student st = new Student(name, id, yos, grade);
            gradebook.addStudent(st);
        }

        System.out.println();
        gradebook.displayGradeReport();
    }
}
