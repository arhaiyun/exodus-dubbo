package com.tuling.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Henry
 * Created by Henry on 2020/04/15
 **/
public interface UserService extends Remote {

    String getName(Integer id) throws RemoteException;
}
