package ch10;
import  java.io.*;

public class exam14 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("ch10/reader.txt");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int ch=0;
        while(ch  != -1) {
            try {
                ch = reader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println((char)ch);
        }
        try {
            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
