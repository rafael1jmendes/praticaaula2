import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("Java"));
        titulos.add(new Titulo("Python"));
        titulos.add(new Titulo("C++"));

        // Ordenando a lista de títulos
        Collections.sort(titulos);

        // Exibindo os títulos ordenados
        for (Titulo titulo : titulos) {
            System.out.println(titulo);
        }
    }
}