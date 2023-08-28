package exemplos.testes;

import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

public class CalculadoraTeste {
    private Calculadora calc;

    @BeforeAll
    public static void start() {
        System.out.println("Iniciando os testes da Calculadora");
    }

    @BeforeEach
    public void init() {
        this.calc = new Calculadora();
    }

    @Test
    public void adicionarTeste() {
        System.out.println("Testando o método adicionar");
        // Números Negativos e Positivos
        for (double add1 = -4.0; add1 <= 4.0; add1++) {
            for (double add2 = -4.0; add2 <= 4.0; add2++) {
                assertEquals(add1 + add2, calc.adicionar(add1, add2), 0.001);
            }
        }
    }
    
    @Test
    public void dividirTeste() throws ArithmeticException {
        System.out.println("Testando o método dividir");
        // Números Negativos
        assertEquals(2.0, calc.dividir(-4.0, -2.0), 0.001);
        assertEquals(-2.0, calc.dividir(4.0, -2.0), 0.001);
        assertEquals(-2.0, calc.dividir(-4.0, 2.0), 0.001);

        // Divisões com zero
        assertEquals(0.0, calc.dividir(0.0, 2.0), 0.001);
        assertThrows(ArithmeticException.class, () -> calc.dividir(1.0, 0.0));

        // Divisões com números positivos e fracionários
        assertEquals(2.5, calc.dividir(5.0, 2.0), 0.001);
        assertEquals(2.0, calc.dividir(4.0, 2.0), 0.001);
    }

    @Test
    public void raizTest() throws ArithmeticException {
        System.out.println("Testando o método raiz");
        // Números possíveis de serem calculados
        assertEquals(2.0, calc.raiz(4.0), 0.001);
        assertEquals(0.0, calc.raiz(0.0), 0.001);
        assertEquals(1.414, calc.raiz(2.0), 0.001);

        // Números impossíveis de serem calculados
        assertThrows(ArithmeticException.class, () -> calc.raiz(-4.0));
    }

    @AfterAll
    public static void close() {
        System.out.println("Finalizando os testes da Calculadora");
    }
}
