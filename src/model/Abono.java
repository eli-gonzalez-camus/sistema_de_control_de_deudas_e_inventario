package model;
public class Abono extends Movimiento  {

    private Venta venta;


    public Abono() {
    }

    public Abono(Cliente cliente, String fecha, int idMovimiento, double monto, Venta venta) {
        super(cliente, fecha, idMovimiento, monto);
        this.venta = venta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public String toString() {
        return "Abono" +
                "Venta:" + venta;
    }
}
