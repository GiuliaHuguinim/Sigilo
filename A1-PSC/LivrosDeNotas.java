import java.util.Scanner;

public class LivrosDeNotas {
    private static int numeroAlunos;
    private static double valorA1;
    private static double valorA2;
    private static double valorA3;
    private static double[] mediaAluno;
    private static double totalMediaAlunos;

    public static void main(String[] args) {
        calcularMediaDeCadaAluno();
        calcularMediaDaTurma();
    }

    public static void calcularMediaDeCadaAluno() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite o número de aluno: ");
        numeroAlunos = input.nextInt();

        mediaAluno = new double[numeroAlunos];

        for (int i = 0; i < numeroAlunos; i++) {
            System.out.println("\nDigite o valor total da A1 do aluno " + (i + 1) + " : ");
            valorA1 = input.nextDouble();

            System.out.println("\nDigite o valor total da A2 do aluno " + (i + 1) + " : ");
            valorA2 = input.nextDouble();

            System.out.println("\nDigite o valor total da A3 do aluno " + (i + 1) + " : ");
            valorA3 = input.nextDouble();

            double media = (valorA1 + valorA2 + valorA3) / 3;

            mediaAluno[i] = media;

            totalMediaAlunos += media;
        }

        for (int i = 0; i < numeroAlunos; i++) {
            System.out.println("\nA média total do aluno " + ( i + 1) + " é: " + mediaAluno[i]);
        }

        input.close();
    }

    public static void calcularMediaDaTurma() {
        double mediaGeral = totalMediaAlunos / numeroAlunos;
        System.out.println("\nA média geral da turma é: " + mediaGeral);
    }
}

    
    
