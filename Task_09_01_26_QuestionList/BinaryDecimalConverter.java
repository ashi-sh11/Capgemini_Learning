package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class BinaryDecimalConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.print("Enter a binary number: ");
            String binary = input.nextLine();
            int decimal = binaryToDecimal(binary);
            System.out.println("Decimal value = " + decimal);

//            System.out.print("Enter a decimal number: ");
//            int decimal = input.nextInt();
//            String binary = decimalToBinary(decimal);
//            System.out.println("Binary value = " + binary);
    }
    static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    static String decimalToBinary(int number) {
        if (number == 0) return "0";
        String binary = "";
        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }
        return binary;
    }
}
