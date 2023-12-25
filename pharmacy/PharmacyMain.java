package pharmacy;

import com.sun.tools.javac.Main;

import java.util.Iterator;

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
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
