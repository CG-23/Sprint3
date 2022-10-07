package CALLBACK;

public class Paypal {
	
	private Pagament pago;
	
	public Paypal(Pagament pago) {
		this.pago= pago;
	}
	
	public void pagar() {
		System.out.println("Pagaré amb Paypal");
		pago.pagar();
	}
}
