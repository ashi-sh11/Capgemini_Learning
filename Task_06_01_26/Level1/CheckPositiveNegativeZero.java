package Task_06_01_26.Level1;

import java.util.Scanner;

public class CheckPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number =new int[5];
        for(int i =0;i<number.length;i++){
            number[i]=input.nextInt();
        }

        for(int i =0;i<number.length;i++) {
            if(number[i]>0){
                if(number[i] % 2==0){
                    System.out.println(number[i]+" is even number");
                }
                else{
                    System.out.println(number[i]+" is odd number");
                }
            }
            else if(number[i]<0){
                System.out.println(number[i]+" is Negative number.");
            }
            else{
                System.out.println(number[i]+" is Zero.");
            }
        }
        if(number[0]==number[number.length-1]){
            System.out.println("First and last number of array are equal");
            System.out.println("First element : "+number[0]+"  Last element : "+number[number.length-1]);
        }
        else if(number[0]>number[number.length-1]){
            System.out.println("First element is greater than last element");
            System.out.println("First element : "+number[0]+"  Last element : "+number[number.length-1]);
        }
        else {
            System.out.println("First element is less than last element");
            System.out.println("First element : "+number[0]+"  Last element : "+number[number.length-1]);
        }
    }
}
