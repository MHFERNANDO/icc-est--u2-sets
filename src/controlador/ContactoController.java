package controlador;

import java.util.Set;
import java.util.TreeSet;

import modelo.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorConNumero;

public class ContactoController {

    public ContactoController() {
        // Constructor vacío
        
        runTreeContactos();
        runTreeContactosConNombre();
    }

    private void runTreeContactos() {
        ContactoComparator contactoComparator = new ContactoComparator();
        
        Set<Contacto> agenda = new TreeSet<>(contactoComparator);
        
        // Agregamos algunos contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        for (Contacto contacto : agenda) {
            System.out.println(contacto.toString());
        }


        System.out.println("---TreeSet de Contactos---");
        
        
    }
    
    private void runTreeContactosConNombre() {
        ContactoComparatorConNumero contactoComparatorConNumero = new ContactoComparatorConNumero();
        Set<Contacto> agenda = new TreeSet<>(contactoComparatorConNumero);
        
        // Agregamos algunos contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        for (Contacto contacto : agenda) {
            System.out.println(contacto.toString());
        }


        System.out.println("---TreeSet de Contactos---");
        
        
    }
}
