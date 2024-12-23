package Assignment1.Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class School {
    private List<Person> members; // Список всех членов школы (студенты и учителя)

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person member) {
        if (member != null) {
            members.add(member);
            System.out.println(member.getName() + " has been added to the school.");
        }
    }

    public void sortMembersBySurname() {
        members.sort(Comparator.comparing(Person::getSurname));
    }

    public void displayStudents() {
        System.out.println("Students in School:");
        for (Person member : members) {
            if (member instanceof Student) { // Проверка, является ли объект студентом
                System.out.println(member);
            }
        }
    }

    public void displayTeachers() {
        System.out.println("Teachers in School:");
        for (Person member : members) {
            if (member instanceof Teacher) { // Проверка, является ли объект учителем
                System.out.println(member);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("School Members:\n");
        for (Person member : members) {
            sb.append(member.toString()).append("\n");
        }
        return sb.toString();
    }
}
