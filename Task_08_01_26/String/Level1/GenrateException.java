package Task_08_01_26.String.Level1;

public class GenrateException {
    public static void main(String[] args) {
        String str1 =null;
        String str2 = "hello" ;
        System.out.println("---- Generating NullPointerException ----");

        String resultString = concatTwoString(str1, str2);
        System.out.println(resultString);// This will crash the program

        System.out.println("------Handling NullPointerException ------");

        String resultString2 = concatTwoStringWithExceptionHandle(str1, str2);
        System.out.println(resultString2);
    }

    private static String concatTwoString(String str1, String str2) {
        return str1.concat(str2);
    }

    private static String concatTwoStringWithExceptionHandle(String str1, String str2) {
        String result ="";
        try {
             result =str1.concat(str2);
        }catch (NullPointerException e){
            System.out.println("Excetion msg "+e.getMessage());
        }
        return result;
    }

}
