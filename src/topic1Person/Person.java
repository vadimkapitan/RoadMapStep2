package topic1Person;

public class Person {
    private String name;
    private int age;

    public void displayInfo() {
        System.out.println("Name: " + name + "\n" + "Age: " + age);
    }

    public String displayInfoTwo() {
        return "Name: " + name;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
