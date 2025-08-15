// User class
public class User {
    private String name;
    private ShoppingCart cart=new ShoppingCart();
    public User(String name){
        this.name=name;
    }
    public ShoppingCart getCart(){
        return cart;
    }
}
