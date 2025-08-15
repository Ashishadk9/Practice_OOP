public class Main {
    public static void main(String[]args){
        Book b1 = new Book("Java","Hodge",50);
        Book b2 = new Book("OOP","Kathryn",80);
        User user=new User("John");
        user.getCart().addBook(b1);
        user.getCart().addBook(b2);
        System.out.println("Total Price:"+user.getCart().getTotalPrice());
    }
}