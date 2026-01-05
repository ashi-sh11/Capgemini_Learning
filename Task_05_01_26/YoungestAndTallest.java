package Task_05_01_26;

import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int amarAge =input.nextInt();
        int akbarAge =input.nextInt();
        int anthonyAge =input.nextInt();

        float amarHeight =input.nextFloat();
        float akbarHeight =input.nextFloat();
        float anthonyHeight =input.nextFloat();

        //Find Smallest age
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is the youngest friend.");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is the youngest friend.");
        } else {
            System.out.println("Anthony is the youngest friend.");
        }

        // Find tallest
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is the tallest friend.");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is the tallest friend.");
        } else {
            System.out.println("Anthony is the tallest friend.");
        }
    }
}
