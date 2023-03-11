public class Book {

    private long id;
    private String name;
    private String author;
    private int prise;
    private BookGenre genre;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrise() {
        return prise;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public Book(long id, String name, String author, int prise, BookGenre genre) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.prise = prise;
        this.genre = genre;
    }


}
