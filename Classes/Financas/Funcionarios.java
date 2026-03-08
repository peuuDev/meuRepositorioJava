// Implemente uma classe chamada Funcionario que possui atributos (nome, funcao, salario) e um método chamado ajustaSalario que atualiza o salário em 5%. Em seguida, crie uma aplicação que instancia cinco objetos do tipo Funcionario, define os valores dos atributos de cada funcionário e aplica o método ajustaSalario para todos os funcionários.

package Dev1.POO.Classes.Financas;

import java.util.Scanner;
import java.text.Normalizer;

public class Funcionarios {

    String nome;
    String funcao;
    double salario;

    
    public double ajustaSalario(){
        System.out.println(salario);
        salario = salario * 1.05;
        return salario;
    }

    public static String normalize(String str) {//metodo statico que remove caracteres nao ASCII, transformando nomes com acentos em nomes sem acentos(no caso de Júlia, por exemplo, ele transforma para Julia, sem perder informação e prosseguindo com a comparação de dados)
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public static void mostrarSalarioAjustado(){
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println("Digite o nome do funcionário para acessar o seu salário ajustado: ");
        n = sc.nextLine();
        for(Funcionarios f : Principal.listaFuncionarios){
            //perceba que o normalize verifica se possuí acento tanto na variavel n, que será salvo  o valor que string que o usuario digitar, e na variavel f, que é a variavel que está salva no arraylist e que será comparada pelo programa pra identificar se o valor n é igual ao valor f.
            if(normalize(f.nome).equalsIgnoreCase(normalize(n))){ 
                double atual = f.salario;                  // guarda antes de modificar
                double ajustado = f.ajustaSalario();
                System.out.println("Salário atual de " + n + ": R$ " + atual +
                                   "\nSalário ajustado de " + n + ": R$ " + ajustado);
                break;
            }
        } 
        sc.close();
    }
}
