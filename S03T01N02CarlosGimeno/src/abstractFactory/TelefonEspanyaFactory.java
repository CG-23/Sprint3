package abstractFactory;

public class TelefonEspanyaFactory implements Telefon {
	@Override
	public String guardarTelefon(String Telefon) {
		return String.format("Telefon espanyol", Telefon);
	}

}
