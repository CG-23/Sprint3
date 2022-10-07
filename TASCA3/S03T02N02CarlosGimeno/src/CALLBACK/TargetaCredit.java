package CALLBACK;

public class TargetaCredit {
	
	private Pagament pago;
	
	public TargetaCredit(Pagament pago) {
		this.pago= pago;
	}
	
	public void pagar() {
		System.out.println("Pagaré amb targeta de crèdit");
		pago.pagar();
	}
}
