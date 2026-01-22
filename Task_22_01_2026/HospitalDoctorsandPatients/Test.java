package Task_22_01_2026.HospitalDoctorsandPatients;

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient p) {
        System.out.println(name + " consulting " + p.getName());
    }
}

public class Test {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Sharma");
        Patient p = new Patient("Amit");

        d.consult(p);
    }
}
