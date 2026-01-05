package Task_05_01_26;

import java.util.Scanner;

public class TotalZaraBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();
        double bonus = 0.0;
        if(yearsOfService>=5){
            bonus =salary *5/100;
        }
        System.out.println("The bonus amount is "+bonus);
    }
}
