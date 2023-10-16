import org.example.Matematica;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatematicaTest {
    private Matematica matematica;

    @BeforeEach
    public void setUp() {
        matematica = new Matematica();
    }

    @Test
    public void testEhPrimo() {
        assertTrue(matematica.ehPrimo(3));
        assertTrue(matematica.ehPrimo(23));
        assertTrue(matematica.ehPrimo(311));
        assertTrue(matematica.ehPrimo(487));
        assertTrue(matematica.ehPrimo(653));
        assertTrue(matematica.ehPrimo(947));

        assertFalse(matematica.ehPrimo(21)); // Não é primo
        assertFalse(matematica.ehPrimo(100)); // Não é primo
        assertFalse(matematica.ehPrimo(1));  // Não é primo
        assertFalse(matematica.ehPrimo(0));  // Não é primo
    }

    @Test
    public void testEhPar() {
        assertTrue(matematica.ehPar(32));
        assertTrue(matematica.ehPar(64));
        assertTrue(matematica.ehPar(2));
        assertTrue(matematica.ehPar(20));
        assertTrue(matematica.ehPar(30));
        assertTrue(matematica.ehPar(26));

        assertFalse(matematica.ehPar(7)); // Não é par
        assertFalse(matematica.ehPar(19)); // Não é par
        assertFalse(matematica.ehPar(43)); // Não é par
    }

    @Test
    public void testEhMultiplo() {
        assertTrue(matematica.ehMultiplo(23, 23));
        assertTrue(matematica.ehMultiplo(46, 23));
        assertTrue(matematica.ehMultiplo(115, 23));
        assertTrue(matematica.ehMultiplo(184, 23));
        assertTrue(matematica.ehMultiplo(207, 23));
        assertTrue(matematica.ehMultiplo(230, 23));

        assertFalse(matematica.ehMultiplo(21, 23)); // Não é múltiplo de 23
        assertFalse(matematica.ehMultiplo(30, 7));  // Não é múltiplo de 7
        assertFalse(matematica.ehMultiplo(100, 11)); // Não é múltiplo de 11
    }
}
