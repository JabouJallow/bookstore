
public class PremiumMember extends Member{
    /**
     * class attributes.
     */
    // fee of the member every month
    private final float feePerMonth = 25;
    
    // check if the fee is due or has bee paid
    // if it true then the fee is due
    // if it false then fee is paid
    private boolean feeDue;
    
    /**
     * class Functions.
     */
    /**
     * parameter constructor to initialize class data members.
     * @param name name of member
     * @param phoneNumber phone number of member
     * @param emailAddress email address of member
     * *@param feeDue feeDue of member
     */
    public PremiumMember(String name, String phoneNumber, String emailAddress, boolean feeDue){
        super(name, phoneNumber,emailAddress);
        this.feeDue = feeDue;
    }

    /**
     * getter function that return FeeDue of member.
     * @return FeeDue of member
     */
    public boolean isFeeDue() {
        return feeDue;
    }

    /**
     * getter function that update FeeDue of member.
     * @param feeDue new FeeDue of member
     */
    public void setFeeDue(boolean feeDue) {
        this.feeDue = feeDue;
    }
    
    /**
     * getter function that return feePerMonth of member.
     * @return 
     */
    public float getFee(){
        return feePerMonth;
    } 
    
    
    /**
     * return member info to display in menu.
     * @return info
     */
    public String getInfo(){
        return this.name+" - $"+this.moneySpent+" (Premium Member)";
    }
    
    /**
     * return string of this Product.
     * @return 
     */
    @Override
    public String toString() {
        String str = "Premium Member: "+super.toString();
        if(this.feeDue){
            str += ", $"+this.feePerMonth+" Fee is due";
        }
        else
        {
            str += ", Fee has been paid";
        }
        return str;
    }
}
