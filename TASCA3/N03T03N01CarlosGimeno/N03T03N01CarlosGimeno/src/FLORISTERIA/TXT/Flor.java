package FLORISTERIA.TXT;

public class Flor {
	
	private String color;
	private int preu;
	
	public Flor(String color, int preu) {
		this.color = color;
		this.preu = preu;		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

}
