package command.comandos;

import parking.Avio;

public class Frenar implements Command {
	
	String Transporte;

	public Frenar(String Transporte) {
		this.Transporte = Transporte;
		
	}

	@Override
	public void execute() {
		System.out.println("Frenando "+Transporte);
	}

}
