package Task_05_01_26;

import java.util.Scanner;

public class RocketCountdownUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countDown =input.nextInt();

        for (int count=countDown;count>=1;count--){
            System.out.println(count);
        }
    }
}
