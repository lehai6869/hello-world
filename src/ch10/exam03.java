package ch10;

import java.io.File;
import  java.io.IOException;

public class exam03 {
    public static void main(String[] args) throws IOException{
        File f= File.createTempFile("ailehai-",".txt");
        f.deleteOnExit();
        System.out.println("f是否为文件："+f.isFile());
        System.out.println("f的相对路径："+f.getPath());
    }
}
