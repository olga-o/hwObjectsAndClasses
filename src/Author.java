import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    @Override
    public String toString() {
        return "author = '" + name + " " + surname + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        if (name == null && surname == null) {
            throw new RuntimeException("Both author's name and surname cannot be null");
        }
        return Objects.hash(name, surname);
    }
}
