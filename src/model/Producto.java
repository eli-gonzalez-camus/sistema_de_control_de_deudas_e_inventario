package model;

public class Producto {
    private int codigoProducto;
    private String nombreProducto;
    private double precio;
    private int stockProducto;

    public Producto() {
    }

    public Producto(int codigoProducto, String nombreProducto, double precio, int stockProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stockProducto = stockProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    @Override
    public String toString() {
        return "Producto" +
                "Codigo Producto:" + codigoProducto +
                "Nombre Producto:" + nombreProducto +
                "precio:" + precio +
                "Stock Producto:" + stockProducto;
    }
}
