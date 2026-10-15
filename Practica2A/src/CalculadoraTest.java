import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    void testSuma() 
    {
        assertEquals(5, calc.suma(2, 3));
    }

    @Test
    void testResta() 
    {
        assertEquals(1, calc.resta(3, 2));
    }

    @Test
    void testMultiplica() 
    {
        assertEquals(6, calc.multiplica(2, 3));
    }

    @Test
    void testDivide() 
    {
        assertEquals(2, calc.divide(6, 3));
        assertEquals(-1, calc.divide(5, 0)); // Prueba división por cero
    }
}