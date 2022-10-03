package Observer;

import java.util.ArrayList;

public class AgenteBolsa {
	ArrayList<Agencia> AgenciasSuscritas = new ArrayList<Agencia>();

	public void Suscribir(Agencia agencia) {
		
		AgenciasSuscritas.add(agencia);
	}
	
	public void Baja(String nombre) {
		for(int i = 0; i<AgenciasSuscritas.size(); i++) {
			if(AgenciasSuscritas.get(i).nombre.equals(nombre)) {
				AgenciasSuscritas.remove(i);
				break;
			}
		}
	}
	
	public void Notificar(String actualizacion) {
		
		for(Agencia A : AgenciasSuscritas) {
			A.Actualizar(actualizacion);
		}
		
	}


}

