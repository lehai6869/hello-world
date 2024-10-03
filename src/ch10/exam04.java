package ch10;

import java.io.File;

public class exam04 {
    public static void main(String[] args) {
        File file = new File("src/Hello.java");
        //File file = new File("src");
        if (file.isDirectory()) {
            String [] names = file.list();
            for (String name:names) {
                System.out.println(name);
            }
        }else {
            System.out.println(file.getPath()+"是一个文件");
        }

    }
}
