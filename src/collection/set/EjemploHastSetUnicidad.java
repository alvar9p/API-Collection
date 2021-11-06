package collection.set;

import collection.alumno.Alumno;

import java.util.*;

public class EjemploHastSetUnicidad {
    public static void main(String[] args) {

        // TreeSet es un árbol balanceado y compara mediante el ordenamiento que le demos
        // HashSet mediante equal y HashCode
        Set<Alumno> sa = new HashSet<>();

        // Cuando imprimo una lista, estos se muestran a medida que se van implementando
        // a menos que implementemos el método sort
        // List<Alumno> sa = new ArrayList<>(); // Puede ser LinkedList<> para lista enlazada
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Lucy", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrés", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 3));
        sa.add(new Alumno("Lucas", 2));

        System.out.println(sa);

        System.out.println("Iterando con foreach");
        for (Alumno a: sa){
            // Si solo quiero imprimir nombres -> a.getNombre()
            // lo mismo con las notas -> a.getNota()
            System.out.println(a);
        }

        System.out.println("\nUsando while e iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){ // Mientras tenga un siguiente
            Alumno a = it.next(); // Imprime el siguiente
            System.out.println(a); // Puede imprimir el objeto o parámetros como foreach
        }

        System.out.println("\nExpresiones lambda");
        // Forma optimizada System.out::println
        // Todos los objetos de la clase Collection lo tienen
        sa.forEach(a -> System.out.println(a));

        // Iterando la lista con un for clásico
        /*System.out.println("\nUtilizando for clásico para la lista");
        for (int i = 0; i < sa.size(); i++){ // La lista devuelve el tamaño con el método size()
            Alumno a = sa.get(i); // Devuelve el valor de i con el método get
            System.out.println(a.getNombre()); // Devuelve el valor que se le pida
        }

         */
    }
}
