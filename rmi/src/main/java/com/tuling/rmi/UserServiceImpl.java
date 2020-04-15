package com.tuling.rmi;

import java.lang.management.ManagementFactory;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Henry
 * Created by Tommy on 2020/04/15
 **/
public class UserServiceImpl extends UnicastRemoteObject implements UserService {

    protected UserServiceImpl() throws RemoteException {
    }


    @Override
    public String getName(Integer id) {
        return String.format("myName is henry :%s", ManagementFactory.getRuntimeMXBean().getName());
    }
}
