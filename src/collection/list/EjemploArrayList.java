package collection.list;

import collection.alumno.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size: " +al.size());
        System.out.println("Está vacía?: " + al.isEmpty());

        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Lucy", 4));
        al.add(2, new Alumno("Jano", 7)); // Agrega un elemento en la posición 2
        al.set(3, new Alumno("Andrés", 3)); // Con set no agrega, sino que modifica y el arreglo disminuye

        System.out.println(al + ", size: " +al.size());

        // Elimina el obj, deben ser los datos idénticos
        // Si los datos no son iguales, no se elimina (Alumno -> equals tiene la regla)
        al.remove(new Alumno("Jano", 7));
        System.out.println(al + ", size: " +al.size());

        // Eliminar por el índice
        // al.remove(3);
        // System.out.println(al + ", size: " +al.size());

        boolean b = al.contains(new Alumno("Jano", 7));
        System.out.println("La lista contiene a Jano? " + b);

        boolean c = al.contains(new Alumno("Cata", 6));
        System.out.println("La lista contiene a Jano? " + c);

        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++){
            System.out.println("Desde el arreglo: " +a[i]);
        }


    }
}
