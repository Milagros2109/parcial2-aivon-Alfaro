public class Producto {

    private String codigo;
    private String nombre;
    private String uso;
    private double tamanoCm3;
    private double precioVenta;
    private double precioCosto;

    public Producto(String codigo, String nombre, String uso, double tamanoCm3, double precioVenta, double precioCosto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.uso = uso;
        this.tamanoCm3 = tamanoCm3;
        this.precioVenta = precioVenta;
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public String getNombre() {
        return nombre;
    }
}