package Library;

public class BookImpl {
    public static void main(String[] args) {
        //Object of the Book Class
        Book book1 = new Book();
        //Assigning values to the properties
        book1.setTitle("Shiva Trilogy");
        book1.setISBN("9789383260155");
        book1.setYearofPublication("2010");
        book1.setAuthorName("Amish Tripathi");
        // book1.showBooks();
        System.out.println("Title: "+ book1.getTitle());
        System.out.println("ISBN: "+ book1.getISBN());
        System.out.println("Year of Publication: "+ book1.getYearofPublication());
        System.out.println("Author Name: "+ book1.getAuthorName());
    }
}
