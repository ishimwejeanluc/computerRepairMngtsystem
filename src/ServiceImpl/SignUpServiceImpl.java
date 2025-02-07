/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceImpl;

import DAO.SignUpDAO;
import Model.SignUp;
import Service.SignUpService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


/**
 *
 * @author bluer
 */
public class SignUpServiceImpl extends UnicastRemoteObject implements SignUpService{

    public SignUpServiceImpl() throws RemoteException {
    }
    
     SignUpDAO dao= new SignUpDAO();

    @Override
    public SignUp RegisterUser(SignUp user) throws RemoteException {
        return dao.registerUser(user);
    }

    @Override
    public SignUp UpdateUser(SignUp user) throws RemoteException {
       return dao.updateUser(user);
    }

    @Override
    public SignUp DeleteUser(SignUp user) throws RemoteException {
       return dao.deleteUser(user);
    }
 @Override
    public SignUp authenticateUser(SignUp user) throws RemoteException {
          String username = user.getUsername();
        String password = user.getPassword();
        return dao.authenticateUser(username, password);
    }

    @Override
    public List<SignUp> user() throws RemoteException {
        return dao.allusers();
    }













}

  