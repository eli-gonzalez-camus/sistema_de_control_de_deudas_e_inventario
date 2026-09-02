package model;

public class Venta  extends  Movimiento{
    private Producto producto;
    private  int cantidad;
    private double subTotal;


    public Venta() {
    }

    public Venta(Cliente cliente, String fecha, int idMovimiento, double monto, Producto producto, int cantidad, double subTotal) {
        super(cliente, fecha, idMovimiento, monto);
        this.producto = producto;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "Venta" +
                "Cantidad:" + cantidad +
                "SubTotal:" + subTotal +
                producto;
    }
}
