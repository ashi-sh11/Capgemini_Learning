package Task_07_01_26.Level1;

import java.util.Scanner;

public class MaxNumberOfHandshake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}
