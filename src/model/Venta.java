package model;

public class Venta {
    private  int idCliente;
    private  String nombre;
    private  String producto;
    private  int cantidad;
    private double subTotal;
    private  String fecha;

    public Venta() {
    }

    public Venta(int idCliente, String nombre, String producto, int cantidad, double subTotal, String fecha) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta" +
                "ID Cliente:" + idCliente +
                "Nombre:" + nombre +
                "Producto:" + producto +
                "Cantidad:" + cantidad +
                "SubTotal:" + subTotal +
                "Fecha:" + fecha ;
    }
}
