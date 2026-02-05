package Task_04_02_2026.Generics;

public class Test {
    static <T> void print(T data){
        System.out.println(data);
    }
    public static void main(String[] args) {
        print(10);
        print("System");
    }
}
