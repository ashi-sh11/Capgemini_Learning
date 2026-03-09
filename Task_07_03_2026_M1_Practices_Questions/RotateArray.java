package Task_07_03_2026_M1_Practices_Questions;

public class RotateArray {
    static void main() {
        int[] arr = {1,2,3,4,5};
        int  k =3;
        rotate(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+" ");

        }
    }
    static void  rotate(int[] arr, int  k){
        reverse(arr,0,arr.length-1);
        reverse(arr ,0,k-1);
        reverse(arr,k, arr.length-1);
    }

    static void  reverse (int[] arr ,int pos1 ,int pos2){
        while (pos1<pos2){
            int temp = arr[pos1];
            arr[pos1]= arr[pos2];
            arr[pos2]=temp;
            pos1++;
            pos2--;
        }
    }
}
