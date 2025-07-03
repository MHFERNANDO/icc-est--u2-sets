package controlador;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {
    
    public Ejercicios() {
        System.out.println("Ejercicio 1");
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45}));
        System.out.println("Ejercicio 2");
        System.out.println(esIsograma("camaleon"));
        System.out.println(esIsograma("murcielago"));
        System.out.println("Ejercicio 3");
        System.out.println(contarPalabrasUnidas("La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?\n" + //
                        "\n" + //
                        "            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.\n" + //
                        "\n" + //
                        "            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.\n" + //
                        "\n" + //
                        ""));
    }
    
    public boolean tieneDuplicados(int [] numeros) {
        Set<Integer> conjuntoNumeros = new HashSet<>();
        for (int i = 0 ; i < numeros.length; i++) {
            if (!conjuntoNumeros.add(numeros[i])) {
                System.out.println("El número " + numeros[i] + " es duplicado.");
                return true;
            }
        }
        return false;
    }
    public boolean esIsograma(String palabra){
        Set<Character> conjuntoCaracteres = new HashSet<>();
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (!conjuntoCaracteres.add(caracter)) {
                return false;
            }
        }
        return true;

        
    }
    public int contarPalabrasUnidas(String frase){
        
        int contador =0;
        Set<String> conjuntoPalabras = new HashSet<>();
        String [] palabra = frase.split(" ");
        for (int i = 0; i < palabra.length; i++) {
            if (conjuntoPalabras.add(palabra[i])) {
                contador ++;
            }
        }
        return contador;
    }
}
