package collection.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        // No permite elementos duplicados
        // Los set no se pueden ordenar, si uso un sort me marca error
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

        boolean b = hs.add("tres");
        System.out.println("Permite elementos duplicados? " + b);
        System.out.println(hs);
    }
}
