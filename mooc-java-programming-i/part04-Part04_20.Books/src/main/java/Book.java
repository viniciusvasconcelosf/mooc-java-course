public class Book {
 
    String title;
    private int pages;
    private int publicationYear;
 
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
 
    public String toString(){
        return this.title+", "+this.pages+" pages, "+this.publicationYear;
    }
}