import java.util.Scanner;

public class SequenciaCrescente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        imprimirPadrao(n);

        sc.close();
    }
    
    public static void imprimirPadrao(int n) {

        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}


