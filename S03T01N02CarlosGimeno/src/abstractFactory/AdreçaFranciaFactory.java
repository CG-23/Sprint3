package abstractFactory;

public class AdreçaFranciaFactory implements Adreça {
	@Override
	public String guardarAdreça(String Adreça) {
		return String.format("Adreça francesa", Adreça);
	}
}
