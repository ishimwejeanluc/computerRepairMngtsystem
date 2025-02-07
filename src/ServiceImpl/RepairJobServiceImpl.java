/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceImpl;

import DAO.RepairJobDao;
import Model.RepairJob;
import Service.RepairJobService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Amanda Marley
 */
public class RepairJobServiceImpl   extends UnicastRemoteObject implements RepairJobService {

    public RepairJobServiceImpl() throws RemoteException {
    }
      RepairJobDao dao = new RepairJobDao();
    @Override
    public RepairJob RegisterRepairJob(RepairJob object) throws RemoteException {
        return dao.RegisterRepairJob(object);
    }

    @Override
    public RepairJob UpdateRepairJob(RepairJob object) throws RemoteException {
       return dao.UpdateRepairJob(object);
    }

    @Override
    public RepairJob DeleteRepairJob(RepairJob object) throws RemoteException {
        return dao.DeleteRepairJob(object);
    }

    @Override
    public RepairJob searching(RepairJob object) throws RemoteException {
       return dao.searching(object);
    }

    @Override
    public List<RepairJob> repairjoblldata() throws RemoteException {
       return dao.RepairJoballdata();
    }
    
}
