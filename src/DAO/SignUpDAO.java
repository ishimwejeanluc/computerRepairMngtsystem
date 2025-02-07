/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.SignUp;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author bluer
 */
public class SignUpDAO {
     public SignUp registerUser(SignUp user){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
             ss.save(user);
             ss.beginTransaction().commit();
             ss.close();
             return user;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
        
    }
 
    
    
     public SignUp updateUser(SignUp user){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
             ss.update(user);
             ss.beginTransaction().commit();
             ss.close();
             return user;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
        
    }
      
      public SignUp deleteUser(SignUp user){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
             ss.delete(user);
             ss.beginTransaction().commit();
             ss.close();
             return user;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
        
    }
      
       public List<SignUp> allusers(){
        try {
            
            Session ss= HibernateUtil.getSessionFactory().openSession();
            List<SignUp> user = ss.createQuery("select user from User user").list();
            ss.close();
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }
        return null;
        
    }
       
      
   
    
    public SignUp authenticateUser(String username, String password) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            
            // Query to find the user by username and password
            String query = "from SignUp u where u.username = :username and u.password = :password";
            
            SignUp theUser = (SignUp) ss.createQuery(query)
                .setParameter("username", username)
                .setParameter("password", password)
                .uniqueResult();
            
            ss.close();
            
            return theUser; // Returns the found user or null if not found
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
