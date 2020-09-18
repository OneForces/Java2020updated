package Laba3.Book;

public class Book {
    private BookProperties count[] = new BookProperties[1];
    private int counter = 0;

    public void setSettings(String author, String name, int year) {
        count[counter] = new BookProperties(author, name, year);
        counter++;
    }

    public void allInfo() {
        System.out.println(count[0].getAuthor());
        System.out.println(count[0].getName());
        System.out.print(count[0].getYear());
    }
}
