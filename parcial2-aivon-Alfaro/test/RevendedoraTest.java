import java.time.LocalDate;
import java.time.Month;
import org.junit.*;
import static org.junit.Assert.*;

public class RevendedoraTest {

    static Revendedora revCuenta;
    static Revendedora rev3;
    static int i = 1;

    @BeforeClass
    public static void setUpClass() {
        LocalDate fechaLocal = LocalDate.of(2024, Month.JUNE, 8);
        System.out.println("Fecha de transaccion: " + fechaLocal);
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("FIN de la transaccion");
    }

    @Before
    public void setUp() {
        revCuenta = new Revendedora(1, 9000.0);
        rev3 = new Revendedora(3, 9000.0);
    }

    @After
    public void tearDown() {
        System.out.println("Transaccion " + i + " > El monto en cuenta es " + revCuenta.getSaldo());
        i++;
    }

    @Test(expected = Exception.class)
    public void testRetirarFallo() throws Exception {
        revCuenta.retirarDinero(88000.0);
    }

    @Test
    public void testRetirarExito() throws Exception {
        revCuenta.retirarDinero(1000.0);
        assertEquals(8000.0, revCuenta.getSaldo(), 0.2);
    }

    @Test
    public void testDepositarDinero() {
        assertNull(revCuenta.getCuenta());
        revCuenta.depositarDinero(2000.0);
        assertEquals(11000.0, revCuenta.getSaldo(), 0.2);
    }

    @Test
    public void testTransferirCuentaNoNula() throws Exception {
        Revendedora rev2 = new Revendedora(2, 5000.0);
        assertNotNull(rev2);
        revCuenta.transferirDinero(rev2, 1500.0);
        assertEquals(7500.0, revCuenta.getSaldo(), 0.2);
    }

    @Test
    public void testSiempreFalla() {
        fail("Este test falla de forma intencional");
    }

    @Test
    public void testDolarMEP1() {
        assertEquals(1300.0, revCuenta.convertirMoneda("1300"), 0.2);
    }

    @Test
    public void testDolarMEP2() {
        assertEquals(1300.0, revCuenta.convertirMoneda("1300 U$S"), 0.2);
    }

    @Test
    public void testMismaRevendedora() {
        assertSame("Las cuentas son diferentes", revCuenta, rev3);
    }

    @Test(timeout = 60)
    public void testPagoDemorado() throws InterruptedException {
        revCuenta.PagoDemorado(80);
    }
}