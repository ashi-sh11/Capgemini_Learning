package Task_07_03_2026_M1_Practices_Questions;

public class ReplaceAtoB {
    static void main() {
        String str = "abbccaab";
        String res = replace(str);
        System.out.println(res);
    }
    static String replace(String str){
        char[] charArray = str.toCharArray();
        String ans ="";
        for (char ch : charArray) {
            if( ch == 'a'){
                ch ='b';
            }
            else if(ch == 'b')
                ch ='a';
            ans +=ch;
        }
        return ans;
    }
}
