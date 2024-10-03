package ch4;
interface Animal {
    int ID = 1;
    String NAME = "牧羊犬";
    void shout();
    public void info();
    static int getID() {
        return Animal.ID;
    }
}
interface  Action {
    public void eat();
}

class Dog implements Animal,Action {
    public void eat() {
        System.out.println("喜欢吃骨头");
    }
    public void shout() {
        System.out.println("汪汪......");
    }
    public void info() {
        System.out.println("名称："+ NAME);
    }
}
public class exam11 {
    public static void main(String[] args) {
        System.out.println("编号："+ Animal.getID());
        Dog dog = new Dog();
        dog.info();
        dog.shout();
        dog.eat();
    }
}
