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
	            
	           switch(opcion){
	               case 1:
	                   System.out.println("Has seleccionado la opcion afegir comanda ");
	                   Scanner sc = new Scanner(System.in);
	                   System.out.println("Que vols afegir?");
	           			String n = sc.nextLine();
	           			Undo.afegir(n);
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado la opcion eliminar comanda");
	                   Scanner sl = new Scanner(System.in);
	                   System.out.println("Que vols eliminar?");
	           			n = sl.nextLine();
	                   Undo.eliminar(n);
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado la opcion Llistar comanda");
	                   Undo.mostrar();
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

