import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class parameterRevendedoraTest {

    private double montoActual;
    private Revendedora cRev;
    private double montoEsperado;

    public parameterRevendedoraTest(double montoActual, Revendedora cRev, double montoEsperado) {
        this.montoActual = montoActual;
        this.cRev = cRev;
        this.montoEsperado = montoEsperado;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][]{
            {300.5, new Revendedora(1, 3633.0), 3333.0},
            {500.0, new Revendedora(2, 8699.5), 8199.5},
            {9999.0, new Revendedora(3, 1111.0), 1111.0}
        });
    }

    @Test
    public void testRetirarDinero() throws Exception {
        cRev.retirarDinero(montoActual);
        assertEquals(montoEsperado, cRev.getSaldo(), 0.2);
    }
}