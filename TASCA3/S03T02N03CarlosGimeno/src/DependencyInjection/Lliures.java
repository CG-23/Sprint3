package DependencyInjection;

public class Lliures implements Convertidor {
	
	float preu;
	
	public Lliures(Float preu) {
		this.preu = preu;
		}

	@Override
	public void convertir() {
		preu = (float) (preu*(0.87));
		
	}

}
