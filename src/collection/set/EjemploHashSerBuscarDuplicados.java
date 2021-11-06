package collection.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSerBuscarDuplicados {
    public static void main(String[] args) {

        // La idea es registrar estos elementos en un set y ver cual está duplicado
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún","Lenguado"};

        Set<String> unicos = new HashSet<>();
        for (String pez: peces){
            if (!unicos.add(pez)){
                System.out.println("Elemento duplicado: " + pez);
            }
        }
        System.out.println(unicos.size() + "elementos no duplicados: " + unicos);
    }
}
