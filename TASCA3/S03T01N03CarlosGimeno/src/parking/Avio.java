package parking;

import command.comandos.Accelerar;
import command.comandos.Arrencar;
import command.comandos.Frenar;

public class Avio {
	
	private Accelerar comandoAcelerar;
	private Arrencar comandoArrencar;
	private Frenar comandoFrenar;
	
	public Avio() {
		comandoAcelerar = new Accelerar("Avió");
		comandoArrencar = new Arrencar("Avió");
		comandoFrenar = new Frenar("Avió");
		
	}
	
	public void arrencar() {
		comandoArrencar.execute();
	}
	
	public void accelerar() {
		comandoAcelerar.execute();
	}
	
	public void frenar() {
		comandoFrenar.execute();
	}
}
