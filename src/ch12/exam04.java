package ch12;

import java.util.concurrent.*;

class MyThread04 implements Callable<Object> {
    public Object call() throws Exception {
        int i=0;
        while (i++<5) {
            System.out.println(Thread.currentThread().getName()+"的call()方法在运行");
        }
        return i;
    }

}
public class exam04 {
    public static void main(String[] args) throws InterruptedException,ExecutionException{
        MyThread04 myThread = new MyThread04();
        FutureTask<Object> ft1 = new FutureTask<>(myThread);
        Thread thread1 = new Thread(ft1,"thread");
        thread1.start();
        System.out.println(Thread.currentThread().getName()+"的返回结果："+ft1.get());
        int a=0;
        while (true) {
            System.out.println("main()方法在运行");
        }

    }
}
