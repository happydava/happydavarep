import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Person> payList = new ArrayList<>();

        Employee employee = new Employee("Nursultan", "Khaimuldin", "Manager", 360000.78);
        Employee employee2 = new Employee("Askar", "Khaimuldin", "Developer", 330000.00);
        Student student1 = new Student("David", "Khamitskiy", 3.8);
        Student student2 = new Student("Baktiar", "Kuanysh", 3.6);

        payList.add(employee);
        payList.add(employee2);
        payList.add(student1);
        payList.add(student2);
        Collections.sort(payList);
        printData(payList);
    }

    public static void printData(Iterable<Person> payList) {
        for (Person payable : payList) {
            System.out.println(payable.toString() + " earns " + payable.getPaymentAmount() + " tenge");
        }
    }
}