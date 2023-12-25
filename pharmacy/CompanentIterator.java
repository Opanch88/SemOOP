package pharmacy;

import java.util.Iterator;

public class CompanentIterator implements Iterator<Component> {

    private int index = 0;
    private IterablePharmacy pharmacy;

    public CompanentIterator(IterablePharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    @Override
    public boolean hasNext() {
        return index < pharmacy.getComponents().size();

    }

    @Override
    public Component next() {
        return pharmacy.getComponents().get(index++);
    }

}
