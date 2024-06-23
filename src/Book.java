import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearOfPublication;

    public Book(String name, Author author, int yearOfPublication) {
        if (author == null) {
            System.out.println("Author is mandatory");
            return;
        }
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name = '" + name + '\'' +
                ", " + author.toString() +
                ", yearOfPublication = " + yearOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        if (name == null) {
            throw new RuntimeException("Book name cannot be null");
        }
        return Objects.hash(name, author, yearOfPublication);
    }
}
