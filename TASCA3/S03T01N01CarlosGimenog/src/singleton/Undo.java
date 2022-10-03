package singleton;

import java.util.ArrayList;
import java.util.Scanner;

public class Undo {
	private ArrayList<String>comanda;
	private static Undo instancia = null;
	
	private Undo(){
		comanda = new ArrayList<String>();
	}
	public static Undo getInstancia() {
		if(instancia==null) {
			instancia = new Undo();
		}
		return instancia;
	}
	
	public int cercar(String n) {
		int i;
		boolean f=false;
		for (i = 0; i<comanda.size() & f==false;) {	
			if (n.equals(comanda.get(i))) {
				f=true;
				
			}else {
				f=false;
				i++;
			}
		}
		return (i);
		
	}	
	public void afegir(String n) {
		comanda.add(n);
	}
	
	public void eliminar(String n) {
		comanda.remove(cercar(n));
		
	}
	public void mostrar() {
		for (int i = 0; i<comanda.size(); i++) {
			String e = comanda.get(i);
            System.out.println(e);
        }
	}
}
