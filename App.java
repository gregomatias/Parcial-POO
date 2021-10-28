import derivada.*;

public class App {
    public static void main(String[] args) throws Exception {

        CajeroLink link = new CajeroLink(19000);
        CajeroBanelco banelco = new CajeroBanelco(7500);

        Cliente guadalupe = new Cliente("Guadalupe", 1050, "LINK");
        Cliente leandro = new Cliente("Leandro", 1100, "BANELCO");
        Cliente santino = new Cliente("Santino", 700, "BANELCO");

        /*----------Operaciones---------------------------*/
        System.out.println("---------------------------Extraer----------------------------------------------");
        System.out.println(link.extraerDinero(guadalupe, 500));
        System.out.println("El saldo de " + guadalupe.getNombre() + " es de: " + guadalupe.getSaldo());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(link.extraerDinero(santino, 10000));
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(banelco.extraerDinero(guadalupe, 650));
        System.out.println("El saldo del cliente es: " + guadalupe.getSaldo());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(banelco.extraerDinero(santino, 110));
        System.out.println("El saldo del cliente es: " + santino.getSaldo());
        System.out.println("-------------------------------Tranferencias------------------------------------------");
        System.out.println(banelco.transferir(guadalupe, leandro, 210));
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(banelco.transferir(santino, leandro, 520));
        System.out.println("El saldo de " + santino.getNombre() + " es de: " + santino.getSaldo());
        System.out.println("El saldo de " + leandro.getNombre() + " es de: " + leandro.getSaldo());

    }
}
