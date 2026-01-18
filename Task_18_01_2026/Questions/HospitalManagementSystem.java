package Task_18_01_2026.Questions;

public class HospitalManagementSystem {
        public static void main(String[] args) {

            Patient patient1 =new Patient("Rohit", 30, "Fever", 201);
            Patient patient2 =new Patient("Neha", 25, "Cold", 202);

            System.out.println("=== Patient Details ===");
            Patient.displayIfValidPatient(patient1);
            System.out.println("---------------------");
            Patient.displayIfValidPatient(patient2);

            System.out.println();
            Patient.getTotalPatients();
        }
}

class Patient {

    private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        totalPatients++;
    }

    public void displayPatientDetails() {
        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Patient Name  : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Ailment       : " + ailment);
        System.out.println("Patient ID    : " + patientID);
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public static void displayIfValidPatient(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj;
            patient.displayPatientDetails();
        } else {
            System.out.println("Invalid object. Not a Patient.");
        }
    }
}
