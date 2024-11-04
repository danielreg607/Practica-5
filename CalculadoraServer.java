import java.rmi.*;
import java.rmi.Naming;

public class CalculadoraServer {

	public CalculadoraServer() {
		try {
			System.setSecurityManager(new SecurityManager());
			System.setProperty("java.rmi.server.hostname","10.86.15.199");
			Calculadora c = new CalculadoraObj();
			Naming.rebind("//localhost/ServicioDeCalculadora", c);
			System.out.println("Servidor listo...");
		} catch (Exception e) {
			System.out.println("Problema: " + e);
		}
	}

	public static void main(String args[]) {
		new CalculadoraServer();
	}
}
