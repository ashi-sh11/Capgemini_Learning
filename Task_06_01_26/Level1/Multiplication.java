package Task_06_01_26.Level1;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] table =new int[10];
        for(int i =1;i<=table.length;i++){
            table[i-1]=number*i;
        }
        for(int i =1;i<=table.length;i++) {
            System.out.println(number+" * "+i+" = "+table[i-1]);
        }
    }
}
