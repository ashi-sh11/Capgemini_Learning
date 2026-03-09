package Task_09_03_2026;

public class RatsFood {
    static void main() {
        int rats = 7;
        int foodForEachRat = 2;
        int[] arr ={ 2 ,8, 3 ,5 ,7, 4, 1, 2 };
        System.out.println(solution(arr,rats,foodForEachRat));
    }
    static int solution(int[] arr , int rats,int food){
        int sum =0;
        if(arr == null){
            return -1;
        }
        if(rats == 0)
            return 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum >= rats*food){
                return i+1;
            }
        }
        return 0;
    }
}
