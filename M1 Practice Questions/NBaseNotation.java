package Task_09_03_2026;

public class NBaseNotation {
    static void main() {
        int num = 718;
        int base = 12;
        System.out.println(convertNumber(num,base));
    }
    static String convertNumber(int num ,int base){
        StringBuilder sb = new StringBuilder();
        while (num!=0){
            int rem = num%base;
            if(rem>9) sb.append((char)(rem-10+'A'));
            else sb.append(rem);
            num/=base;
        }
        return sb.reverse().toString();
    }
}
