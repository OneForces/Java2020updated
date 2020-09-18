package Laba3.Book;

public class BookProperties {
    private String author;
    private String name;
    private int year;

    BookProperties(String a, String n, int y) {
        setAuthor(a);
        setName(n);
        setYear(y);
    }

    public void setAuthor(String author) {
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year=year;
    }

    public int getYear() {
        return year;
    }
}
