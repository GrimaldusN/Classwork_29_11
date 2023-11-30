public abstract class LibraryItem {
    String title;
    String author;
    Genre genre;

    public LibraryItem(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
}
