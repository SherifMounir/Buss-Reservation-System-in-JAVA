
package busreservationsystem;

public class EmptyFieldException  extends Exception{
    
    
     
    public String errormsg;
    public EmptyFieldException(String errorMessage)
    {
        super(errorMessage);
        this.errormsg = errorMessage;
    }
}
    

