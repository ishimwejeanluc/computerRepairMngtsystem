package Model;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Customer")

public class Customer implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_Id")
    private Integer customerId;
    @Column(name = "Names")
    private String Names;
     @Column(name = "PhoneNumber")
    private String PhoneNumber;

    @OneToMany(mappedBy = "customer")
    private List<RepairJob> repairJobs = new ArrayList<>();

    public Customer() {
    }

    public Customer(Integer customerId) {
        this.customerId = customerId;
    }

    public Customer(Integer customerId, String Names, String PhoneNumber) {
        this.customerId = customerId;
        this.Names = Names;
        this.PhoneNumber = PhoneNumber;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String Names) {
        this.Names = Names;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public List<RepairJob> getRepairJobs() {
        return repairJobs;
    }

    public void setRepairJobs(List<RepairJob> repairJobs) {
        this.repairJobs = repairJobs;
    }

    

    
    

}