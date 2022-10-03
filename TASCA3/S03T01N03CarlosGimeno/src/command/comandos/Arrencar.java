package command.comandos;

import parking.Avio;

public class Arrencar implements Command {
	
	String Transporte;

	public Arrencar(String Transporte) {
		this.Transporte = Transporte;
		
	}

	@Override
	public void execute() {
		System.out.println("Arrancando "+Transporte);
	}

}
