package Zestaw20TomaszewskiZadanie4;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart("Jess");

        Product prod1 = new Product("Cola", 10, cart1);
        Product prod2 = new Product("Chleb", 4, cart1);
        Product prod3 = new Product("Ciastko", 15, cart1);
        Product prod4 = new Product("RedBull", 7, cart1);

        prod1.addToShoppingCart();
        prod2.addToShoppingCart();
        prod3.addToShoppingCart();
        prod4.addToShoppingCart();

        ShoppingCart.displayProduct(cart1);
    }
}
