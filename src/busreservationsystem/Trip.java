
package busreservationsystem;

import java.util.ArrayList;
import java.util.Date;


public class Trip {
    
    private int Trip_ID;
    private String Bus_Running_Time;
    private String Fare;
    private String Trip_Date;
    private BusTicket Ticket;

    private ArrayList<BusTicket> Tickets ;
    
    public Trip()
    {
      this.Tickets = new ArrayList<BusTicket>();
      this.Ticket = new BusTicket();
    }
    public Trip(int id , String runtime , String fare , String tripdate)
    {
       this.Trip_ID = id ;
       this.Bus_Running_Time = runtime;
       this.Fare = fare;
       this.Trip_Date = tripdate;
      this.Tickets = new ArrayList<BusTicket>();
      this.Ticket = new BusTicket();
    }    
    
    public void setBusRunningTime(String RunningTime)
    {
      this.Bus_Running_Time = RunningTime;
    }
    
    public void setFare(String Fare)
    {
      this.Fare = Fare;
    }
    
    public void SetTripDate(String TripDate)
    {
      this.Trip_Date = TripDate;
    }
    
    public String getBusRunningTime()
    {
      return this.Bus_Running_Time;
    }
    
    public String getFare()
    {
      return this.Fare;
    }
    
    public String getTripDate()
    {
      return this.Trip_Date;
    }
    
    public void addTickets(BusTicket t)
    {
        this.Tickets.add(t);
    }
    public void setTripID(int id)
    {
      this.Trip_ID = id;
    }
    public int getTripID()
    {
      return this.Trip_ID;
    }
    public ArrayList<BusTicket> getTripAvailableTickets()
    {
      return this.Tickets;
    }
}
