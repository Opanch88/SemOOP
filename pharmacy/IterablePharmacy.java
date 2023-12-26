package pharmacy;

import java.util.*;

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
@Override
public String toString() {
    return "IterablePharmacy{" +
            "index=" + index +
            ", components=" + components +
            '}';
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IterablePharmacy that = (IterablePharmacy) o;
        return index == that.index && Objects.equals(components, that.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, components);
    }

}



