package abstractFactory;

public class FactoryMaker {
	public static AgendaFactory getRepositoryFactory(TipoFactory tipo) {
		if(TipoFactory.ESPANYA.equals(tipo)) {
			return new EspanyaFactory();
		}else {
			return new FranciaFactory();
		}
	}

}
