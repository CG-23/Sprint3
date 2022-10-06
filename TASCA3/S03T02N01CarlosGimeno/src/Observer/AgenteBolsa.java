package Observer;

import java.util.ArrayList;

public class AgenteBolsa implements Sujeto {
	ArrayList<Observador> AgenciasSuscritas = new ArrayList<Observador>();

	public void Suscribir(Observador agencia) {
		
		AgenciasSuscritas.add(agencia);
	}
	
	public void Baja(Observador agencia) {
		AgenciasSuscritas.remove(agencia);
	}
	
	public void Baja(String nombre) {
		for(int i = 0; i<AgenciasSuscritas.size(); i++) {
			if(((Agencia)AgenciasSuscritas.get(i) ).nombre.equals(nombre)) {
				AgenciasSuscritas.remove(i);
				break;
			}
		}
	}
	
	public void Notificar(String actualizacion) {
		
		for(Observador A : AgenciasSuscritas) {
			A.Actualizar(actualizacion);
		}	
	}


}

