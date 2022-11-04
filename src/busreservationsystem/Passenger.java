
package busreservationsystem;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Passenger extends User{
    
    private String Password;
    private String DateOfReservation;
    private String National_ID;
    private Scanner scan;
    private int seatNumber;
    public  ArrayList<BusTicket> BookedTicket;
    
    public Passenger(){
      BookedTicket = new ArrayList<>();
    }
    public Passenger(String name , long phonenumber , String address , String mail , String password , String dateofreserve , String nationalid , int seatnumber)
    {
      super( name ,  phonenumber ,  address ,  mail);
      this.Password = password;
      this.DateOfReservation = dateofreserve;
      this.National_ID = nationalid;
      this.seatNumber = seatnumber;
      this.BookedTicket = new ArrayList<>();

    
    }
    public void Register()
    {
        try
        {
            FileWriter writer = new FileWriter("PassengerRegisteration.txt", true);
            writer.write(String.valueOf(this.seatNumber));
            writer.write(" ");
            writer.write(this.Password);
            writer.write(" ");
            writer.write(this.National_ID);
            writer.write(" ");
            writer.write(this.DateOfReservation);
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
    public boolean Login(int seatnumber , String password)
    {
        boolean isExist = false;
        try
        {
            this.scan = new Scanner(new File("C:\\Users\\SherifMounir\\Documents\\NetBeansProjects\\BusReservationSystem\\PassengerRegisteration.txt"));
            while(this.scan.hasNext())
            {


               String seatnum = this.scan.next();
               String pass = this.scan.next();
               System.out.println(seatnum);
               System.out.println(pass);
               if((Integer.parseInt(seatnum) == (seatnumber)) && (pass.equals(password)))
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
    
    public void createAccount(String Name , String Password)
    {
      super.setUserName(Name); 
      this.Password = Password;
    }
    
    public void setUserName(String userName)
    {
        super.setUserName(userName);
    }
    
    public String getUserName()
    {
      return (super.getName());
    }
    
    public void setPassword(String Password)
    {
      this.Password = Password;
    }
    
    public void setSeatNumber(int SeatNumber)
    {
      this.seatNumber = SeatNumber;
    }
   
    public int getSeatNumber()
    {
      return this.seatNumber;
    }
    public void addTicketToBookedTicket(BusTicket T)
    {
     this.BookedTicket.add(T);
    }
    public void removeTicketfromBookedTicket(BusTicket T)
    {
     this.BookedTicket.remove(T);
    }
    public ArrayList<BusTicket> getAllBookedtickets()
    {
      return this.BookedTicket;
    }
            
}
