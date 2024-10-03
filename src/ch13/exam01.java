package ch13;

import java.net.InetAddress;
import java.util.concurrent.ExecutionException;

public class exam01 {
    public static void main(String[] args) throws Exception {
        InetAddress localAdress = InetAddress.getLocalHost();
        InetAddress remoteAddress = InetAddress.getByName("www.baidu.cn");
        System.out.println("本机IP地址："+localAdress.getHostAddress());
        System.out.println("www.baidu.cn的IP地址："+remoteAddress.getHostAddress());
        System.out.println("3s是否可达主机www.baidu.cn："+remoteAddress.isReachable(3000));

    }
}
