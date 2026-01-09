package Task_09_01_26_CapgeminiQuestionList;

import java.util.Scanner;

public class GenerateFibonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        int first = 0;
        int second =1;
        System.out.print(first+" ");
        if(number>=1)
            System.out.print(second+" ");

        for (int i = 2; i < number; i++) {
            int next =first+second;
            System.out.print(next+" ");
            first= second;
            second=next;
        }

    }
}
