package parking;

import command.comandos.Accelerar;
import command.comandos.Arrencar;
import command.comandos.Frenar;

public class Vaixell {
	
	private Accelerar comandoAcelerar;
	private Arrencar comandoArrencar;
	private Frenar comandoFrenar;
	
	public Vaixell() {
		comandoAcelerar = new Accelerar("Vaixell");
		comandoArrencar = new Arrencar("Vaixell");
		comandoFrenar = new Frenar("Vaixell");
		
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
