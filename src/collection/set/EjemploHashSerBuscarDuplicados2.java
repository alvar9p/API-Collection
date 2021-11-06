package collection.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSerBuscarDuplicados2 {
    public static void main(String[] args) {

        // La idea es registrar estos elementos en un set y ver cual está duplicado
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún","Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez: peces){
            if (!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println("Únicos: " + unicos);
        System.out.println("Duplicados: " +duplicados);
    }
}
