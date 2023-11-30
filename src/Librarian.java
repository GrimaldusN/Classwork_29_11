import java.util.List;

public class Librarian implements Maintainable {
    String name;
    String employeeId;
    List<LibraryItem> borrowedItems;

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
