package lesson3.seminar3.animals;



public abstract class Animal {

    protected static int id;
    private String type;
    private String name;
    private String color;
    private int age;



    public Animal(String name, String color, int age, String type) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.color = color;
    }


    @Override
    public String toString() {
        return "ID: " + id +
                " Type: " + type +
                " name: " + name +
                " age: " + age +
                " Color: " + color + "\n";
    }

}
