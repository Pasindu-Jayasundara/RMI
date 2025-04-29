package org.example.test;

import org.example.test.client.Message;
import org.example.test.client.StudentService;
import org.example.test.model.Student;

import javax.lang.model.element.Name;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Properties;

public class RMIClient {
    public static void main(String[] args) {

        try {

            Registry registry = LocateRegistry.getRegistry("localhost", 6666);
            String[] list = registry.list();
            for(String s : list) {
                System.out.println(s);
            }

//            Message message = (Message) registry.lookup("message_service");
//            System.out.println(message.hello("Pasindu"));

//            StudentService studentService = (StudentService) registry.lookup("student_service");
//            StudentService studentService = (StudentService) Naming.lookup("rmi://localhost:6666/student_service");

            Properties properties = new Properties();
            properties.put(Context.PROVIDER_URL, "rmi://localhost:6666");
            properties.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");

            InitialContext initialContext = new InitialContext(properties);
            StudentService studentService = (StudentService) initialContext.lookup("student_service");

            List<Student> students = studentService.getStudents();

            for(Student s : students) {
                System.out.println(s.getId()+" "+s.getName()+" "+s.getAddress());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
