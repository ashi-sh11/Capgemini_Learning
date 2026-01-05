package Task_05_01_26;

import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countDown =input.nextInt();

        while (countDown>=1){
            System.out.println(countDown);
            countDown--;
        }
    }
}
