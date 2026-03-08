package Dev1.POO.Classes.Financas;
import java.util.Scanner;
import java.util.ArrayList;
public class Principal extends Funcionarios {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Funcionarios> listaFuncionarios = new ArrayList<>();
    public static void main(String[] args) {
        
        Funcionarios fun1 = new Funcionarios();
        Funcionarios fun2 = new Funcionarios();
        Funcionarios fun3 = new Funcionarios();
        Funcionarios fun4 = new Funcionarios();
        Funcionarios fun5 = new Funcionarios();

        fun1.nome = "Pedro";
        fun1.funcao = "Programador Back-End";
        fun1.salario = 5000;
        listaFuncionarios.add(fun1);
        // fun1.ajustaSalario(fun1.salario);

        fun2.nome = "João";
        fun2.funcao = "Programador Back-End";
        fun2.salario = 5000;
        listaFuncionarios.add(fun2);
        // fun2.ajustaSalario(fun2.salario);

        fun3.nome = "Júlia";
        fun3.funcao = "Programadora Front-End";
        fun3.salario = 7500;
        listaFuncionarios.add(fun3);
        // fun3.ajustaSalario(fun3.salario);

        fun4.nome = "Erick";
        fun4.funcao = "Hacker Benigno/Cybersegurança";
        fun4.salario = 12000;
        listaFuncionarios.add(fun4);
        // fun4.ajustaSalario(fun4.salario);

        fun5.nome = "Adriana";
        fun5.funcao = "Gerente de banco de dados";
        fun5.salario = 3750;
        listaFuncionarios.add(fun5);
        // fun5.ajustaSalario(fun5.salario);

        mostrarSalarioAjustado();

    }
}
