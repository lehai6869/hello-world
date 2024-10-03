package ch7;

import java.util.ArrayList;
import java.util.Iterator;

public class exam03 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");
        Iterator it = list.iterator();
//        while (it.hasNext()) {
//            Object obj = it.next();
//            if ("zhangsan".equals(obj)){
//                it.remove();
//            }else System.out.println(obj);
//        }
        for (Object obj:list)
            System.out.println(obj);
    }


}
