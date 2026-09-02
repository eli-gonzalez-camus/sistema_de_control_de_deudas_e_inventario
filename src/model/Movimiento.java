package model;

    public class Movimiento {

        private int idMovimiento;
        private Cliente cliente;
        private double monto;
        private String fecha;

        public Movimiento() {
        }

        public Movimiento(Cliente cliente, String fecha, int idMovimiento, double monto) {
            this.cliente = cliente;
            this.fecha = fecha;
            this.idMovimiento = idMovimiento;
            this.monto = monto;
        }

        public int getIdMovimiento() {
            return idMovimiento;
        }

        public void setIdMovimiento(int idMovimiento) {
            this.idMovimiento = idMovimiento;
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

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        @Override
        public String toString() {
            return "Movimiento:" +
                    "idMovimiento:"+ idMovimiento +
                    "cliente:" + cliente +
                    "monto:" + monto +
                    "fecha:" + fecha ;
        }
    }
