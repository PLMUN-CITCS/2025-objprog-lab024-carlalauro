// Person class
class Person {
    // Attributes
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display person's information
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class to test the Person class
public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", 30);
        Person person2 = new Person();

        person1.displayPerson();
        person2.displayPerson();
    }
}
