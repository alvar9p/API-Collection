package collection.list;

import collection.alumno.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        // Método también sirve para LinkedList

        List<Alumno> sa = new ArrayList<>(); // Puede ser LinkedList<> para lista enlazada
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Lucy", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrés", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 3));
        sa.add(new Alumno("Lucas", 2));

        // Con esta clase ordenamos la lista (sa), está el ordenamiento de la clase Alumno
        // Método sort tiene implementado en método comparator y puede hacer sobrecarga
        // Collections.sort(sa, (a,b) -> b.getNota().compareTo(a.getNota()));
        // sa.sort((a,b) -> b.getNota().compareTo(a.getNota()));
        sa.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed());
        // sa.sort(Comparator.comparing(Alumno::getNombre).reversed()); // Forma simplificada, sirve para TreeSet

        sa.forEach(System.out::println);

    }
}
