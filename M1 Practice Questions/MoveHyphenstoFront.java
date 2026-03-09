package Task_09_03_2026;

public class MoveHyphenstoFront {
    static void main() {
        String str ="Move-Hyphens-to-Front";
        System.out.println(moveHyphen(str));
    }
    static String moveHyphen(String str){
        int count=0;
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if(ch == '-'){
                count ++;
            }
            else sb.append(ch);
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<count;i++)
            result.append("-");

        result.append(sb);
        return result.toString();
    }
}
