package utils;

import java.util.Comparator;
import modelo.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    

   /*  public int compare(modelo.Contacto c1, modelo.Contacto c2) {
        // Primero comparar por apellido
        int apellidoComparison = c1.getApellido().compareTo(c2.getApellido());
        if (apellidoComparison != 0) {
            return apellidoComparison;
        }
        // Si los apellidos son iguales, comparar por nombre
        return c1.getNombre().compareTo(c2.getNombre());
    }  */

    //Primero apellido orden alfabetico,
    @Override
    public int compare(Contacto o1, Contacto o2) {
    // Primero comparar por apellido
        int apellidoComparison = o1.getApellido().compareTo(o2.getApellido());
        if (apellidoComparison != 0) {
            return apellidoComparison;
        }
        // Si los apellidos son iguales, comparar por nombre
        return o1.getNombre().compareTo(o2.getNombre());
        
    }

    //Si som iguales, comparar por nombre  al fabético
    
}
