package Task_19_01_2026.HybridInheritance;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Ramesh", 101, "Indian Cuisine");
        Worker waiter = new Waiter("Suresh", 201, 5);
        System.out.println("=== Chef Details ===");
        ((Chef) chef).displayDetails();
        chef.performDuties();

        System.out.println("\n=== Waiter Details ===");
        ((Waiter) waiter).displayDetails();
        waiter.performDuties();
    }
}


class Person{
    String name;
    int id;
    Person(String name,int id){
        this.name=name;
        this.id=id;
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

// Interface
interface Worker {
    void performDuties();
}


class Chef extends Person implements Worker {
    private String specialization;

    public Chef(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("Role : Chef");
        System.out.println("Specialization : " + specialization);
        System.out.println("Duties : Preparing and cooking food");
    }
}


class Waiter extends Person implements Worker {
    private int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Role : Waiter");
        System.out.println("Tables Assigned : " + tableCount);
        System.out.println("Duties : Serving food and assisting customers");
    }
}
