
package busreservationsystem;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Admin extends User{
    
    private String account;
    private String password;
    private Scanner scan;
    public  ArrayList<Admin> Admins;
    
    
    public Admin()
    {
        this.Admins = new ArrayList<Admin>();
    }
    public Admin(String Name ,long MNumber , String Address , String Mail , String Account , String Password)
    {
       super(Name , MNumber , Address , Mail);
      this.account = Account;
      this.password = Password;
      this.Admins = new ArrayList<Admin>();
    }
    
    public void Register()
    {
        try
        {
            FileWriter writer = new FileWriter("AdminRegisteration.txt", true);
            writer.write(this.account);
            writer.write(" ");
            writer.write(this.password);
            writer.write(" ");
            writer.write(this.getName());
            writer.write(" ");
            writer.write(String.valueOf(this.getMobileNumber()));
            writer.write(" ");
            writer.write(this.getAddress());
            writer.write(" ");
            writer.write(this.getMail());
            writer.write(" ");
            writer.close();
        }
        catch(Exception e){

                JOptionPane.showMessageDialog(null, "Registeration Failed !");

            }
    
    }
    
    public boolean Login(String account , String password)
    {
        boolean isExist = false;
        try
        {
            this.scan = new Scanner(new File("C:\\Users\\SherifMounir\\Documents\\NetBeansProjects\\BusReservationSystem\\AdminRegisteration.txt"));
            while(this.scan.hasNext())
            {


               String acc = this.scan.next();
               String pass = this.scan.next();
               System.out.println(acc);
               System.out.println(pass);
               if((acc.equals(account)) && (pass.equals(password)))
                 {
                   isExist = true;
                   break;
                 }
           }
        }
         catch(Exception e)
            {

                JOptionPane.showMessageDialog(null, e);

            }
       this.scan.close();
       return isExist;
    }
    
    public Bus createBus(int id , int num , String route ,String distance , String fare , String status , int seats , String type , String description , String driver)
    {
     return (new Bus(id , num , route , distance , fare , status , seats , type , description , driver));
    }
    
    public void addBus(int id , int num , String route ,String distance , String fare , String status , int seats , String type , String description , String driver)
    {
        Bus b = new Bus( id ,  num ,  route , distance ,  fare ,  status ,  seats ,  type ,  description ,  driver);
        HomePage.Buses.add(b);
         try
        {
            FileWriter writer = new FileWriter("BusInfo.txt", true);
            writer.write(String.valueOf(b.getBusID()));
            writer.write(" ");
            writer.write(String.valueOf(b.getBusNumber()));
            writer.write(" ");
            writer.write(b.getBusDescription());
            writer.write(" ");
            writer.write(b.getFare());
            writer.write(" ");
            writer.write(b.getBusDistance());
            writer.write(" ");
            writer.write(String.valueOf(b.getNumberOfSeats()));
            writer.write(" ");
            writer.write(b.getBusRoute());
            writer.write(" ");
            writer.write(b.getBusStatus());
            writer.write(" ");
            writer.write(b.getBusType());
            writer.write(" ");
            writer.write(b.getBusType());
            writer.write(" ");           
            writer.close();
        }
        catch(Exception e){

                JOptionPane.showMessageDialog(null, "Failed to Save Bus Imfo !");

            }
    }
    public void removeBus(int busID , ArrayList<Bus> B)
    {
       if(B.size() != 0)
        {
        
          for(int i = 0 ; i < B.size() ; i++)
             {
                  Bus bus = (Bus)B.get(i);
                  if(bus.getBusID() == busID)
                  {
                   B.remove(bus);
                   JOptionPane.showMessageDialog(null, "Chosen Bus Removed ");
                   break;
                  }

      
             }
        
        }
       else
       {
          JOptionPane.showMessageDialog(null, "The Bus Array is Empty");

       }
    
    }
    public void updateBus(int busID , ArrayList<Bus> B , Bus b)
    {
            if(B.size() != 0)
        {
        
          for(int i = 0 ; i < B.size() ; i++)
             {
                  Bus bus = (Bus)B.get(i);
                  if(bus.getBusID() == busID)
                  {
                   bus.setBusID(b.getBusID());
                   bus.setBusNumber(b.getBusNumber());
                   bus.setBusDescription(b.getBusDescription());
                   bus.setBusDriver(b.getBusDriver());
                   bus.setBusRoute(b.getBusRoute());
                   bus.setBusStatus(b.getBusStatus());
                   bus.setFare(b.getFare());
                   bus.setBusType(b.getBusType());
                   bus.setDistance(b.getBusDistance());
                   bus.setNumberOfSeats(b.getNumberOfSeats());
                   JOptionPane.showMessageDialog(null, "Chosen Bus Updated Successfully ");
                   break;
                  }

      
             }
        
        }
       else
       {
          JOptionPane.showMessageDialog(null, "The Bus Array is Empty");

       }
    
    
    }
    public void assignFare(Bus bus , String Fare , ArrayList<Bus> B)
    {
        if(B.size() != 0)
        {
        
          for(int i = 0 ; i < B.size() ; i++)
             {
                  Bus b = (Bus)B.get(i);  
                  if(bus.equals(b))
                  {
                    b.setFare(Fare);
                    JOptionPane.showMessageDialog(null, "Assign Fare Completed");
                    break;

                  }
             }
        }
        else
       {
          JOptionPane.showMessageDialog(null, "The Bus Array is Empty");

       }
    }
     public void assignFare(int busID, String Fare , ArrayList<Bus> B)
    {
        if(B.size() != 0)
        {
        
          for(int i = 0 ; i < B.size() ; i++)
             {
                  Bus b = (Bus)B.get(i);  
                  if(b.getBusID() == busID)
                  {
                    b.setFare(Fare);
                    JOptionPane.showMessageDialog(null, "Assign Fare Completed");
                    break;

                  }
             }
        }
        else
       {
          JOptionPane.showMessageDialog(null, "The Bus Array is Empty");

       }
    }
    
    public String getAccount()
    {
        return this.account;
    }
    
    public void setPassword(String password)
    {
      this.password = password;
    }
    
    public void setAccount(String account)
    {
      this.account = account;
    }    
    public String getPassword()
    {
       return this.password;
    }
    
    public void displayAdminsArray()
    {
    
     if(this.Admins.size() != 0)
        {
        
          for(int i = 0 ; i < this.Admins.size() ; i++)
             {
                  Admin user = (Admin)this.Admins.get(i);
                  System.out.println(user.getAccount());
                  System.out.println(user.getPassword());

      
             }
        
        }
    }
    public Trip getTripbyID(int id , ArrayList<Trip> T)
    {
     
         Trip t = new Trip();
        for(int i = 0 ; i < T.size() ; i++)
             {
                  Trip trip = (Trip)T.get(i);
                  if(trip.getTripID() == id)
                  {
                    t = trip;
                    JOptionPane.showMessageDialog(null, "Trip matched");

                    break;
                  
                  }

      
             }
           return t;
    
    }
    public void updateAdminInfo(String oldaccount , String newaccount ,String Password , String mail , String address , Long phonenumber)
    {
        if(this.Admins.size() != 0)
        {
        
          for(int i = 0 ; i < this.Admins.size() ; i++)
             {
                  Admin user = (Admin)this.Admins.get(i);
                  if(user.getAccount().equals(oldaccount))
                  {
                      user.setAccount(newaccount);
                      user.setPassword(Password);
                      user.setUserAddress(address);
                      user.setUserMail(mail);
                      user.setUserMobileNumber(phonenumber);
                  
                  }

      
             }
        
        }
    }
}
