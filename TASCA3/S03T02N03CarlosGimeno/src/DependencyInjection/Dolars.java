package DependencyInjection;

public class Dolars implements Convertidor {
	
	Float preu;
	
	public Dolars(Float preu) {
		this.preu = preu;
	}

	@Override
	public void convertir() {
		preu = (float) (preu*(0.97));
			
	}

}
