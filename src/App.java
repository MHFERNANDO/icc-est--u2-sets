import controlador.ContactoController;
import modelo.Contacto;
import modelo.Sets;
import utils.ContactoComparatorConNumero;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        runHashSet(sets);
        System.out.println("");
        runLinkedSet(sets);
        System.out.println("");
        runTreeSet(sets);
        System.out.println("");
        runTreeSetConComparador(sets);
        System.out.println("");
        runTreeSetConComparadorAlfabetico(sets);
        ContactoController contactoController = new ContactoController();
        ContactoComparatorConNumero contactoComparatorConNumero = new ContactoComparatorConNumero();
    }
    public static void runHashSet (Sets sets){
        //Ejemplo con HashSet
        System.out.println("---HashSet---");
        System.out.println("Elementos del HashSet (no se garantiza orden)");
        System.out.println(sets.construirHashSet());    
    }

    public static void runLinkedSet (Sets sets){
        System.out.println("---LinkedSet---");
        System.out.println("Elementos del LinkedSet (Respeta orden de Insercion)");
        System.out.println(sets.construirLinkedSet());
    }
    public static void runTreeSet (Sets sets){
        System.out.println("---TreeSet---");
        System.out.println("Elementos del TreeSet (Ordenados-Alfabeticamente)");
        System.out.println(sets.construirTreeSet());
    }
    public static void runTreeSetConComparador (Sets sets){
        System.out.println("---TreeSet con Comparador---");
        System.out.println("Elementos del TreeSet (Ordenados por Longitud)");
        System.out.println(sets.construirTreeSetConComparador());
    }
    public static void runTreeSetConComparadorAlfabetico (Sets sets){
        System.out.println("---TreeSet con Comparador Alfabetico---");
        System.out.println("Elementos del TreeSet (Ordenados por Longitud y Alfabeticamente)");
        System.out.println(sets.construirTreeSetConComparador1());
    }
}
