package Library;

public class Book {
    //properties
    private String title;
    private String ISBN;
    private String yearofPublication;
    private String authorName;
    //method to display book details
    public void showBooks(){
        System.out.println("Title: "+ getTitle());
        System.out.println("ISBN: "+ getISBN());
        System.out.println("Year of Publication: "+ getYearofPublication());
        System.out.println("Author Name: "+ getAuthorName());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getYearofPublication() {
        return yearofPublication;
    }

    public void setYearofPublication(String yearofPublication) {
        this.yearofPublication = yearofPublication;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
