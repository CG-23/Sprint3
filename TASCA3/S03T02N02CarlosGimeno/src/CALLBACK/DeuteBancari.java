package CALLBACK;

public class DeuteBancari {
	
	private Pagament pago;
	
	public DeuteBancari(Pagament pago) {
		this.pago= pago;
	}
	
	public void pagar() {
		System.out.println("Pagaré amb un deute bancari");
		pago.pagar();
	}
}
