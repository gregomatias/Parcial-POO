package base;

import derivada.Cliente;

public abstract class CajeroAutomatico {

    protected abstract String extraerDinero(Cliente cliente, double montoAExtraer);

    protected abstract String transferir(Cliente clienteOrigen, Cliente clienteDestino,double montoATransferir);

}
