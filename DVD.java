/**
 * this is the DVD Class.
 * @alimaconde author
 * @version 1.1
 */
public class DVD extends Product{
    
    /**
     * class attributes
     */
    private String filmName;
    private float weight;
    /**
     * class functions
     */
    
    /**
     * this is the parameter constructor to initialize data members
     * @param filmName filmName of the DVD
     * @param weight size of the DVD
     * @param price price of the DVD
     * @param amountInStock  amount of the DVD in stock
     */
    public DVD(String filmName, float weight, float price, int amountInStock){
        super(price, amountInStock);
        this.filmName = filmName;
        this.weight = weight;
    }

    /**
     * the setter and getter function
     */
    
    /**
     * the getter function that returns DVD film name
     * @return DVD film name
     */
    public String getFilmName() {
        return filmName;
    }

    /**
     * the setter function that updates DVD film name
     * @param weight new DVD film name
     */
    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    /**
     * the getter function that returns the DVD weight
     * @return DVD weight
     */
    public float getWeight() {
        return weight;
    }

    
    /**
     * the setter function updates the DVD weight
     * @param weight new DVD weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * returns product info to display in menu
     * @return info
     */
    public String getInfo() {
        return this.filmName + " - $" + super.getInfo() + " (DVD)";
    }
    
    /**
     * returns string of this Product
     * @return 
     */
    @Override
    public String toString() {
        return "DVD ID: "+this.id+", film name: "+this.filmName+", wight: "+this.weight+
                ", price: $ "+this.price+", available ("+this.amountInStock+") DVD(s)";
    }

}
