package Task_07_01_26.Level2;

import java.util.Scanner;

public class BMIChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] studentList = new double[10][3];
        for(int i =0;i<studentList.length;i++) {
            studentList[i][0] = input.nextDouble();
            double heightInCm = input.nextDouble();
            studentList[i][1] =convertCmToMeter(heightInCm);
        }
        calculateBMI(studentList);
        String[] status = determineBMIStatus(studentList);
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    (i + 1),
                    studentList[i][0],
                    studentList[i][1],
                    studentList[i][2],
                    status[i]);
        }


    }

    private static double convertCmToMeter(double heightInCm) {
        return heightInCm /100.0;
    }

    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1];
            double bmi = weight / (heightMeters * heightMeters);
            data[i][2] = bmi;
        }

    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}
