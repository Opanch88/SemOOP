package pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterablePharmacy implements Iterable<Component> {
    private int index;
    private final List<Component> components;

    public IterablePharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();

    }

    public void aadComponents(Component... components) {
        if (components.length == 0) System.out.println("Не добавлено! ");
        else Collections.addAll(this.components, components);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public Iterator<Component> iterator() {
        return new CompanentIterator(this);
    }
//    @Override
//    public Iterator<Component> iterator() {
//        return new Iterator<Component>() {
//            @Override
//            public boolean hasNext() {
//                return index < components.size();
//            }
//
//            @Override
//            public Component next() {
//                return components.get(index++);
//            }
//        };
//    }

}



