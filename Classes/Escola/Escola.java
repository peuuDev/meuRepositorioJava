package Dev1.POO.Classes.Escola;
public class Escola extends alunosMatriculadosFisica {
    public static void main(String[] args) {
        
        alunosMatriculadosFisica aluno1 = new alunosMatriculadosFisica();
        alunosMatriculadosFisica aluno2 = new alunosMatriculadosFisica();
        alunosMatriculadosFisica aluno3 = new alunosMatriculadosFisica();

        aluno1.nome = "Pedro";
        aluno1.matricula = 1272313885;
        aluno1.n1 = 7;
        aluno1.n2 = 5;
        aluno1.nTrabalho = 8;
        System.out.println("Média de "+ aluno1.nome + ": " + String.format("%.2f", aluno1.media(aluno1.n1, aluno1.n2, aluno1.nTrabalho)));

        aluno2.nome = "Erick";
        aluno2.matricula = 1272313485;
        aluno2.n1 = 9;
        aluno2.n2 = 4;
        aluno2.nTrabalho = 3;
        System.out.println("Média de "+ aluno2.nome + ": " + String.format("%.2f", aluno2.media(aluno2.n1, aluno2.n2, aluno2.nTrabalho)));

        aluno3.nome = "Adriana";
        aluno3.matricula = 1272313985;
        aluno3.n1 = 10;
        aluno3.n2 = 5;
        aluno3.nTrabalho = 6;
        System.out.println("Média de "+ aluno3.nome + ": " + String.format("%.2f", aluno3.media(aluno3.n1, aluno3.n2, aluno3.nTrabalho)));
    }

}
