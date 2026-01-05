package Task_05_01_26;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startTable =input.nextInt();
        int endTable =input.nextInt();

        for (int num =startTable;num<=endTable;num++){
            System.out.println("multiplication table of "+num);
            for (int i =1;i<=10;i++){
                System.out.println(num+" * "+i +" = "+num*i);
            }
        }
    }
}
