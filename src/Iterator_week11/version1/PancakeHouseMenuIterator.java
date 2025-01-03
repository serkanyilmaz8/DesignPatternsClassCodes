package Iterator_week11.version1;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position<items.size() && items.get(position)!=null;
    }

    @Override
    public Object next() {
        return items.get(position++);
    }
}
