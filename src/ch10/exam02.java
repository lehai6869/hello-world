package ch10;

import java.io.File;
public class exam02 {
    public static void main(String[] args) {
        File file = new File("src\\test.txt");
        System.out.println("文件是否存在："+file.exists());
        System.out.println("文件名："+file.getName());
        System.out.println("文件大小："+file.length()+"bytes");
        System.out.println("文件相对路径："+file.getPath());
        System.out.println("文件绝对路径："+file.getAbsolutePath());
        System.out.println("文件的父级对象是否为文件："+file.isFile());
        System.out.println("文件删除是否成功："+file.delete());
    }

}
