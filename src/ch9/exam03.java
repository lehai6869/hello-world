package ch9;

import java.lang.reflect.Constructor;

class Person3 {
    private String name;
    private int age;
    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class exam03 {
    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c=Class.forName("ch9.Person3");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Person3 per = null;
        Constructor<?> cons[] =null;
        cons=c.getConstructors();
        try {
            per = (Person3)cons[0].newInstance("zhangsan",30);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(per);
    }
}
