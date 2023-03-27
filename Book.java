
public class Book extends Product{
    
    /**
     * class attributes
     */
    protected String name;
    private String author;
    
    /**
     * class functions
     */
    
    /**
     * parameter constructor to initialize data members
     * @param name name of the book
     * @param author author of the book
     * @param price price of the book
     * @param amountInStock  amount of the book in stock
     */
    public Book(String name, String author, float price, int amountInStock){
        super(price, amountInStock);
        this.name = name;
        this.author = author;
    }

    /**
     * setter and getter functions
     */
    
    /**
     * this getter function returns the book name
     * @return name of the book
     */
    public String getName() {
        return name;
    }

    /**
     * this setter function updates the book name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * this getter function returns the authors name
     * @return author of the book name
     */
    public String getAuthor() {
        return author;
    }

    /**
     * this setter function updates the authors name
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    
    /**
     * this returns the product info to display it in the menu
     * @return info
     */
    public String getInfo(){
        return this.name+" - $"+super.getInfo()+" (Book)";
    }

    /**
     * this returns the string of this Product
     * @return 
     */
    @Override
    public String toString() {
        return "Book ID: " + this.id + ", name: " + this.name + ", author: " + this.author +
                ", price: $ " + this.price + ", available (" +this.amountInStock + ") book(s)";
    }
    
    
    
}

