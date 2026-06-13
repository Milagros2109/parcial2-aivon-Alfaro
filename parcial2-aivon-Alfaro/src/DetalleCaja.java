public class DetalleCaja {

    private int cantidad;
    private double subtotal;
    private Producto producto;

    public DetalleCaja(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal();
    }

    public double calcularSubtotal() {
        return producto.getPrecioVenta() * cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }
}