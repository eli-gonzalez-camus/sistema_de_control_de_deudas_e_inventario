package sistema;
import model.Abono;
import model.Cliente;
import model.Producto;
import model.Venta;

import  java.util.ArrayList;
import java.util.List;

public class Sistema {
    private  List<Cliente>clientes;
    private List<Producto>productos;
    private  List<Venta>ventas;
    private List<Abono>abonos;

    public Sistema () {
        clientes = new ArrayList<>();
        productos = new ArrayList<>();
        ventas = new ArrayList<>();
        abonos = new ArrayList<>();
    }
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

}

