package Controller;

import ServiceImpl.CustomerServiceImpl;
import ServiceImpl.EmployeeServiceImpl;
import ServiceImpl.RepairJobServiceImpl;
import ServiceImpl.SignUpServiceImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class Server {

    public static void main(String[] args) {
        try {
    
   
    Registry theRegistry = LocateRegistry.createRegistry(6000);

    // Bind the RMI services to the registry
    theRegistry.rebind("Customer", new CustomerServiceImpl());
    theRegistry.rebind("Employee", new EmployeeServiceImpl());
    theRegistry.rebind("RepairJob", new RepairJobServiceImpl());
    theRegistry.rebind("SignUpcall", new SignUpServiceImpl());

    System.out.println("Server is Running on port 6000");
    Thread.currentThread().join();
} catch (Exception ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "An error occurred on the server: " + ex.getMessage());
}

    }
}
