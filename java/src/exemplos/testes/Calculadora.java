package exemplos.testes;

public class Calculadora {
    double adicionar(double a, double b) {
        return a + b;
    }

    double dividir(double a, double b) throws ArithmeticException {
        // Não é possível dividir por zero
        if (b == 0.0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }

    double raiz(double a) throws ArithmeticException {
        // Não é possível calcular a raiz de um número negativo
        if (a < 0.0) {
            throw new ArithmeticException("Raiz de número negativo");
        }
        return Math.sqrt(a);
    }
}
