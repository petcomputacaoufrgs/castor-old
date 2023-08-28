package exemplos.teclado;

import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");

        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        teclado.close();

        System.out.println("Você digitou: " + num);
    }
}