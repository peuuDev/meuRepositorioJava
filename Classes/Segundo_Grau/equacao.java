package Dev1.POO.Classes.Segundo_Grau;
import java.util.Scanner;
public class equacao {
    double a;
    double b;
    double c;
    
    /**
     * Calcula a raiz quadrada de um número através de iteração.
     * 
     * @param num o número do qual se deseja calcular a raiz quadrada
     * @return a raiz quadrada do número se encontrada, ou -1 se nenhuma raiz quadrada
     *         inteira exata for localizada
     * 
     * @note Este método procura por raízes quadradas inteiras exatas (números inteiros).
     *       A busca incrementa o valor de i até encontrar um número cujo quadrado
     *       seja igual ao valor de entrada.
     * 
     * @example raizQuadrada(9) retorna 3.0
     *          raizQuadrada(10) retorna -1 (sem raiz inteira exata)
     */
    public double raizQuadrada(double num){
        if (num < 0) return -1;  // Raiz de negativo não é real
        double i = 1;
        while (i * i <= num) {
            if (i * i == num) {
                return i;  // Retorna a raiz, não o quadrado
            }
            i++;
            if (i > num) break;  // Evita loop infinito para números grandes
        }
        return -1;  // Não encontrou raiz inteira exata
    }

    public double delta(double a, double b, double c){
        double delta;
        delta = (b * b) - (4 * a * c);
        return delta;
    }

    public double[] raizes(double a, double b, double c, double delta){
        double raizP = (-b + raizQuadrada(delta)) / (2 * a);
        double raizN = (-b - raizQuadrada(delta)) / (2 * a);
        return new double[]{raizP, raizN};
    }

    public void segundoGrau(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-Vindo à calculadora das raízes de X!\nDigite os valores de a, b e c para achar os valores de x1 e x2 na equação:\nax² + bx + c\n");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double delta = delta(a, b, c);
        double[] raizes = raizes(a, b, c, delta);
        System.out.println("x1 = " + raizes[0]);
        System.out.println("x2 = " + raizes[1]);
        sc.close();
    }
}
