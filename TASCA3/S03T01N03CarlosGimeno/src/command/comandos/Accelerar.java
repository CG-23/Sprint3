package command.comandos;

import parking.Avio;

public class Accelerar implements Command {
	
	String Transporte;

	public Accelerar(String Transporte) {
		this.Transporte = Transporte;
		
	}

	@Override
	public void execute() {
		System.out.println("Accelerando "+Transporte);
	}

}
