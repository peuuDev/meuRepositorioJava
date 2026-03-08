// Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina.
// Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome,
// 2 notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
// a. media -> calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho
// tem peso 2)
// b. final -> calcula quanto o aluno precisa para a prova final (retorna zero se ele
// não for para a final)
package Dev1.POO.Classes.Escola;

public class alunosMatriculadosFisica {
    
    String nome;
    int matricula;
    double n1;
    double n2;
    double nTrabalho;

    public double media(double n1, double n2, double nT){
        return (n1 * 2.5 + n2 * 2.5 + nT * 2) / 7.0;
    }

}
