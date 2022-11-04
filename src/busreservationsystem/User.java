
package busreservationsystem;


public class User {
    
    private String Name;
    private String Address;
    private String Mail;
    
    private long PhoneNumber;
    
    public User(){}
    public User(String name , long phonenumber , String address , String mail)
    {
      this.Name = name;
      this.PhoneNumber = phonenumber;
      this.Address = address;
      this.Mail = mail;
    }

    public void setUserName(String Name)
    {
      this.Name = Name;
    }

    public void setUserMobileNumber(long Number)
    {
      this.PhoneNumber = Number;
    }

    public void setUserAddress(String Address)
    {
      this.Address = Address;
    }    

    public void setUserMail(String Mail)
    {
      this.Mail = Mail;
    }    
    
    public String getName()
    {
      return this.Name;
    }
    
    public long getMobileNumber()
    {
      return this.PhoneNumber;
    }
    
    public String getAddress()
    {
      return this.Address;
    }
        
    public String getMail()
    {
      return this.Mail;
    }
        
}
