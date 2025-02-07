package Service;

import Model.Employee;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Amanda Marley
 */
public interface EmployeeService extends Remote  {
    
    Employee RegisterEmployee(Employee object) throws RemoteException;
    Employee UpdateEmployee(Employee object)  throws RemoteException;
    Employee DeleteEmployee(Employee object) throws RemoteException;
    Employee searching(Employee object)   throws RemoteException;
    List<Employee>employeealldata()   throws RemoteException;
    
    
}