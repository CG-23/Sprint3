package Observer;

public interface Sujeto {
	
	public void Suscribir(Observador observador);	
	
	public void Baja(Observador observador);
	
	public void Notificar(String actualizacion);

}
