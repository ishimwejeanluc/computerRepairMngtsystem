package DAO;
import Model.RepairJob;
import java.util.List;
import org.hibernate.Session;

public class RepairJobDao {
     public RepairJob RegisterRepairJob(RepairJob object){
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
    
    public RepairJob UpdateRepairJob(RepairJob object){
        
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
    public RepairJob DeleteRepairJob(RepairJob object){
        
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
    
    public RepairJob searching(RepairJob object){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            
            RepairJob datarepair=(RepairJob) ss.get(RepairJob.class,object.getJobId());
            return datarepair;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
     public List<RepairJob> RepairJoballdata(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<RepairJob> listrepair= ss.createQuery("select therepair from RepairJob therepair").list();
            return listrepair;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
} 