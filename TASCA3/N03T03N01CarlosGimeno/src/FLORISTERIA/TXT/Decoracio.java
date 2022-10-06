package FLORISTERIA.TXT;

public class Decoracio {
	
	private String tipus;
	private float preu;
	
	public Decoracio(String tipus, float preu) {
		this.tipus = tipus;
		this.preu = preu;		
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}
	
	

}
