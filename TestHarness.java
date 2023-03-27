
import java.util.ArrayList;
import java.util.Scanner;

/**
 * this is the TestHarness Class.
 *
 * @author alimaconde
 * @version 1.1
 */
public class TestHarness {

    /**
     * class attributes.
     */
    private Scanner input = new Scanner(System.in);
    private BookStore bookStore;

    /**
     * class Functions.
     */
    /**
     * this function add new Regular Member to book store.
     */
    public void addNewRegularMember() {
        System.out.println("Adding new Regular Member");
        String name, phoneNumber, emailAddress;
        input.nextLine();
        System.out.print("enter Member Name: ");
        name = input.nextLine().trim();
        System.out.print("enter Member phone number: ");
        phoneNumber = input.nextLine().trim();
        System.out.print("enter Member email address: ");
        emailAddress = input.nextLine().trim();
        bookStore.addNewRegularMember(name, phoneNumber, emailAddress);
        System.out.println("New Regular Member Added Successfully");
    }

    /**
     * this function add new Premium Member to book store.
     */
    public void addNewPremiumMember() {
        System.out.println("Adding new Premium Member");
        String name, phoneNumber, emailAddress;
        boolean feeDue;
        input.nextLine();
        System.out.print("enter Member Name: ");
        name = input.nextLine().trim();
        System.out.print("enter Member phone number: ");
        phoneNumber = input.nextLine().trim();
        System.out.print("enter Member email address: ");
        emailAddress = input.nextLine().trim();
        System.out.println("1- pay Fee later\n2- pay Fee");
        int choice = input.nextInt();
        if (choice == 1) {
            feeDue = true;
        } else {
            feeDue = false;
        }
        bookStore.addNewPremiumMember(name, phoneNumber, emailAddress, feeDue);
        System.out.println("New Premium Member Added Successfully");

    }

    /**
     * this function add new Book to book store.
     */
    public void addNewBook() {
        System.out.println("Adding new Book Product");
        String name, author;
        float price;
        int amountInStock;
        input.nextLine();
        System.out.print("enter book name: ");
        name = input.nextLine().trim();
        System.out.print("enter book author: ");
        author = input.nextLine().trim();
        System.out.print("enter book price: ");
        price = input.nextFloat();
        System.out.print("enter amount of this book in stock: ");
        amountInStock = input.nextInt();
        bookStore.addNewBook(name, author, price, amountInStock);
        System.out.println("New Book Added Successfully");
    }

    /**
     * this function add new CD to book store.
     */
    public void addNewCD() {
        System.out.println("Adding new CD Product");
        String contentTitle;
        int size, amountInStock;
        float price;
        input.nextLine();
        System.out.print("enter CD content title: ");
        contentTitle = input.nextLine().trim();
        System.out.print("enter CD size: ");
        size = input.nextInt();
        System.out.print("enter CD price: ");
        price = input.nextFloat();
        System.out.print("enter amount of this CD in stock: ");
        amountInStock = input.nextInt();
        bookStore.addNewCD(contentTitle, size, price, amountInStock);
        System.out.println("New CD Added Successfully");
    }

    /**
     * this function add new DVD to book store.
     */
    public void addNewDVD() {
        System.out.println("Adding new DVD Product");
        String contentTitle;
        String filmName;
        float weight, price;
        int amountInStock;
        input.nextLine();
        System.out.print("enter DVD film name: ");
        filmName = input.nextLine().trim();
        System.out.print("enter DVD weight: ");
        weight = input.nextFloat();
        System.out.print("enter DVD price: ");
        price = input.nextFloat();
        System.out.print("enter amount of this DVD in stock: ");
        amountInStock = input.nextInt();
        bookStore.addNewDVD(filmName, weight, price, amountInStock);
        System.out.println("New DVD Added Successfully");
    }

    public int getMemberID() {
        ArrayList<Member> members = bookStore.getStoreMembers();
        int choice;
        while (true) {
            try {
                for (Member m : members) {
                    System.out.println(m.getId() + " " + m.getInfo());
                }
                System.out.print("Eneter member id: ");
                choice = input.nextInt();
                if (bookStore.isMember(choice)) {
                    return choice;
                }
                System.out.println("Invalid Choice please try again!!!\n");
            } catch (Exception ex) {
                System.out.println("Invalid Choice please try again!!!\n");
            }
        }
    }

    public int getProductID() {
        ArrayList<Product> products = bookStore.getStoreProducts();
        int choice;
        while (true) {
            try {
                for (Product p : products) {
                    System.out.println(p.getId() + " " + p.getInfo());
                }
                System.out.print("Eneter product id: ");
                choice = input.nextInt();
                if (bookStore.isProduct(choice)) {
                    return choice;
                }
                System.out.println("Invalid Choice please try again!!!\n");
            } catch (Exception ex) {
                System.out.println("Invalid Choice please try again!!!\n");
            }
        }
    }

    /**
     * this function display a menu for purchase a Product.
     */
    public void purchaseProduct() {
        if (bookStore.getStoreMembers().size() == 0) {
            System.out.println("there are any Members in book store");
            return;
        }
        if (bookStore.getStoreProducts().size() == 0) {
            System.out.println("there are any products in book store");
            return;
        }
        System.out.println("Making Purchase");
        int memberID = getMemberID();
        int productID = getProductID();
        int amoutn;
        System.out.print("enter amount you need: ");
        amoutn = input.nextInt();
        bookStore.makePurchase(memberID, productID, amoutn);
    }

    /**
     * this function display a menu for adding a new member.
     */
    public void addNewMember() {
        int choice;
        while (true) {
            try {
                System.out.println("Adding new Member Menu:");
                System.out.println("\t1- Regular Member");
                System.out.println("\t2- Premium Member");
                System.out.println("\t3- Back");
                choice = input.nextInt();
                if (choice == 1) {
                    addNewRegularMember();
                } else if (choice == 2) {
                    addNewPremiumMember();
                } else if (choice == 3) {
                    break;
                } else {
                    System.out.println("Invalid Choice please try again!!!\n");
                }
                System.out.println("\n");
            } catch (Exception ex) {
                System.out.println("Invalid Choice please try again!!!\n");
            }
        }
    }

    /**
     * this function display a menu for adding new Product.
     */
    public void addNewProduct() {
        int choice;
        while (true) {
            try {
                System.out.println("Adding new Product Menu:");
                System.out.println("\t1- Book");
                System.out.println("\t2- CD");
                System.out.println("\t3- DVD");
                System.out.println("\t4- Back");
                choice = input.nextInt();
                if (choice == 1) {
                    addNewBook();
                } else if (choice == 2) {
                    addNewCD();
                } else if (choice == 3) {
                    addNewDVD();
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Invalid Choice please try again!!!\n");
                }
                System.out.println("\n");
            } catch (Exception ex) {
                System.out.println("Invalid Choice please try again!!!\n");
            }
        }
    }

    /**
     * this function display a Statistic for book store
     */
    public void printStatistic() {
        System.out.println("\nBook Store Statistic");
        System.out.println("Book Store Members:");
        ArrayList<Member> members = bookStore.getStoreMembers();
        int i;
        for (i = 1; i <= members.size(); i++) {
            System.out.println("\t" + i + "- " + members.get(i - 1));
        }
        System.out.println("Book Store Products:");
        ArrayList<Product> products = bookStore.getStoreProducts();
        for (i = 1; i <= products.size(); i++) {
            System.out.println("\t" + i + "- " + products.get(i - 1));
        }
    }

    private Product getProductByID(int productID) {
        Product product = null;
        ArrayList<Product> products = bookStore.getStoreProducts();
        for (Product p : products) {
            if (p.getId() == productID) {
                product = p;
                break;
            }
        }
        return product;
    }

    /**
     * this function comparetwoProducts.
     */
    public void comparetwoProducts() {
        if (bookStore.getStoreProducts().size() == 0) {
            System.out.println("there are any products in book store");
            return;
        }
        System.out.println("Comparing Two Products");
        int productID1 = getProductID();
        int productID2 = getProductID();
        Product product1 = getProductByID(productID1);
        Product product2 = getProductByID(productID2);
        if(product1 == null || product2 == null){
            System.out.println("Invalid Product id");
            return;
        }
        if(product1.compareTo(product2) == 0){
            System.out.println("product "+productID1 +" equal product "+productID2+" (comparison based on Price of product)");
        }
        else if(product1.compareTo(product2) > 0){
            System.out.println("product "+productID1 +" greater than product "+productID2+" (comparison based on Price of product)");
        }
        else{
            System.out.println("product "+productID1 +" smaller than product "+productID2+" (comparison based on Price of product)");
        }
    }
    
    /**
     * this function restockProduct in inventory.
     */
    public void restockProduct(){
        if (bookStore.getStoreProducts().size() == 0) {
            System.out.println("there are any products in book store");
            return;
        }
        System.out.println("Restock Product");
        int productID = getProductID();
        System.out.print("enter amount of this product to restock:  ");
        int amount = input.nextInt();
        bookStore.restockProduct(productID, amount);
        System.out.println("product "+productID+" has been restock successfully");
         
    }

    /**
     * this function display the main menu and execute user choice.
     */
    public void mainMenu() {
        bookStore = new BookStore();
        int choice;
        while (true) {
            try {
                System.out.println("Welcome to BookStore System");
                System.out.println("Select from one of the following options:");
                System.out.println("\t1- Make a Purchase");
                System.out.println("\t2- Add a new member");
                System.out.println("\t3- Add a new Product");
                System.out.println("\t4- Compare two Products");
                System.out.println("\t5- restock Product");
                System.out.println("\t6- display inventory total dollar");
                System.out.println("\t7- print Book Store Statistic");
                System.out.println("\t8- Exit");
                choice = input.nextInt();
                if (choice == 1) {
                    purchaseProduct();
                } else if (choice == 2) {
                    addNewMember();
                } else if (choice == 3) {
                    addNewProduct();
                } else if (choice == 4) {
                    comparetwoProducts();
                } else if (choice == 5) {
                    restockProduct();
                } else if (choice == 6) {
                    System.out.println("inventory total dollar = " + bookStore.inventoryValue() + "$");
                } else if (choice == 7) {
                    printStatistic();
                } else if (choice == 8) {
                    break;
                } else {
                    System.out.println("Invalid Choice please try again!!!\n");
                }
            } catch (Exception ex) {
                System.out.println("Invalid Choice please try again!!!\n");
            }
        }
    }

    /**
     * this is the main function.
     *
     * @param args
     */
    public static void main(String[] args) {
        TestHarness testHarness = new TestHarness();
        testHarness.mainMenu();
        System.out.println("End of BookStore System");
        System.out.println("Thank you for your time");
    }

}
