package abstractFactory;

public class EspanyaFactory implements AgendaFactory {
	@Override
	public Adreça getAdreça() {
		return new AdreçaEspanyaFactory();
	}
	@Override
	public Telefon getTelefon() {
		return new TelefonEspanyaFactory();
	}
	
}
