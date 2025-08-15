import java.util.ArrayList;
import java.util.List;
// ShoppingCart class
public class ShoppingCart {
    public List<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public double getTotalPrice(){
        double total =0;
        for (Book book: books){
            total += book.getPrice();
        }
        return total;
    }
}
