package DAO;
import Model.Employee;
import java.util.List;
import org.hibernate.Session;

public class EmployeeDao {
     public Employee RegisterEmployee(Employee object){
         try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(object);
            ss.beginTransaction().commit();
            ss.close();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        }
       return null;
    }
    
    public Employee UpdateEmployee(Employee object){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(object);
            ss.beginTransaction().commit();
            ss.close();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    ////////////////////////////////
    public Employee DeleteEmployee(Employee object){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(object);
            ss.beginTransaction().commit();
            ss.close();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    
    public Employee searching(Employee object){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            
            Employee dataemployee=(Employee) ss.get(Employee.class,object.getEmployeeId());
            return dataemployee;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
     public List<Employee> Employeealldata(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<Employee> listemployee= ss.createQuery("select theemployee from Employee theemployee").list();
            return listemployee;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
} 