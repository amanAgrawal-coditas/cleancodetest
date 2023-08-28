package cleanCode;

import java.util.ArrayList;

class Book {
    private String bookTitle;
    private String bookAuthor;
    private int publicationYear;

    public Book(String bookTitle, String bookAuthor, int publicationYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;
    }

    public Book() {
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void updateDetails(String bookAuthor, int publicationYear, String bookTitle) {
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;
        this.bookTitle = bookTitle;
    }

    public static String getBookByTitle(ArrayList<Book> books, String title) {
        for (Book book : books) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                return book.getBookTitle();
            }
        }
        return "The book with this name does not exists";
    }

    public static void main(String[] args) {
        Book book = new Book();
    }
}



