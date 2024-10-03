package ch9;
interface China {
    public static final String NATION = "CHINA";
    public static final String AUTHOR = "zhangsan";
}
class Person5 implements China {
    private String name;
    private int age;

    public Person5(String name, int age) {
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
        return "Person5{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class exam05 {
    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("ch9.Person5");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class<?> cons[] = c.getInterfaces();
        for (int i=0;i<cons.length;i++) {
            System.out.println(cons[i].getName());
        }
    }
}
