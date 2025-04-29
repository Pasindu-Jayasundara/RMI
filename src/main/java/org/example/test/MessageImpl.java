package org.example.test;

import org.example.test.client.Message;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImpl extends UnicastRemoteObject implements Message {

    public MessageImpl() throws RemoteException {}

    @Override
    public String hello(String name) throws RemoteException {
        return "Hello " + name;
    }
}
