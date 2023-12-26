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
        Component mucaltin = new Component("mucaltin", " 15 mg", 80);
        Component nosephrine = new Component("nosephrine", " 19 mg", 20);

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.aadComponents(nayz, acetyl);

        IterablePharmacy pharmacy1 = new IterablePharmacy();
        pharmacy1.aadComponents(acetyl, paracetamol);

//        for (Component comp : pharmacy1) {
//            System.out.println(comp);
//        }

        List<Component> list = new ArrayList<>();
        list.add(nayz);
        list.add(paracetamol);
        list.add(acetyl);
        list.add(mucaltin);
        list.add(nosephrine);

        Collections.sort(list);

//        System.out.println(list);

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        IterablePharmacy headaches = new IterablePharmacy();
        headaches.aadComponents(acetyl, nayz);

        IterablePharmacy pain = new IterablePharmacy();
        pain.aadComponents(acetyl, paracetamol, nayz);

        IterablePharmacy snot = new IterablePharmacy();
        snot.aadComponents(acetyl, nosephrine);

        IterablePharmacy cough = new IterablePharmacy();
        cough.aadComponents(acetyl, paracetamol, mucaltin);

        IterablePharmacy snotty = new IterablePharmacy();
        snotty.aadComponents(acetyl, nosephrine);

        //System.out.println(snotty);


    }
}
