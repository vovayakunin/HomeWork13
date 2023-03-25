public class Book {
    private Author author;
    private String name;
    int year;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
