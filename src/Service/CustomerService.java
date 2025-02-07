package Service;

import Model.Customer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Amanda Marley
 */
public interface CustomerService extends Remote  {
    
    Customer RegisterCustomer(Customer object) throws RemoteException;
    Customer UpdateCustomer(Customer object)  throws RemoteException;
    Customer DeleteCustomer(Customer object) throws RemoteException;
    Customer searching(Customer object)   throws RemoteException;
    List<Customer>customerlldata()   throws RemoteException;
    
    
}