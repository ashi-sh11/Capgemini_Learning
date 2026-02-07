package Task_06_02_2026.Regex.List;

import java.util.List;

public class ListManager {
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }
    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }
    public int getSize(List<Integer> list) {
        return list.size();
    }
}
