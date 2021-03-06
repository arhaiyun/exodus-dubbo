package com.tuling.rmi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * @author Henry
 * Created by Henry on 2020/04/15
 **/
public class RmiServer {
    public static void main(String[] args) throws IOException, AlreadyBoundException {
        // 创建一个远程对象
        UserService hello = new UserServiceImpl();
        //绑定的URL标准格式为：rmi://host:port/name
        Naming.bind("rmi://localhost:8080/UserService", hello);
        System.out.println("======= 启动RMI服务注册成功! =======");
        System.in.read(new byte[1024]);
    }
}
