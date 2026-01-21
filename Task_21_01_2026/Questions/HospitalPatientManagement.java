package Task_21_01_2026.Questions;

import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return name + " (" + age + ")";
    }
}

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();

    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 5000;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

class OutPatient extends Patient {
    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 800;
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = List.of(
                new InPatient(1, "Amit", 40),
                new OutPatient(2, "Rohit", 25)
        );

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails() + " Bill: " + p.calculateBill());
        }
    }
}
