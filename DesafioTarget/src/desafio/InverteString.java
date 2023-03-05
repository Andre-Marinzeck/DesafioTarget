package desafio;

import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String input = sc.nextLine();

        // Converte a string de entrada em um array de caracteres
        char[] array = input.toCharArray();

        // Inverte a ordem dos caracteres no array
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // Cria uma nova string a partir do array invertido
        String reversed = new String(array);

        // Exibe a string invertida
        System.out.println("String invertida: " + reversed);
    }
}
