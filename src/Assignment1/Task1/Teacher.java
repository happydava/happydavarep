package Assignment1.Task1;

public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private double salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, double salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("_____________________________________________________TEACHERS_____________________________________________________");
            System.out.println("Salary of " + getName() +  " increased by " + percentage + "%. New salary: " + salary);
        } else {
            System.out.println("Percentage must be positive.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }

    public String getSubject() {
        return subject;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public double getSalary() {
        return salary;
    }
}
