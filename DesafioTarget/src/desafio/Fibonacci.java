package desafio;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();
        sc.nextLine();

        boolean pertence = verificaSePertence(numero);

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificaSePertence(int numero) {
        int a = 0;
        int b = 1;
        while (b < numero) {
            int c = a + b;
            a = b;
            b = c;
        }
        return (b == numero);
    }
}
