import java.util.Scanner;

public class Lucro {
    private static int numeroClientes;
    private static double gastoClienteBebida;
    private static double gastoClienteComida;
    private static double totalClientes = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite o número de cliente: ");
        numeroClientes = input.nextInt();

        for (int i = 0; i < numeroClientes; i++) {
            System.out.println("\nDigite o valor gasto do cliente " + (i + 1) + " em bebidas: ");
            gastoClienteBebida = input.nextDouble();

            System.out.println("\nDigite o valor gasto do cliente " + (i + 1) + " em comida: ");
            gastoClienteComida = input.nextDouble();
        }

        calcularMediaGastoPorCliente();
        calcularMediaGeral();

        input.close();
    }

    public static void calcularMediaGastoPorCliente() {
        for (int i = 0; i < numeroClientes; i++) {
            double totalCliente = gastoClienteBebida + gastoClienteComida;
            double mediaCliente = totalCliente / 2;
            System.out.println("\nA média gasta do cliente " + (i + 1) + " é: " + mediaCliente);

            
            totalClientes += totalCliente;
        }
    }

    public static void calcularMediaGeral() {
        double mediaGeral = totalClientes / numeroClientes;
        System.out.println("\nA média gasta geral do cliente é: " + mediaGeral);
    }
}
