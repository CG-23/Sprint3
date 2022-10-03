package parking;

import command.comandos.Accelerar;
import command.comandos.Arrencar;
import command.comandos.Frenar;

public class Cotxe {
	
	private Accelerar comandoAcelerar;
	private Arrencar comandoArrencar;
	private Frenar comandoFrenar;
	
	public Cotxe() {
		comandoAcelerar = new Accelerar("Cotxe");
		comandoArrencar = new Arrencar("Cotxe");
		comandoFrenar = new Frenar("Cotxe");
		
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
