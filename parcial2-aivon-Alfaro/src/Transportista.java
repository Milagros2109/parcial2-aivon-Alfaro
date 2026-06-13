public class Transportista {

    private int nroTransportista;
    private String nombreCompleto;
    private String whatsapp;
    private Vehiculo vehiculo;

    public Transportista(int nroTransportista, String nombreCompleto, String whatsapp, Vehiculo vehiculo) {
        this.nroTransportista = nroTransportista;
        this.nombreCompleto = nombreCompleto;
        this.whatsapp = whatsapp;
        this.vehiculo = vehiculo;
    }

    public String escanearPedido(Pedido pedido) {
        return pedido.mostrarDestino();
    }
}