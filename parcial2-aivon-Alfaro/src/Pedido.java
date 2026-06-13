import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    private int numero;
    private LocalDate fechaIngreso;
    private LocalDate fechaEntrega;
    private LocalDate fechaPago;
    private int cantidadCajas;
    private String domicilio;
    private String qr;
    private double importe;
    private boolean pagado;
    private Revendedora revendedora;
    private Campania campania;
    private ArrayList<CajaPedido> cajas;

    public Pedido(int numero, String domicilio, String qr, Revendedora revendedora, Campania campania) {
        this.numero = numero;
        this.domicilio = domicilio;
        this.qr = qr;
        this.revendedora = revendedora;
        this.campania = campania;
        this.fechaIngreso = LocalDate.now();
        this.pagado = false;
        this.cajas = new ArrayList<>();
    }

    public void agregarCaja(CajaPedido caja) {
        cajas.add(caja);
        cantidadCajas = cajas.size();
        importe = calcularImporte();
    }

    public double calcularImporte() {
        double total = 0;
        for (CajaPedido caja : cajas) {
            total += caja.calcularSubtotalCaja();
        }
        return total;
    }

    public boolean hayPedido(Campania campania) {
        return this.campania == campania;
    }

    public String mostrarDestino() {
        return domicilio;
    }

    public String getQr() {
        return qr;
    }
}