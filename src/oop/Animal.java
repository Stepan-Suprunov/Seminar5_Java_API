package oop;

public class Animal {
    public String type;
    public String color;
    public int legsCount;
    public int age;

    public Animal () {
        this.type = "cat";
        this.color = "white";
        this.legsCount = 4;
        this.age = 1;
    }

    public Animal(String type) {
        this.type = type;
        this.color = "white";
        this.legsCount = 0;
        this.age = 1;
    }

    public Animal(String type, String color, int legsCount, int age) {
        this.type = type;
        this.color = color;
        this.legsCount = legsCount;
        this.age = age;
    }

//    Animal animal = new Animal("dog", "black", 4, 2);

    public void eat() {
        System.out.println("Животное кушает");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", legsCount=" + legsCount +
                ", age=" + age +
                '}';
    }
}
