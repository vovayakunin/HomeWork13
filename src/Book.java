public class Book {
    private String name;
    int year;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
