/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceImpl;

import DAO.EmployeeDao;
import Model.Employee;
import Service.EmployeeService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Amanda Marley
 */
public class EmployeeServiceImpl extends UnicastRemoteObject implements EmployeeService {

    public EmployeeServiceImpl() throws RemoteException{
    }
    EmployeeDao dao = new EmployeeDao();
    @Override
    public Employee RegisterEmployee(Employee object) throws RemoteException {
       return dao.RegisterEmployee(object);
    }

    @Override
    public Employee UpdateEmployee(Employee object) throws RemoteException {
       return dao.UpdateEmployee(object);
    }

    @Override
    public Employee DeleteEmployee(Employee object) throws RemoteException {
       return dao.DeleteEmployee(object);
    }

    @Override
    public Employee searching(Employee object) throws RemoteException {
       return dao.searching(object);
    }
 
    @Override
    public List<Employee> employeealldata() throws RemoteException {
        return dao.Employeealldata();
    }
    
}
