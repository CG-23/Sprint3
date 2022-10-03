package Observer;

public class Agencia {
	
	String nombre;
	
	public Agencia(String nombre) {
		this.nombre = nombre;
	}
	
	public void Actualizar(String actualizacion) {
		System.out.println(nombre+" Recibió la actualización: "+actualizacion);
	}

}
