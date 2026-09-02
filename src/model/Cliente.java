package model;

public class Cliente {
    private  String nombreCliente;
    private  String telefono;
    private  int idCliente;

    public Cliente() {
    }

    public Cliente(String nombreCliente, int idCliente, String telefono) {
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.telefono = telefono;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cliente:" +
                "Nombre Cliente:" + nombreCliente +
                "Telefono:" + telefono +
                "Identificador:" + idCliente;
    }
}
