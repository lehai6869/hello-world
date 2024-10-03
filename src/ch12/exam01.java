package ch12;

public class exam01 {
    public static void main(String[] args) {
        MyThread01 myThread = new MyThread01();
        myThread.run();
        while(true) {
            System.out.println("main()方法在运行");
        }
    }
}

class MyThread01 {
    public void run() {
        while(true) {
            System.out.println("MyThread类的run()方法在运行");
        }
    }
}