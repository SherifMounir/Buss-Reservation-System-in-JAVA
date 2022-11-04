package busreservationsystem;


public class Station extends Trip  {
    
    private String Station_Name;
    private String Station_Location;
    
    public Station(){}
    public Station(String Name , String Location)
    {
      this.Station_Name = Name;
      this.Station_Location = Location;
    }
    
    public String NextTripTime()
    {
     return (super.getBusRunningTime());
    }
    
    public void BookTickets()
    {
    }
    
    
}
