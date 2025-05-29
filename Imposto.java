import java.util.Scanner;

public class Imposto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o custo do produto: R$ ");
        double custo = sc.nextDouble();

        System.out.print("Digite a taxa de imposto(%): ");
        double taxaImposto = sc.nextDouble();

        System.out.printf("Valor final com imposto: R$ %.2f \n", somaImposto(taxaImposto, custo));

        sc.close();
    }

        public static double somaImposto(double taxaImposto, double custo) {
            double imposto = (taxaImposto / 100) * custo;
            return custo + imposto;
        }
}
