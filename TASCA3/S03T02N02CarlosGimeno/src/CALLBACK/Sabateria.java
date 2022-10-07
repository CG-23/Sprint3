package CALLBACK;

public class Sabateria {

	public static void main(String[] args) {
		
		Pasarella pas = new Pasarella();
		
		Paypal pa = new Paypal(pas);
		TargetaCredit ta = new TargetaCredit(pas);
		DeuteBancari de = new DeuteBancari(pas);
		
		pa.pagar();
		ta.pagar();
		de.pagar();
	}

}
