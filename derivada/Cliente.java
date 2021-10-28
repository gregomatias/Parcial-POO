
package derivada;

public class Cliente {
    private String nombre;
    private double saldo;
    private String redALaQuePertenecen;

    public Cliente(String nombre, double saldo, String redALaQuePertenecen) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.redALaQuePertenecen = redALaQuePertenecen;
    }


    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getRedALaQuePertenecen() {
        return redALaQuePertenecen;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}