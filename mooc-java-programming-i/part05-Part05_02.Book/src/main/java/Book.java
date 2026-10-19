public class Book {
    private String name;
    private String author;
    private int page;
    
    public Book(String author,String name,int page){
        this.name = name;
        this.author = author;
        this.page = page;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.page;
    }
    
    public String toString(){
        return this.author+", "+this.name+", "+this.page+" pages";
    }
}