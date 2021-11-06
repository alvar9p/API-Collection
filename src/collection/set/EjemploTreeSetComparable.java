package collection.set;

import collection.alumno.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        // Como este método elimina los duplicados, si por ejemplo quiero comparar por nombres (y hay un duplicado)
        // este me va a borrar el nombre (aunque tenga una nota diferente), se hace el cambio en el compareTo

        // Comparar nombres ascendente (a,b) -> a.getNombre().compareTo(b.getNombre())
        // Comparar nombres descendente (a,b) -> b.getNombre().compareTo(a.getNombre())
        Set<Alumno> sa = new TreeSet<>((a,b) -> b.getNombre().compareTo(a.getNombre()));
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Lucy", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrés", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));

        System.out.println(sa);
    }
}
