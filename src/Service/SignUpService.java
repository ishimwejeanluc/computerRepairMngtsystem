/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.SignUp;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author bluer
 */
public interface SignUpService extends Remote{
    SignUp RegisterUser(SignUp user)throws RemoteException;
    SignUp UpdateUser(SignUp user)throws RemoteException;
    SignUp DeleteUser(SignUp user)throws RemoteException;
     SignUp authenticateUser(SignUp user)throws RemoteException;
    List<SignUp> user()throws RemoteException;

}
