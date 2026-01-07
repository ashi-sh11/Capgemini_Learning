package Task_07_01_26.Level2;

import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later");
            return;
        }
        boolean isLeap = isLeapYear(year);
        if (isLeap) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is NOT a Leap Year");
        }

    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) ||
                (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
