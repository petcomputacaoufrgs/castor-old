package exemplos.imports.modulo;

public class Fib {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public int[] fibAte(int n) {
        int[] fibs = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            fibs[i] = fib(i);
        }

        return fibs;
    }
}
