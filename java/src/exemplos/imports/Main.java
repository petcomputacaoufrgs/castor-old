package exemplos.imports;

import exemplos.imports.modulo.Fib;

public class Main {
    public static void main(String[] args) {
        Fib fib = new Fib();
        int[] fibs = fib.fibAte(10);

        for (int i = 0; i < fibs.length; i++) {
            System.out.print(fibs[i] + " ");
        }
    }
}
