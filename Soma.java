import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numeros[i] = sc.nextInt();
        }

        int resultado = somarTresNumeros(numeros[0], numeros[1], numeros[2]);

        System.out.println("A soma dos três números é: " + resultado);

        sc.close();
    }

    public static int somarTresNumeros(int a, int b, int c) {
        return a + b + c;
    }
}
