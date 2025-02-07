package Service;

import Model.RepairJob;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Amanda Marley
 */
public interface RepairJobService extends Remote  {
    
    RepairJob RegisterRepairJob(RepairJob object) throws RemoteException;
    RepairJob UpdateRepairJob(RepairJob object)  throws RemoteException;
    RepairJob DeleteRepairJob(RepairJob object) throws RemoteException;
    RepairJob searching(RepairJob object)   throws RemoteException;
    List<RepairJob>repairjoblldata()  throws RemoteException;
    
    
}