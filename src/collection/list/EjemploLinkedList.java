package collection.list;

import collection.alumno.Alumno;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size: " +enlazada.size());
        System.out.println("Está vacía?: " + enlazada.isEmpty());

        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Lucy", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andrés", 3));

        System.out.println(enlazada + ", size: " +enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5)); // Agregar al principio, desplaza los elementos
        enlazada.addLast(new Alumno("Atenea", 6)); // Agregar al final

        System.out.println(enlazada + ", size: " +enlazada.size());

        System.out.println("Primero: " + enlazada.getFirst()); // Objeter el primero
        System.out.println("Último: " + enlazada.getLast());
        System.out.println("Último: " + enlazada.peekLast()); // No se desborda
        System.out.println("Índice 2: " +enlazada.get(2)); // Con índice

        Alumno zeus = enlazada.removeFirst(); // Elimina de la lista y lo extrae para trabajar en otro lado
        // enlazada.pollLast(); // No lanza excepción
        enlazada.removeLast();

        System.out.println(enlazada + ", size: " +enlazada.size());

        // Podemos eliminar objeto mediante índice o instancia
        enlazada.remove(new Alumno("Jano", 7));
        System.out.println(enlazada + ", size: " +enlazada.size());

        Alumno a = new Alumno("Lucas", 5);
        enlazada.addLast(a); // Agregamos al último elemento
        System.out.println(enlazada + ", size: " +enlazada.size());
        System.out.println("Indice de Lucas: " + enlazada.indexOf(a));

        // Eliminar por índice
        // enlazada.remove(2);

        enlazada.set(3, new Alumno("Lalo", 7)); // Reemplaza en la posición 3

        ListIterator<Alumno> li = enlazada.listIterator();

        // Iterar hacia adelante
        System.out.println();
        while (li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }

        System.out.println();

        // Iterar hacia atrás
        while (li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }



    }
}
