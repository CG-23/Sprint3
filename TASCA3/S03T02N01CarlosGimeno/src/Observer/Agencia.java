package Observer;

public class Agencia implements Observador {
	
	String nombre;
	
	public Agencia(String nombre) {
		this.nombre = nombre;
	}
	
	public void Actualizar(String actualizacion) {
		System.out.println(nombre+" Recibió la actualización: "+actualizacion);
	}

}
