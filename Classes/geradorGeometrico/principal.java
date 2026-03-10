package Dev1.POO.Classes.geradorGeometrico;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class principal {
    static ArrayList<String> formas = new ArrayList<>();
    
    public static void main(String[] args) {
        quadrado qu = new quadrado(); triangulo tr = new triangulo(); Scanner sc = new Scanner(System.in); Collections.addAll(formas, "", "Quadrado", "Triângulo");
        System.out.println("\nBem-Vindo ao Gerador Geométrico Java!\n\nEscolha uma figura geométrica:\n[1] Quadrado\n[2] Triângulo ");
        int fig = sc.nextInt();
        System.out.println("Escolha um valor para a base do " + formas.get(fig));
        int base = sc.nextInt();
        switch (fig) {
            case 1:
                qu.gerador(base);
                break;
            case 2:
                tr.gerador(base);
                break;
            default:
                break;
        }
    }
}
