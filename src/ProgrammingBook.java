public class ProgrammingBook extends Book{
    private String language;
    private String framework;
    public ProgrammingBook(){
    }
    public ProgrammingBook(String Language,String framework,String name,String author,double price,String bookCode){
        super(name,author, (int) price,bookCode);
        this.framework=framework;
        this.language=Language;
    }
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String Language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
