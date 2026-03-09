package Task_09_03_2026;

public class ProductSmallestPair {
    static void main() {
        int[] arr ={1 ,8 ,2 ,3 ,5 ,6};
        int[] arr1 = {5,4,2,7,3} ;
        int sum = 9;
        System.out.println(findProduct(arr1,sum));
    }
    static  int findProduct(int[] arr ,int sum){
        if(arr ==null || arr.length<2) return -1;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<smallest){
                secondSmallest =smallest;
                smallest=arr[i];
            }
            else if(secondSmallest>arr[i] && arr[i] != smallest){
                secondSmallest =arr[i];
            }
        }
        if(secondSmallest+smallest<sum){
            return smallest*secondSmallest;
        }
        return 0;
    }
}
