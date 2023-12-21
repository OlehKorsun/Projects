package Zestaw20TomaszewskiZadanie4;

public class Product {
    private String name;
    private double price;
    private ShoppingCart shoppingCart;

    public Product(String name, double price, ShoppingCart shop){
        this.name = name;
        this.price = price;
        this.shoppingCart = shop;
    }

    public void addToShoppingCart(){
        this.shoppingCart.addProduct(this);
    }

    public String toString(){
        return "[Nazwa: " + this.name + ", Cena: " + this.price + "]";
    }

    public ShoppingCart getCart(){
        return this.shoppingCart;
    }
}
