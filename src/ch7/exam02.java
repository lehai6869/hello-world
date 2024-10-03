package ch7;

import java.util.*;
public class exam02 {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("zhangsan");
        link.add("lisi");
        link.add("wangwu");
        link.add("zhaoliu");

        System.out.println("集合的元素："+ link.toString());
        link.add(3,"student");
        link.addFirst("First");
        System.out.println(link);
        System.out.println(link.getFirst());
        link.remove(3);
        link.removeFirst();
        System.out.println(link);

    }
}
