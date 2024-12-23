package Assignment1.Task1;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    @Override
    public String toString() {
        String genderString = gender ? "Male" : "Female";
        return "I'm " + name + " " + surname + ", " + age + " years old. Gender is " + genderString + ".";
    }
}


