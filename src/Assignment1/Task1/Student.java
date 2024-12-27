package Assignment1.Task1;
import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = Person.getNextID();
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Incorrect value");
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + " My ID is " + studentID + ".";
    }
}

