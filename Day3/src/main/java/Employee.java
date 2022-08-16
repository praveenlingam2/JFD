import javax.lang.model.element.Name;
import java.sql.SQLOutput;

public class Employee {
   private String Name;
   private int id;
   private String roleName;
   private int phoneNumber;
   private String EmailId;
   public void showEmpDetails(){
       System.out.println("Employee details");
       System.out.println("Name : "+Name);
       System.out.println("Phone Number :"+phoneNumber);
       System.out.println("ID :"+id);
       System.out.println("Role Name :"+roleName);
       System.out.println("Email ID :"+EmailId);
   }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public Employee() {

    }

    public Employee(String name, int id, String roleName, int phoneNumber, String emailId) {
        Name = name;
        this.id = id;
        this.roleName = roleName;
        this.phoneNumber = phoneNumber;
        EmailId = emailId;
    }

    public Employee(String name, int id, String roleName) {
        Name = name;
        this.id = id;
        this.roleName = roleName;

    }


}

