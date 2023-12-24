package phapmacy;

import java.util.Iterator;

public class ComponentIterator implements Iterator<Component> {
    private int index = 0;
    private IterablePharmacy pharmacy;

    public ComponentIterator(IterablePharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    @Override
    public boolean hasNext() {
        return index < pharmacy.getComponents().size(); //сравниваем индекс с длиной списка
    }

    @Override
    public Component next() {
//        component c = components.get(index);
//        index++;
//        return c;
        return pharmacy.getComponents().get(index++);  //получаем элемент индекса и увеличиваем индекс +1
    }
}
