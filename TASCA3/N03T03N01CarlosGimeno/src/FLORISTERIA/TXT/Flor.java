package FLORISTERIA.TXT;

public class Flor {
	
	private String color;
	private float preu;
	
	public Flor(String color, float preu) {
		this.color = color;
		this.preu = preu;		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

}
