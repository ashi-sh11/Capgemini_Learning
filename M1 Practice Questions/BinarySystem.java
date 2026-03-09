package Task_09_03_2026;

public class BinarySystem {
    static void main() {
        String str = "1C0C1C1A0B1";
        System.out.println(findBinary(str));
    }

    private static int findBinary(String str) {
        if(str ==null || str.isEmpty()) return -1;
        int res = str.charAt(0)-'0';
        for (int i = 2; i < str.length(); i+=2) {
            char ch = str.charAt(i-1);
            int second = (int) str.charAt(i) -'0';
            if(ch == 'A') {
              res = res&second;
            }
            else if(ch =='B'){
                res =res|second;
            }
            else if(ch =='C') {
                res =res^second;
            }
        }
        return res ;
    }
}
