package entities;

public class Product {
    
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name
            + ", R$"
            + String.format("%.2f", price) 
            + ", estoque = " 
            + quantity 
            + ", Valor Total = R$ "
            + String.format("%.2f", totalValueInStock());
    }
    
}
