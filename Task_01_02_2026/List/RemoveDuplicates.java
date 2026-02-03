package Task_01_02_2026.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,2,2,3,4,5));
        List<Integer> array = remove(arrayList);
        System.out.println(array.toString());
    }
    static List<Integer> remove(List<Integer> list){
        List<Integer> li = new ArrayList<>();
        if(list.isEmpty()) return list;
        for (Integer integer : list) {
            if (!li.contains(integer)) {
                li.add(integer);
            }
        }
        return li;
    }
}
