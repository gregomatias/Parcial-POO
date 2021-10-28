package derivada;

import base.CajeroAutomatico;

public class CajeroLink extends CajeroAutomatico {
    private double saldo;

    public CajeroLink(double saldo) {
        this.saldo = saldo;

    }

    @Override
    public String extraerDinero(Cliente cliente, double montoAExtraer) {
        if (this.saldo >= montoAExtraer) {
            if (cliente.getRedALaQuePertenecen().equalsIgnoreCase("LINK")) {
                this.saldo = this.saldo - (montoAExtraer * 0.98);
                cliente.setSaldo(cliente.getSaldo() + (montoAExtraer * 0.98));
                return "La operación se ha realizado con éxito";
            } else {
                this.saldo = this.saldo - (montoAExtraer * 0.88);
                cliente.setSaldo(cliente.getSaldo() + (montoAExtraer * 0.88));

                return "La operación se ha realizado con éxito";
            } // Fin del if de red

        } else {
            return "El cajero no tiene saldo disponible";
        }

    }

    @Override
    public String transferir(Cliente clienteOrigen, Cliente clienteDestino, double montoATransferir) {
        if (clienteOrigen.getSaldo() >= montoATransferir) {
            if (clienteOrigen.getRedALaQuePertenecen().equalsIgnoreCase("LINK")
                    && clienteDestino.getRedALaQuePertenecen().equalsIgnoreCase("LINK")) {
                clienteOrigen.setSaldo(clienteOrigen.getSaldo() - montoATransferir);
                clienteDestino.setSaldo(clienteDestino.getSaldo() + montoATransferir);

                return "La transferencia se ha realizado con éxito";

            } else {
                return "La red del cliente origen y/o cliente destino no son LINK";
            } // fin del if redes iguales

        } else {
            return "El cliente de origen no tiene saldo suficiente para realizar la transferencia";

        } // fin del if saldo cliente Origen

    }

}
