package model;

public class Cliente {
    private  String nombreCliente;
    private  String telefono;
    private  String identificador;

    public Cliente() {
    }

    public Cliente(String nombreCliente, String identificador, String telefono) {
        this.nombreCliente = nombreCliente;
        this.identificador = identificador;
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

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Cliente:" +
                "Nombre Cliente:" + nombreCliente +
                "Telefono:" + telefono +
                "Identificador:" + identificador ;
    }
}
