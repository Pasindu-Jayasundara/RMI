package org.example.test.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
    public String hello(String name) throws RemoteException;
}
