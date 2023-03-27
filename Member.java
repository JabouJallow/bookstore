
import java.util.ArrayList;

public abstract class Member {
    /**
     * class attributes.
     */
    protected String name;
    protected int id;
    private static int ID = 1 ;
    protected float moneySpent;
    protected String phoneNumber;
    private String emailAddress;
    protected ArrayList<Product> productList;
    /**
     * class Functions.
     */
    
    /**
     * parameter constructor to initialize class data members.
     * @param name name of member
     * @param phoneNumber phone number of member
     * @param emailAddress email address of member
     */
    public Member(String name, String phoneNumber, String emailAddress){
        this.name = name;
        this.moneySpent = 0;
        this.id = ID++;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.productList = new ArrayList<>();
    }

    /**
     * setter and getter function.
     */
    
    /**
     * getter function that return member name.
     * @return member name
     */
    public String getName() {
        return name;
    }

    /**
     * setter function that update member name.
     * @param moneySpent new member name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter function that return member moneySpent.
     * @return member moneySpent
     */
    public float getMoneySpent() {
        return moneySpent;
    }

    /**
     * setter function that update member moneySpent.
     * @param moneySpent new member moneySpent
     */
    public void setMoneySpent(float moneySpent) {
        this.moneySpent = moneySpent;
    }

    /**
     * getter function that return member phoneNumber.
     * @return member phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * setter function that update member phoneNumber.
     * @param phoneNumber new member phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * getter function that return member emailAddress.
     * @return member emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * setter function that update member emailAddress.
     * @param emailAddress new member emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * getter function that return member productList.
     * @return member productList
     */
    public ArrayList<Product> getProductList() {
        return productList;
    }

    /**
     * getter function that return member id.
     * @return member id
     */
    public int getId() {
        return id;
    }
    
    /**
     * * this function make the purchase by adding this product to product list.
     * @param new product
     * @param amount amount needed
     */
    public void makePurchase(Product product, int amount){
        this.productList.add(product);
        this.moneySpent += (product.getPrice()*amount);
    }

    
    /**
     * return member info to display in menu.
     * @return info
     */
    public String getInfo(){
        return this.name+" - $"+this.moneySpent+" (Member)";
    }

    /**
     * return string of this Product.
     * @return 
     */
    @Override
    public String toString() {
        String str = "Member ID: "+this.id+", name: "+this.name+", phone number: "+
                this.phoneNumber+
                ", email address: "+this.emailAddress
                +", money spent $"+this.moneySpent;
        if(!productList.isEmpty()){
            str += "\nProducts has been purchased:\n";
            for(Product product: productList)
                str += "\t"+product.getInfo()+"\n";
        }
        return str;
    }
    
}



