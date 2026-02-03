package Task_01_02_2026.List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NthElementfromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(findNthFromEnd(list, 1));
    }
    static String findNthFromEnd(LinkedList<String> numbers,int k){
        if(numbers.isEmpty()|| k<=0|| numbers==null){
            return null;
        }
        Iterator<String> fast = numbers.listIterator();
        Iterator<String> slow = numbers.listIterator();
        for (int i = 0; i < k; i++) {
            if(!fast.hasNext()) return null;
            fast.next();
        }

        while (fast.hasNext()){
            fast.next();
            slow.next();
        }
        return slow.next();
    }
}
