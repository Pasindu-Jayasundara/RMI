package org.example.test.client;

import org.example.test.model.Student;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface StudentService extends Remote {
    public List<Student> getStudents() throws RemoteException;
}
