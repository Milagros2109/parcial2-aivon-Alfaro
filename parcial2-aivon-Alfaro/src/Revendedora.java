
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Revendedora {
    private int nroCuenta;
    private double saldo;
    private Object cuenta;
    private ArrayList<Object> pedidos;

    public Revendedora() {
        this.nroCuenta = 0;
        this.saldo = 9000;
        this.cuenta = null;
        this.pedidos = new ArrayList<>();
    }

    public Revendedora(int nroCuenta, double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.cuenta = null;
        this.pedidos = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public Object getCuenta() {
        return cuenta;
    }

    public void depositarDinero(double monto) {
        saldo += monto;
    }

  public double retirarDinero(double monto) throws Exception {
    if (monto > saldo) {
        throw new Exception("Su cuenta no tiene saldo.");
    }

    saldo -= monto;
    return saldo;
}
    public void transferirDinero(Revendedora destino, double monto) throws Exception {
        retirarDinero(monto);
        destino.depositarDinero(monto);
    }

    public double convertirMoneda(String cotizacion) {
        return Double.parseDouble(cotizacion);
    }

    public void PagoDemorado(int time) throws InterruptedException {
        Thread.sleep(time);
        System.out.println("El pago ha demorado demasiado.");
    }
    
}
