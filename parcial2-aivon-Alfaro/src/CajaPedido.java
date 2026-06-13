import java.util.ArrayList;

public class CajaPedido {

    private int numeroCaja;
    private ArrayList<DetalleCaja> detalles;

    public CajaPedido(int numeroCaja) {
        this.numeroCaja = numeroCaja;
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(DetalleCaja detalle) {
        detalles.add(detalle);
    }

    public double calcularSubtotalCaja() {
        double total = 0;
        for (DetalleCaja detalle : detalles) {
            total += detalle.getSubtotal();
        }
        return total;
    }
}