public class FictionBook extends Book {
    private String category;
    public FictionBook(){
    }
    public FictionBook(String category,String name,String author,double price,String bookCode){
        super(name,author, (int) price,bookCode);
        this.category=category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
