/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceImpl;

import DAO.CustomerDao;
import Model.Customer;
import Service.CustomerService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Amanda Marley
 */
public class CustomerServiceImpl  extends UnicastRemoteObject implements CustomerService  {

    public CustomerServiceImpl() throws RemoteException {
    }
    CustomerDao dao = new CustomerDao();

    @Override
    public Customer RegisterCustomer(Customer object) throws RemoteException {
        return dao.RegisterCustomer(object);
    }

    @Override
    public Customer UpdateCustomer(Customer object) throws RemoteException {
       return dao.UpdateCustomer(object);
    }

    @Override
    public Customer DeleteCustomer(Customer object) throws RemoteException {
       return dao.DeleteCustomer(object);
    }

    @Override
    public Customer searching(Customer object) throws RemoteException {
       return dao.searching(object);
    }

    @Override
    public List<Customer> customerlldata() throws RemoteException {
       return dao.customeralldata();
    }
    
   
    
}
