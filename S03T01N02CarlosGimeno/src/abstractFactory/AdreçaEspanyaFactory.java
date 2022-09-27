package abstractFactory;

public class AdreçaEspanyaFactory implements Adreça {
	@Override
	public String guardarAdreça(String Adreça) {
		return String.format("Adreça espanyola", Adreça);
	}
	
}
