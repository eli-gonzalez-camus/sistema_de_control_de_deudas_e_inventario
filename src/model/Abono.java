package model;
public class Abono extends Movimiento  {
    public Abono() {
    }

    public Abono(Cliente cliente, String fecha, int idMovimiento, double monto) {
        super(cliente, fecha, idMovimiento, monto);
    }

    @Override
    public String toString() {
        return "Abono{}";
    }
}
