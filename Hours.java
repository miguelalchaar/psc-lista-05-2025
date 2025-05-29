import java.util.Scanner;

public class Hours {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir = 'S';

        System.out.println(">>>> Conversor de Horas <<<<\n");

        do {
            System.out.print("> Digite a hora(0-23): ");
            int hora = sc.nextInt();

            System.out.print("> Digite os minutos(0-59): ");
            int minuto = sc.nextInt();

            if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
                System.out.println("Hora ou minuto inválido!");
                continue;
            }

            char[] periodo = new char[1]; //Array para guardar A (AM) ou P (PM).
            int hora12 = converterHora(hora, periodo);

            exibirHora(hora12, minuto, periodo[0]); 

            System.out.print("\nDeseja converter outro horário? (S/N): ");
            repetir = sc.next().toUpperCase().charAt(0);

        } while (repetir == 'S');

        sc.close();
        System.out.println("\n>>>> Programa encerrado. <<<<");
    }

    public static int converterHora(int hora24, char[] periodo) {
        
        if (hora24 == 0) {
            periodo[0] = 'A';
            return 12;
            
        } else if (hora24 == 12) {
            periodo[0] = 'P';
            return 12;

        } else if (hora24 > 12) {
            periodo[0] = 'P';
            return hora24 - 12;

        } else {
            periodo[0] = 'A';
            return hora24;
        }
    }

    public static void exibirHora(int hora12, int minuto, char periodo) {
        
        String periodoString = (periodo == 'A') ? "A.M." : "P.M.";
        System.out.printf("> Hora convertida: %d:%02d %s\n", hora12, minuto, periodoString);
    }
}
