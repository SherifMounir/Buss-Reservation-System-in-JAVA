
package busreservationsystem;

import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Bus {
    
    private int Bus_ID;
    private int Bus_Number;
    private int NumberOfSeats;
    
    private String Bus_Route;
    private String Bus_Distance_btw_Distnations;
    private String Bus_Fare;
    private String Bus_Status;
    private String Bus_Type;
    private String Bus_Description;
    private String Bus_Driver;
     public  ArrayList<Bus> Buses;
   
    
    public Bus(){
      this.Buses = new ArrayList<Bus>();
    }
    public Bus(int id , int num , String route ,String distance , String fare , String status , int seats , String type , String description , String driver)
    {
      this.Bus_ID = id ;
      this.Bus_Number = num;
      this.Bus_Route = route;
      this.Bus_Distance_btw_Distnations = distance;
      this.Bus_Fare = fare;
      this.Bus_Status = status;
      this.NumberOfSeats = seats;
      this.Bus_Type = type;
      this.Bus_Description = description;
      this.Bus_Driver = driver;
      this.Buses = new ArrayList<Bus>();

    }
    
    public void setBusID(int BusID)
    {
       this.Bus_ID = BusID;
    
    }
    
    public void setBusNumber(int BusNumber)
    {
       this.Bus_Number = BusNumber;
    
    }
    
    public void setBusRoute(String BusRoute)
    {
       this.Bus_Route = BusRoute;
    
    }

    public void setDistance(String BusDistance)
    {
       this.Bus_Distance_btw_Distnations = BusDistance;
    
    }

    public void setFare(String BusFare)
    {
       this.Bus_Fare = BusFare;
    
    }    
 
    public void setBusStatus(String BusStatus)
    {
       this.Bus_Status = BusStatus;
    
    }      
    
    public void setNumberOfSeats(int NumberOfSeats)
    {
       this.NumberOfSeats = NumberOfSeats;
    
    }    

    public void setBusType(String BusType)
    {
       this.Bus_Type = BusType;
    
    }       

    public void setBusDescription(String BusDescription)
    {
       this.Bus_Description = BusDescription;
    
    }       
    
    public void setBusDriver(String BusDriver)
    {
       this.Bus_Driver = BusDriver;
    
    }    
    
    public int getBusID()
    {
      return this.Bus_ID;
    }
   
    public int getBusNumber()
    {
      return this.Bus_Number;
    }   

    public int getNumberOfSeats()
    {
      return this.NumberOfSeats;
    }  
    
    public String getBusRoute()
    {
      return this.Bus_Route;
    }

    public String getBusDistance()
    {
      return this.Bus_Distance_btw_Distnations;
    } 
    
    public String getFare()
    {
      return this.Bus_Fare;
    }  
    
    public String getBusStatus()
    {
      return this.Bus_Status;
    }    
    
    public String getBusType()
    {
      return this.Bus_Type;
    }   
    
    public String getBusDescription()
    {
      return this.Bus_Description;
    }    

    public String getBusDriver()
    {
      return this.Bus_Driver;
    }    
 public void saveBusInfoInFile()
    {
        try
        {
            FileWriter writer = new FileWriter("BusInfo.txt", true);
            writer.write(String.valueOf(this.Bus_ID));
            writer.write(" ");
            writer.write(String.valueOf(this.Bus_Number));
            writer.write(" ");
            writer.write(this.Bus_Description);
            writer.write(" ");
            writer.write(this.Bus_Fare);
            writer.write(" ");
            writer.write(this.Bus_Distance_btw_Distnations);
            writer.write(" ");
            writer.write(String.valueOf(this.NumberOfSeats));
            writer.write(" ");
            writer.write(this.Bus_Route);
            writer.write(" ");
            writer.write(this.Bus_Status);
            writer.write(" ");
            writer.write(this.Bus_Type);
            writer.write(" ");
            writer.write(this.Bus_Driver);
            writer.write(" ");           
            writer.close();
        }
        catch(Exception e){

                JOptionPane.showMessageDialog(null, "Failed to Save Bus Imfo !");

            }
    
    }    
}
