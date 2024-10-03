package ch9;
class Person2 {
    private String name;
    private int age;

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
public class exam02 {
    public static void main(String[] args) {
        Class<?> c=null;
        try {
            c=Class.forName("ch9.Person2");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Person2 per =null;
        try {
            per = (Person2)c.newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        per.setName("zhangsan");
        per.setAge(20);
        System.out.println(per);
    }
}
