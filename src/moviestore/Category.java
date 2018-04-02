
package moviestore;


public class Category {
    
    private String name;
    private double price;
    private int minRent;

    public Category(String name, double price, int minRent) {
        this.name = name;
        this.price = price;
        this.minRent = minRent;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getMinRent() {
        return minRent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMinRent(int minRent) {
        this.minRent = minRent;
    }
           
}
