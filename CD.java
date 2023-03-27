
/**
 * the CD Class.
 *
 * @author alimaconde 
 * @version 1.1
 */
public class CD extends Product {

    /**
     * class attributes
     */
    private String contentTitle;
    private int size;

    /**
     * class functions
     */

    /**
     * this is the parameter constructor to initialize data members.
     *
     * @param contentTitle CD contentTitle 
     * @param size size of the CD
     * @param price price of the CD
     * @param amountInStock amount of the CD in Stock
     */

    public CD(String contentTitle, int size, float price, int amountInStock) {
        super(price, amountInStock);
        this.contentTitle = contentTitle;
        this.size = size;
    }

    /**
     * the setter and getter function
     */
    /**
     * getter function that returns CD contentTitle
     *
     * @return CD contentTitle 
     */
    public String getContentTitle() {
        return contentTitle;
    }

    /**
     * setter function that update CD contentTitle
     *
     * @param contentTitle new CD contentTitle
     */
    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    /**
     * the getter function that returns CD size
     *
     * @return CD size
     */
    public int getSize() {
        return size;
    }

    /**
     * the setter function that updates the CD size
     *
     * @param contentTitle new CD size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * returns product info to display in menu
     *
     * @return info
     */
    public String getInfo() {
        return this.contentTitle + " - $" + super.getInfo() + " (CD)";
    }
    
    /**
     * returns string of this Product
     * @return 
     */
    @Override
    public String toString() {
        return "CD ID: "+this.id+", content title: "+this.contentTitle+", size: "+this.size+
                ", price: $ "+this.price+", available ("+this.amountInStock+") CD(s)";
    }
}


