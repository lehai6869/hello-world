package ch6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam37 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("a*b");
        Matcher m1 = p1.matcher("aaaaab");
        Matcher m2 = p1.matcher("aaabbb");
        System.out.println(m1.matches());
        System.out.println(m2.matches());
        Pattern p2 = Pattern.compile("[/]+");
        String[] str = p2.split("张三//李四/王五/赵六/钱七");
        for (String s:str) {
            System.out.print(s+"\t\t");
        }
        System.out.println();
        System.out.println(str);
    }
}
