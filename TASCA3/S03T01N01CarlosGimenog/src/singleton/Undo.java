package singleton;

import java.util.ArrayList;
import java.util.Scanner;

public class Undo {
	private static ArrayList<String>comanda;
	
	private Undo(){
		
	}
	public static ArrayList getComanda() {
		if(comanda==null) {
			comanda = new ArrayList();
		}
		return comanda;
	}
	
	public static int cercar(String n) {
		Scanner sc = new Scanner(System.in);
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
	public static  void afegir(String n) {
		comanda.add(n);
		for (int i = 0; i<comanda.size(); i++) {
			String e = comanda.get(i);
            System.out.println(e);
        }
	}
	public static  void eliminar(String n) {
		comanda.remove(cercar(n));
		
	}
	public static void mostrar() {
		for (int i = 0; i<comanda.size(); i++) {
			String e = comanda.get(i);
            System.out.println(e);
        }
	}
}
