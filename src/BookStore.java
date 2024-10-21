public class BookStore {
    private Book[] books;

    public BookStore(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        Book[] newBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[newBooks.length - 1] = book;
        books = newBooks;
    }

    public Book getBook(String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }

    public Author[] getAuthors(String bookName) {
        Book book = getBook(bookName);
        if (book != null) {
            return book.getAuthors();
        }
        return null;
    }

    public void setBookPrice(String bookName, double price) {
        Book book = getBook(bookName);
        if (book != null) {
            book.setPrice(price);
        }
    }

    public void setBookQty(String bookName, int qty) {
        Book book = getBook(bookName);
        if (book != null) {
            book.setQty(qty);
        }
    }
}