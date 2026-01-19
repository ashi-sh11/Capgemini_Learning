package Task_19_01_2026.Inheritance;

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal animal1 = new Dog("Buddy", 3);
        Animal animal2 = new Cat("Whiskers", 2);
        Animal animal3 = new Bird("Tweety", 1);

        // Calling overridden methods
        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}

class Animal{
    protected String name ;
    protected int age;
    void makeSound(){
        System.out.println("Animal class sound");
    }

    Animal(String name ,int age){
        this.name=name;
        this.age=age;
    }
}
class Dog extends Animal{

    @Override
    void makeSound(){
        System.out.println(name+" Dog barks");
    }
    Dog(String name ,int age){
        super(name,age);
    }
}

class Cat extends Animal{

    @Override
    void makeSound(){
        System.out.println(name+ " Cat Meow");
    }
    Cat(String name ,int age){
        super(name,age);
    }
}

class Bird extends Animal{

    @Override
    void makeSound(){
        System.out.println(name+" Bird chrip ");
    }
    Bird(String name ,int age){
        super(name,age);
    }
}