package DependencyInjection;

public class Euros implements Convertidor {
	
	float preu;

	public Euros(Float preu) {
		this.preu = preu;
		}
	
	
	@Override
	public void convertir() {
		preu = preu;
		
	}

}
