package FLORISTERIA.TXT;

public class Decoracio {
	
	private String tipus;
	private int preu;
	
	public Decoracio(String tipus, int preu) {
		this.tipus = tipus;
		this.preu = preu;		
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}
	
	

}
