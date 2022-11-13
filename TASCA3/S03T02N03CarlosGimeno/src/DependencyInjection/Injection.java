package DependencyInjection;

public class Injection {
	
	public enum TipoDivisa{Dolars, Euros, Lliures};
	
	public static Convertidor Divisa (TipoDivisa moneda, float preu) {
		Convertidor divisa = null;
		switch (moneda) {
		case Euros:
			divisa = new Euros(preu);
			break;
		case Dolars:
			divisa = new Dolars(preu);
			break;
		case Lliures:
			divisa = new Lliures(preu);
			break;
		}
		return divisa;
	}

}
