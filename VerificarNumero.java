import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        char resultado = verificarNumero(numero);

        System.out.println("Resultado: " + resultado);

        sc.close();
    }

        public static char verificarNumero(int numero) {

            if (numero > 0) {
            return 'P';
        } 
        
        else {
            return 'N';
        }
    }
}
