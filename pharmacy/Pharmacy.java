package pharmacy;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {
    private int index;
    private final List<Component> components;

    public Pharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();

    }

    public void aadComponents(Component... components) {
        if (components.length == 0) System.out.println("Не добавлено! ");
        else Collections.addAll(this.components, components);
    }


    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }
}
