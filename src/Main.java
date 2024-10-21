public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Author
        Author author1 = new Author("AuthorName1", "author1@example.com", 'M');
        Author author2 = new Author("AuthorName2", "author2@example.com", 'F');

        // Tạo mảng các tác giả
        Author[] authors = { author1, author2 };

        // Tạo đối tượng Book
        Book book = new Book("Java Programming", authors, 29.99, 100);

        // In thông tin của sách
        System.out.println(book);

        // In tên các tác giả
        System.out.println("Authors: " + book.getAuthorNames());
    }
}
