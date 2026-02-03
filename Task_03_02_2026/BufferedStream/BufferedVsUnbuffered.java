package Task_03_02_2026.BufferedStream;

import java.io.*;

public class BufferedVsUnbuffered {

    static void copyWithoutBuffer(String src, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        byte[] buffer = new byte[4096];
        int bytesRead;

        long start = System.nanoTime();

        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        long end = System.nanoTime();

        fis.close();
        fos.close();

        System.out.println("Unbuffered Time: " + (end - start) + " ns");
    }

    static void copyWithBuffer(String src, String dest) throws IOException {
        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(dest));

        byte[] buffer = new byte[4096];
        int bytesRead;

        long start = System.nanoTime();

        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        long end = System.nanoTime();

        bis.close();
        bos.close();

        System.out.println("Buffered Time: " + (end - start) + " ns");
    }

    public static void main(String[] args) throws IOException {

        String source = "largeFile.dat";

        copyWithoutBuffer(source, "copy_unbuffered.dat");
        copyWithBuffer(source, "copy_buffered.dat");
    }
}
