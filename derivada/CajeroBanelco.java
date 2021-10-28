package derivada;

import base.CajeroAutomatico;

public class CajeroBanelco extends CajeroAutomatico {
    private double saldo;

    public CajeroBanelco(double saldo) {
        this.saldo = saldo;

    }

    @Override
    public String extraerDinero(Cliente cliente, double montoAExtraer) {
        if (this.saldo >= montoAExtraer) {
            if (cliente.getRedALaQuePertenecen().equalsIgnoreCase("BANELCO")) {
                this.saldo = this.saldo - montoAExtraer;
                cliente.setSaldo(cliente.getSaldo() + montoAExtraer);
                return "La operación se ha realizado con éxito";
            } else {
                this.saldo = this.saldo - (montoAExtraer * 0.87);
                cliente.setSaldo(cliente.getSaldo() + (montoAExtraer * 0.87));

                return "La operación se ha realizado con éxito";
            } 

        } else {
            return "El cajero no tiene saldo disponible";
        }
    }

    @Override
    public String transferir(Cliente clienteOrigen, Cliente clienteDestino, double montoATransferir) {
        if (clienteOrigen.getSaldo() >= montoATransferir) {
            if (clienteOrigen.getRedALaQuePertenecen().equalsIgnoreCase("BANELCO")
                    && clienteDestino.getRedALaQuePertenecen().equalsIgnoreCase("BANELCO")) {
                clienteOrigen.setSaldo(clienteOrigen.getSaldo() - montoATransferir);
                clienteDestino.setSaldo(clienteDestino.getSaldo() + montoATransferir);

                return "La transferencia se ha realizado con éxito";

            } else {
                return "La red del cliente origen y/o cliente destino no son BANELCO";
            } 

        } else {
            return "El cliente de origen no tiene saldo suficiente para realizar la transferencia";

        } 
    }

}
