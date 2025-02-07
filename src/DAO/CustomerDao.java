package DAO;
import Model.Customer;
import java.util.List;
import org.hibernate.Session;

public class CustomerDao {
     public Customer RegisterCustomer(Customer object){
         try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(object);
            ss.beginTransaction().commit();
            ss.close();
            return object;
        } catch (Exception e) {
        }
       return null;
    }
    
    public Customer UpdateCustomer(Customer object){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(object);
            ss.beginTransaction().commit();
            ss.close();
            return object;
        } catch (Exception e) {
        }
        
        
        
        return null;
    }
    ////////////////////////////////
    public Customer DeleteCustomer(Customer object){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(object);
            ss.beginTransaction().commit();
            ss.close();
            return object;
        } catch (Exception e) {
        }
        
        
        
        return null;
    }
    
    public Customer searching(Customer object){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            
            Customer datacustomer=(Customer) ss.get(Customer.class,object.getCustomerId());
            return datacustomer;
        } catch (Exception e) {
        }
        
        return null;
    }
    
     public List<Customer> customeralldata(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<Customer> listcustomer= ss.createQuery("select thecustomer from Customer thecustomer").list();
            return listcustomer;
        } catch (Exception e) {
        }
        
        return null;
    }
    
} 