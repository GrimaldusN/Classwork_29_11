import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main extends CollectionProcessor {
    public static void main(String[] args) {
        Book One = new Book("one", "Georg", Genre.FANTASY, BookStatus.AVAILABLE, LocalDate.of(1990,11,5), 556);
        Book Two = new Book("two", "Ivan", Genre.FANTASY, BookStatus.AVAILABLE, LocalDate.of(1985,5,15), 256);
        Book Three = new Book("three", "Dima", Genre.FANTASY, BookStatus.AVAILABLE, LocalDate.of(1997,9,21), 396);
        Book Four = new Book("four", "Misha", Genre.FANTASY, BookStatus.AVAILABLE, LocalDate.of(1991,1,7), 154);
        Magazine Igromania = new Magazine("Igromania", "Igor", Genre.NON_FICTION, 55456, LocalDate.of(2023,11,29), true);

        List<LibraryItem> list = new ArrayList<>();
        list.add(One);
        list.add(Two);
        list.add(Three);
        list.add(Four);
        list.add(Igromania);

    }
}