import java.time.LocalDate;

public class Book extends LibraryItem implements Borrowable, Maintainable {
    BookStatus status;
    LocalDate publishDate;
    int pageCount;

    @Override
    public String toString() {
        return title + " " + author + " " + genre + " " +
                " Status " + status + "," +
                " PulishDate " + publishDate + "," +
                " pageCount " + pageCount;
    }

    public Book(String title, String author, Genre genre, BookStatus status, LocalDate publishDate, int pageCount) {
        super(title, author, genre);
        this.status = status;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
    }

    @Override
    public void borrowItem(User user) {

    }

    @Override
    public void returnItem(User user) {

    }

    @Override
    public boolean isAvailable() {
       if (status == BookStatus.AVAILABLE){
           return true;
       }
       else {
           return false;
       }
    }

    @Override
    public void reoairItem() {

    }

    @Override
    public void updateItemCondition(ItemCondition condition) {

    }

    @Override
    public ItemCondition checkCondition() {
        return null;
    }
}
