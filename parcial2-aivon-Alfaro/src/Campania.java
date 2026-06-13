import java.time.LocalDate;
import java.util.ArrayList;

public class Campania {

    private int numero;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double monto;
    private boolean activa;
    private ArrayList<Pedido> pedidos;

    public Campania(int numero, LocalDate fechaInicio, LocalDate fechaFin, double monto, boolean activa) {
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.activa = activa;
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public boolean estaActiva() {
        return activa;
    }

    public int getNumero() {
        return numero;
    }
}