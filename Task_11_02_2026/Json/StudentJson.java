package Task_11_02_2026.Json;

import com.google.gson.Gson;

class Student {
    String name;
    int age;
    String[] subjects;

    Student(String name, int age, String[] subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }
}

public class StudentJSONExample {
    public static void main(String[] args) {

        Student student = new Student(
                "Aman Sharma",
                20,
                new String[]{"Math", "Computer Science", "English"}
        );

        Gson gson = new Gson();
        String json = gson.toJson(student);

        System.out.println(json);
    }
}
