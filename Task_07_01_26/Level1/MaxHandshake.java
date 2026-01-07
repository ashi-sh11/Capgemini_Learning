package Task_07_01_26.Level1;

import java.util.Scanner;

public class MaxHandshake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Maximum number of handshakes : "+handshake(number));
    }
    static int handshake(int number){
        int result = number * (number-1) /2;
        return result;
    }
}
