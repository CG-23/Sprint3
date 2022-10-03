package singleton;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion; 
	        
	       while(!salir){
	            
	           System.out.println("1. Afegir comanda");
	           System.out.println("2. Eliminar comanda");
	           System.out.println("3. Llistar ultima comanda");
	           System.out.println("4. Salir");
	            
	           System.out.println("Escribe una de las opciones");
	           opcion = sn.nextInt();
	           
	           Undo instancia = Undo.getInstancia();
	            
	           switch(opcion){
	               case 1:
	                   System.out.println("Has seleccionado la opcion afegir comanda ");
	                   System.out.println("Que vols afegir?");
	           			String n = sn.nextLine();
	           			instancia.afegir(n);
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado la opcion eliminar comanda");
	                   System.out.println("Que vols eliminar?");
	           			n = sn.nextLine();
	                   instancia.eliminar(n);
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado la opcion Llistar comanda");
	                   instancia.mostrar();
	                   break;
	                case 4:
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 4");
	           }
	            
	       }
	        
	    }
}

