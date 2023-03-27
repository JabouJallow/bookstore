
public abstract class Product implements Comparable<Product> {

    /**
     * class attributes.
     */

    protected int id;
    private static int ID = 1;
    protected double price;
    protected int amountInStock;

    /**
     * class Functions.
     */
    /**
     * this is the parameter constructor to initialize data members.
     *
     * @param price price of the product.
     * @param amountInStock amount of product in Stock.
     */
    public Product(float price, int amountInStock) {
        this.id = ID++;
        this.price = price;
        this.amountInStock = amountInStock;
    }

    /**
     * setter and getter function.
     */
    /**
     * getter function that return the price of the product.
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * setter function that update price of the product.
     *
     * @param amountInStock new price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * getter function that return the amountInStock of the product.
     *
     * @return amountInStock
     */
    public int getAmountInStock() {
        return amountInStock;
    }

    /**
     * setter function that update amountInStock of the product.
     *
     * @param amountInStock new amountInStock
     */
    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    /**
     * getter function that return product id.
     *
     * @return product id
     */
    public int getId() {
        return id;
    }

    /**
     * this function check if we can purchase this product or not. we can
     * purchase a product if the amount needed if available in store
     *
     * @param amount needed amount to purchase
     * @return true if this amount can be purchases, otherwise it return false.
     */
    public boolean canPurchase(int amount) {
        return this.amountInStock - amount >= 0;
    }

    /**
     * this function make the purchase by subtract the needed amount from the
     * amount available in store.
     *
     * @param amount needed amount to purchase
     */
    public void makePurchase(int amount) {
        this.amountInStock -= amount;
    }

    /**
     * return product info to display in menu.
     *
     * @return info
     */
    public String getInfo() {
        return this.price + "";
    }

    /**
     * return string of this Product.
     *
     * @return
     */
    @Override
    public abstract String toString();

    /**
     * this function compare two products based on their price.
     * @param product that we want to compare it 
     * @return positive value if this price greater than given product, 0 value
     *      if this price equal given product, otherwise it return negative value
     */
    @Override
    public int compareTo(Product product){
        return (int)(this.price - product.price);
    }
}
