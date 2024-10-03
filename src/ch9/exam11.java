package ch9;
import java.lang.reflect.Method;
class Person11 {
    private String name;
    private int age;

    /*
    * 构造函数要全
     */
    public Person11() {
    }

    public Person11(String name) {
        this.name = name;
    }

    public Person11(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person11{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class exam11 {
    public static void main(String[] args) {
        Class<?> c = null;
        Object obj = null;
        try {
            c = Class.forName("ch9.Person11");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            obj = c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        setter(obj,"name","zhangsan",String.class);
        setter(obj,"age",18,int.class);
        System.out.print("Name:");
        getter(obj,"name");
        System.out.print("Age:");;
        getter(obj,"age");
    }

    public static void setter(Object obj,String att,Object value,Class<?> type) {
        try {
            Method met = obj.getClass().getMethod("set"+initStr(att),type);
            met.invoke(obj,value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void getter(Object obj,String att) {
        try {
            Method met = obj.getClass().getMethod("get"+initStr(att));
            System.out.println(met.invoke(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String initStr(String old) {
        String str = old.substring(0,1).toUpperCase()+old.substring(1);
        return str;
    }
}
