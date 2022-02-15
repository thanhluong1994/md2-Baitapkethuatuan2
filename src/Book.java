import javax.security.auth.callback.LanguageCallback;

public class Book {
    private String bookCode;
    private String name;
    private double price;
    private String author;
    public Book(){
    }
    public Book(String name,String author,int price,String bookCode){
        this.name=name;
        this.author=author;
        this.price=price;
        this.bookCode=bookCode;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return (int) price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return null;
    }
}
