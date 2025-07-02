package utils;

import java.util.Comparator;
import modelo.Contacto;

public class ContactoComparatorConNumero implements Comparator<Contacto>{

    
    @Override
    public int compare(Contacto o1, Contacto o2) {
    //Contacto orden alfabéticamente por apellido, luego por nombre y finalmente por telefono
        int apellidoComparison = o1.getApellido().compareTo(o2.getApellido());
        if (apellidoComparison != 0) {
            return apellidoComparison;
        }
        // Si los apellidos son iguales, comparar por nombre
         //Si son iguales, comparar por numero de telefono alfabéticamente
        int nombreComparacion = o1.getNombre().compareTo(o2.getNombre());

        if (nombreComparacion != 0) {
            return nombreComparacion;
        }
    
        return o2.getTelefono().compareTo(o1.getTelefono());    
        
    }
    
}
