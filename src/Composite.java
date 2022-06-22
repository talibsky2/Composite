import java.util.ArrayList;
import java.util.List;

public class Composite implements AllBooks {
    private List<AllBooks> box = new ArrayList<>();
    void addItem (AllBooks item){
        box.add(item);
    }
    void removeItem (AllBooks item){
        box.remove(item);
    }

    @Override
    public void readMe() {
        for (AllBooks item : box){
            item.readMe();
        }
    }
}
