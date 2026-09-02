package model;

public class Abono {

    private Cliente cliente;
    private Venta venta;
    private double monto;
    private String fecha;

    public Abono() {
    }

    public Abono(Cliente cliente, Venta venta, double monto, String fecha) {
        this.cliente = cliente;
        this.venta = venta;
        this.monto = monto;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Abono" +
                "Cliente:" + cliente +
                "Venta:" + venta +
                "Monto:" + monto +
                "Fecha:" + fecha;
    }
}
