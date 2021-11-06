package collection.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {


        // No deja guardar null
        // Comparator.reverseOrder()
        // (a,b)-> b.compareTo(a)
        // Largo nombre de llaves
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Doe");
        // Cuando la llave está repetida va a dejar el último valor
        persona.put("apellido", "Roe");
        persona.put("apellidoPaterno", "Roe");
        persona.put("email", "jhon.doe@email.com");
        persona.put("edad", 30);

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais","USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "128");

        System.out.println(direccion);
        System.out.println(persona);


    }
}
