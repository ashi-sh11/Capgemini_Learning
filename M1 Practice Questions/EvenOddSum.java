package Task_09_03_2026;

public class EvenOddSum {
    static void main() {
        int[] arr ={1 ,8 ,0 ,2 ,3 ,5 ,6};
        int[] arr1={3 ,2 ,1, 7 ,5 ,4};
        int result = findSecondSmallestOnOddPositons(arr1)+findSecondLargestOnEvenPositons(arr1);
        System.out.println(result);
    }
    static int findSecondLargestOnEvenPositons(int[] arr){
        if(arr ==null || arr.length<=3) return 0;
        int largest = Integer.MIN_VALUE;
        int secondLargest=0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0 && arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(i%2==0 && secondLargest<arr[i] && arr[i] != largest){
                secondLargest =arr[i];
            }
        }
        return secondLargest;
    }
    static int findSecondSmallestOnOddPositons(int[] arr){
        if(arr ==null || arr.length<=3) return 0;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest =0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2!=0 && arr[i]<smallest){
                secondSmallest =smallest;
                smallest=arr[i];
            }
            else if(i%2!=0 && secondSmallest>arr[i] && arr[i] != smallest){
                secondSmallest =arr[i];
            }
        }
        return secondSmallest;
    }
}
