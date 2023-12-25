package pharmacy;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PharmacyMain {
    public static void main(String[] args) {
        Component nayz = new Component("peneciline", " 10 mg", 100);
        Component paracetamol = new Component("paracetamol", " 5 mg", 30);
        Component acetyl = new Component("acetyl", " 8 mg", 120);

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.aadComponents(nayz, acetyl);

        IterablePharmacy pharmacy1 = new IterablePharmacy();
        pharmacy1.aadComponents(acetyl, paracetamol);

        for (Component comp : pharmacy1) {
            System.out.println(comp);
        }

        List<Component> list = new ArrayList<>();
        list.add(nayz);
        list.add(paracetamol);
        list.add(acetyl);
        Collections.sort(list);
        System.out.println(list);
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
