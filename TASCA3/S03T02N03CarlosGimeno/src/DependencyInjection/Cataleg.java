package DependencyInjection;

public class Cataleg {
	private String nom;
	private Convertidor preu;
	
	public Cataleg(String nom, Convertidor preu) {
		this.nom = nom;
		this.preu = preu;		
	}
}
