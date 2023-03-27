
import java.util.ArrayList;


/**
 * the BookStore Class.
 *
 * @author alimaconde 
 * @version 1.1
 */
public class BookStore implements BookStoreSpecification{

    /**
     * class attributes
     */
    // keeps track of the book store members
    private ArrayList<Member> members;

    // keeps track of the book store products
    private ArrayList<Product> products;

    /**
     * class functions
     */

    /**
     * default constructor to initialize data members
     */

    public BookStore() {
        members = new ArrayList<>();
        products = new ArrayList<>();
    }

    /**
     * this function adds New Regular Member to the book store
     *
     * @param name members name
     * @param phoneNumber members phoneNumber
     * @param emailAddress members emailAddress
     */

    public void addNewRegularMember(String name, String phoneNumber, String emailAddress) {
        members.add(new RegularMember(name, phoneNumber, emailAddress));
    }

    /**
     * this function adds New Premium Member to the book store
     *
     * @param name member name
     * @param phoneNumber member phoneNumber
     * @param emailAddress member emailAddress
     * @param feeDue member feeDue
     */

    public void addNewPremiumMember(String name, String phoneNumber, String emailAddress, boolean feeDue) {
        members.add(new PremiumMember(name, phoneNumber, emailAddress, feeDue));
    }

    /**
     * this function adds 'New Book' to the book store
     *
     * @param name book name
     * @param author book author
     * @param price book price
     * @param amountInStock book amount
     */

    public void addNewBook(String name, String author, float price, int amountInStock) {
        this.products.add(new Book(name, author, price, amountInStock));
    }

    /**
     * this function adds 'New CD' to the book store
     *
     * @param contentTitle CD contentTitle
     * @param size CD size
     * @param price CD price
     * @param amountInStock CD amountInStock
     */
    public void addNewCD(String contentTitle, int size, float price, int amountInStock) {
        this.products.add(new CD(contentTitle, size, price, amountInStock));
    }

    /**
     * this function adds 'New DVD' to the book store.
     *
     * @param filmName DVD film name
     * @param weight DVD weight
     * @param price DVD price
     * @param amountInStock DVD amountInStock
     */
    public void addNewDVD(String filmName, float weight, float price, int amountInStock) {
        this.products.add(new DVD(filmName, weight, price, amountInStock));
    }

    /**
     * this function checks if a given member is a member in Book Store
     * it returns true if the member if exists, otherwise it return false
     *
     * @param id member ID
     * @return
     */
    public boolean isMember(int id) {
        boolean exists = false;
        for (Member m : members) {
            if (m.getId() == id) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    /**
     * this function checks if a given product is a product in Book Store. 
     * it returns true if this product exists, otherwise it return false
     *
     * @param id member ID
     * @return
     */
    public boolean isProduct(int id) {
        boolean exists = false;
        for (Product p : products) {
            if (p.getId() == id) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    /**
     * this function makes purchase if possible
     * @param memberID memberID
     * @param productID productID
     * @param amount needed amount
     */
    public void makePurchase(int memberID, int productID, int amount) {
        Member member = null;
        for (Member m : members) {
            if (m.getId() == memberID) {
                member = m;
                break;
            }
        }

        Product product = null;
        for (Product p : products) {
            if (p.getId() == productID) {
                product = p;
                break;
            }
        }

        if (product.canPurchase(amount)) {
            product.makePurchase(amount);
            member.makePurchase(product,amount);
            System.out.println("Member " + member.getName() + " has purchased " + amount + " item from " + product.getInfo());
        } else {
            System.out.println("Member " + member.getName() + " can not  purchase " + amount + " item from " + product.getInfo());
        }
    }
    
    /**
     * the getter function that returns book store products
     * @return book store products
     */
    public ArrayList<Product> getStoreProducts(){
        return this.products;
    }
    
    /**
     * the getter function that returns book store Members
     * @return book store Members
     */
    public ArrayList<Member> getStoreMembers(){
        return this.members;
    }

    @Override
    public int restockProduct(int productID, int amount) {
        int val = 0;
        if(amount < 0)
            return val;
        for(Product product: products){
            if(product.getId() == productID){
                val = product.getAmountInStock()+amount;
                product.setAmountInStock(val);
                break;
            }
        }
        return val;
    }

    
    @Override
    public double inventoryValue() {
        double value = 0;
        for(Product product: products){
            value += (product.getPrice()*product.getAmountInStock());
        }
        return value;
        
    }
}

