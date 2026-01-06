package Task_06_01_26.Level1;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age =new int[10];
        for(int i =0;i<age.length;i++){
            age[i]=input.nextInt();
        }
        for(int ele:age) {
            if(ele>0){
                if(ele>=18){
                    System.out.println("The student with the age "+ele+" can vote");
                }
                else {
                    System.out.println("The student with the age "+ele+" cannot vote");
                }
            }
            else{
                System.out.println("Invalid age, Enter positive number");
            }
        }
    }
}
