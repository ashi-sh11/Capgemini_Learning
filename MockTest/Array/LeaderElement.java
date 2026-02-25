package MockTest.Array;
import java.util.ArrayList;
import java.util.List;
public class LeaderElement {
    static void main() {
        int[] arr = {16,17,4,3,5,2};
        List<Integer> list = findLeader(arr);
        System.out.println("Leader elements are : "+list.reversed().toString());
    }
    public static List<Integer> findLeader(int[] arr){
        List<Integer> list = new ArrayList<>();
        list.add(arr[arr.length-1]);
        int maxElement = arr[arr.length-1];
        for (int i = arr.length-1; i >=0; i--) {
            if(arr[i]>maxElement ){
                list.add(arr[i]);
                maxElement=arr[i];
            }
        }
        return list;
    }
}
