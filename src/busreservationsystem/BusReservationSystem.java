
package busreservationsystem;


public class BusReservationSystem {

  
    public static void main(String[] args) {
        
        Admin admin = new Admin("Ahmed" ,01012145345 , "Cairo" , "Ahmed@yahoo.com" , "AhmedHamada" , "00000");
        admin.Admins.add(admin);
        admin.displayAdminsArray();
        admin.updateAdminInfo("AhmedHamada", "HamadaHamada", "12345", "Ahmed@yahoo.com", "Cairo", Long.parseLong("010121453"));
        admin.displayAdminsArray();
    }
    
}
