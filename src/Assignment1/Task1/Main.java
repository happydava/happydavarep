package Assignment1.Task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("__________________________________________________ TASK 1 __________________________________________________");
        Person person = new Person("David", "Khamitskiy", 18, true);
        System.out.println(person.toString());
        System.out.println("I'm a headman of group SE-2412");
        System.out.println("--------------------------------------------------- TASK 2 ---------------------------------------------------");
        System.out.println("Students: ");
        Student student1 = new Student("Tairkhan", "Yermek", 18, true);
        student1.addGrade(78);
        student1.addGrade(89);
        student1.addGrade(99);
        student1.addGrade(51);
        System.out.println(student1);
        System.out.println("GPA of " + student1.getName() + ": " + student1.calculateGPA());
        //_____________________________
        Student student2 = new Student("Dmitriy", "Belyaikin", 18, true);
        student2.addGrade(78);
        student2.addGrade(89);
        student2.addGrade(75);
        student2.addGrade(63);
        student2.addGrade(82);
        System.out.println(student2);
        System.out.println("GPA of " + student2.getName() + ": " + student2.calculateGPA());
        //____________________________
        Student student3 = new Student("Bibarys", "Kadirbay", 18, true);
        student3.addGrade(100);
        student3.addGrade(99);
        student3.addGrade(95);
        student3.addGrade(98);
        student3.addGrade(100);
        student3.addGrade(96);
        student3.addGrade(97);
        System.out.println(student3);
        System.out.println("GPA of " + student3.getName() + ": " + student3.calculateGPA());
        System.out.println("Teachers: ");
//_______________________________________________________________________________________________________________________________________________________________________________________//
        Teacher teacher1 = new Teacher("Nursultan", "Khaimuldin", 36, true, "Object-Oriented Programming", 25, 500000);
        System.out.println(teacher1);
        teacher1.giveRaise(10);
        System.out.println("Current salary of " + teacher1.getName() + " " + teacher1.getSurname() + ": " + teacher1.getSalary());
        Teacher teacher2 = new Teacher("Adilet", "Duman", 38, true, "Discrete Mathematics", 15, 400000);
        System.out.println(teacher2);
        teacher2.giveRaise(15);
        System.out.println("Current salary of " + teacher2.getName() + " " + teacher2.getSurname() + ": " + teacher2.getSalary());
    }
}
