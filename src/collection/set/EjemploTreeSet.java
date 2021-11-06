package collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        // Ordena de forma altabética (tabla unicode)
        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("tres");
        ts.add("cinco");
        System.out.println(ts);
        System.out.println();

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(10);
        System.out.println(numeros);
        System.out.println();

        // Para hacerlo de forma descendente
        Set<String> ts2 = new TreeSet<>((a,b)->{
            return b.compareTo(a);
        });
        ts2.add("uno");
        ts2.add("dos");
        ts2.add("tres");
        ts2.add("cuatro");
        ts2.add("tres");
        ts2.add("cinco");
        System.out.println(ts2);
        System.out.println();

        // Para simplificar mas aún
        Set<String> ts3 = new TreeSet<>((a,b) -> b.compareTo(a));
        ts3.add("uno");
        ts3.add("dos");
        ts3.add("tres");
        ts3.add("cuatro");
        ts3.add("tres");
        ts3.add("cinco");
        System.out.println(ts2);
        System.out.println();

        // Más fácil aún
        Set<String> ts4 = new TreeSet<>(Comparator.reverseOrder());
        ts4.add("uno");
        ts4.add("dos");
        ts4.add("tres");
        ts4.add("cuatro");
        ts4.add("tres");
        ts4.add("cinco");
        System.out.println(ts2);
        System.out.println();
    }

}
