package sample.parser.Model;

import java.util.List;

public class Root {
    private long count;
    public List<Items> items;

    public long getCount() {
        return count;
    }

    public List<Items> getDeclarationNumber() {
        return items;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void setDeclarationNumber(List<Items> items) {
        this.items = items;
    }


    @Override
    public String toString() {
        return ("Count = " + count + "items = " + items);
    }
}
