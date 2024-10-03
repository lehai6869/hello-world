package ch7;

import java.util.*;

public class exam01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");

        System.out.println("集合的长度："+ list.size());
        System.out.println("第2个元素："+ list.get(1));
        list.remove(3);
        list.set(1,"lisi2");
        System.out.println("替换索引位1的元素为李四2："+list);

    }
}
