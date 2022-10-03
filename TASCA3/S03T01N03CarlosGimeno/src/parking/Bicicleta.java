package parking;

import command.comandos.Accelerar;
import command.comandos.Arrencar;
import command.comandos.Frenar;

public class Bicicleta {
	
	private Accelerar comandoAcelerar;
	private Arrencar comandoArrencar;
	private Frenar comandoFrenar;
	
	public Bicicleta() {
		comandoAcelerar = new Accelerar("Bicicleta");
		comandoArrencar = new Arrencar("Bicicleta");
		comandoFrenar = new Frenar("Bicicleta");
		
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
