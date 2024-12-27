package Assignment1.Task1;

import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = Person.getNextID(); // Получение уникального ID из класса Person
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Error");
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double totalGPA = 0;
        for (int grade : grades) {
            totalGPA += convertGradeToGPA(grade);
        }
        double gpa = totalGPA / grades.size();
        return Math.round(gpa * 10.0) / 10.0;
    }

    private double convertGradeToGPA(int grade) {
        if (grade >= 90) {
            return 4.0;
        } else if (grade >= 80) {
            return 3.0;
        } else if (grade >= 70) {
            return 2.0;
        } else if (grade >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " My ID is " + studentID + ". GPA: " + calculateGPA();
    }

    public static void main(String[] args) {
        Student student = new Student("John", "Doe", 20, true);
        student.addGrade(80);
        student.addGrade(90);
        student.addGrade(70);
        student.addGrade(100);
        System.out.printf("Student GPA: %.1f%n", student.calculateGPA());
    }
}
