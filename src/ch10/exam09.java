package ch10;

import java.io.*;

public class exam09 {
    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("src/ch10/reader.txt");
        int b = 0;
        while (true) {
            b = in.read();
            if (b == -1) {
                break;
        }
        System.out.println(b);
    }
        in.close();
    }

}
