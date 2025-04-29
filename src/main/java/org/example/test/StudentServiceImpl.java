package org.example.test;

import org.example.test.client.StudentService;
import org.example.test.model.Student;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class StudentServiceImpl extends UnicastRemoteObject implements StudentService {


    protected StudentServiceImpl() throws RemoteException {
    }

    @Override
    public List<Student> getStudents() throws RemoteException {
        return List.of(
                new Student(1,"Kamal","123 addr","01123456"),
                new Student(2,"Nimal","456 addr","01245686"),
                new Student(3,"Sunimal","789 addr","012454556")
        );
    }
}
