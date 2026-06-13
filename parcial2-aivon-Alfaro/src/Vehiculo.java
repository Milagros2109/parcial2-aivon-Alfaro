import java.util.ArrayList;

public class Vehiculo {

    private String patente;
    private String modelo;
    private String gps;
    private ArrayList<Pedido> pedidos;

    public Vehiculo(String patente, String modelo, String gps) {
        this.patente = patente;
        this.modelo = modelo;
        this.gps = gps;
        this.pedidos = new ArrayList<>();
    }

    public String seguirVehiculo() {
        return gps;
    }

    public void cargarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void descargarPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }
}