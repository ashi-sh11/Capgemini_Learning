package Task_30_01_2026.InputStreamReader.StringComparison;

public class Comparison {
    static String buffer(){
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < 10000000; i++) {
            sBuffer.append("Hello");
        }
        return sBuffer.toString();
    }

    static String builder(){
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            sBuilder.append("Hello");
        }
        return sBuilder.toString();
    }
    public static void main(String[] args) {
        long startBuffer = System.nanoTime();
        buffer();
        long endBuffer = System.nanoTime();

        long startBuilder = System.nanoTime();
        builder();
        long endBuilder = System.nanoTime();
        System.out.println("Time Taken by StringBuffer : "+(endBuffer-startBuffer)/1_000_000.0 +" ms" );
        System.out.println("Time Taken by StringBuilder : "+(endBuilder-startBuilder)/1_000_000.0 +" ms" );
    }
}
