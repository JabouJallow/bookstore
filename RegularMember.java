
import java.util.ArrayList;

public class RegularMember extends Member{
    
    /**
     * class attributes.
     */
    
    /**
     * class Functions.
     */
    
    /**
     * parameter constructor to initialize class data members.
     * @param name name of member
     * @param phoneNumber phone number of member
     * @param emailAddress email address of member
     */
    public RegularMember(String name, String phoneNumber, String emailAddress){
        super(name, phoneNumber,emailAddress);
    }
    
    /**
     * return member info to display in menu.
     * @return info
     */
    public String getInfo(){
        return this.name+" - $"+this.moneySpent+" (Regular Member)";
    }
    /**
     * return string of this Product.
     * @return 
     */
    @Override
    public String toString() {
        return "Regular Member: "+super.toString();
    }
}
