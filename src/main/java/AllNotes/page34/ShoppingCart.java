package AllNotes.page34;

class ShoppingCart {
    public int cartContents;

    public ShoppingCart(){}

    public void addToCart(){System.out.println("Item added to cart");}

    public void removeFromCart(){System.out.println("Item removed from cart");}
    public void checkOut(){System.out.println("you have purchased the products");}

}

class ShoppingCartTester{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart();
        cart.removeFromCart();
        cart.checkOut();
    }

}