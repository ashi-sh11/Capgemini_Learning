package Task_31_01_2026;

public class CountingSortAges {

    public static void countingSort(int[] ages) {
        int min = 10, max = 18;
        int range = max - min + 1;

        int[] count = new int[range];

        for (int age : ages)
            count[age - min]++;

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i]-- > 0) {
                ages[index++] = i + min;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 12};

        countingSort(ages);

        for (int a : ages)
            System.out.print(a + " ");
    }
}
