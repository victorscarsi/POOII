import java.util.ArrayList;
import java.util.Collections;

public class ExerciciosOrdenacao {
    public static void main(String[] args) {
        ordenarPalavras();
    }

    public static void ordenarPalavras() {
        System.out.println("ORDENAR PALAVRAS");
        
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Tomate");
        lista.add("Acerola");
        lista.add("Laranja");
        System.out.println("Original: " + lista);
        
        Collections.sort(lista);
        System.out.println("Ordenada: " + lista);
        System.out.println();
    }
}
