package Task_16_01_26.Level1;

public class Person {
    private String name;
    private int age;
    private String gender;

    Person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    Person(Person copyPerson){
        this.name=copyPerson.name;
        this.age = copyPerson.age;
        this.gender=copyPerson.gender;
    }
}
