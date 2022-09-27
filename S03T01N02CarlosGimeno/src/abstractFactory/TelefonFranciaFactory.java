package abstractFactory;

public class TelefonFranciaFactory implements Telefon {
	@Override
	public String guardarTelefon(String Telefon) {
		return String.format("Telefon frances", Telefon);
	}
}
