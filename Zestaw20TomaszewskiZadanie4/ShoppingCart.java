package Zestaw20TomaszewskiZadanie4;

public class ShoppingCart {
    private String name;
    private Product[] products;
    private int productCount;

    public ShoppingCart(String name){
        this.name = name;
        this.productCount = 0;
        this.products = new Product[10];
    }

    public void addProduct(Product product){
        this.products[this.productCount] = product;
        this.productCount++;
    }

    public static void displayProduct(ShoppingCart shop){
        for(Product prod: shop.products)
            System.out.println(prod);
    }
}
