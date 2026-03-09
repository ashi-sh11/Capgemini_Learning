package Task_07_03_2026_M1_Practices_Questions;

public class FindSubstring {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "World";
        System.out.println(findSubstring(str1,str2));
    }
    static int findSubstring(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        for(int i=0;i<=n-m;i++){
            int j;

            for(j=0;j<m;j++){

                if(str1.charAt(i+j)!=str2.charAt(j))
                    break;
            }
            if(j==m)
                return i;
        }
        return -1;
    }
}