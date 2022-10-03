package invoker;

import java.util.Scanner;

import parking.Avio;
import parking.Bicicleta;
import parking.Cotxe;
import parking.Vaixell;

public class Main {

	public static void main(String[] args) {
		
		Avio avio1 = new Avio();
		Bicicleta bici1 = new Bicicleta();
		Cotxe cotxe1 = new Cotxe();
		Vaixell vaixell1 = new Vaixell();
		
		Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion; 
	        
	       while(!salir){
	            
	           System.out.println("1. Cotxe");
	           System.out.println("2. Bicicleta");
	           System.out.println("3. Avió");
	           System.out.println("4. Vaixell");
	           System.out.println("5. Salir");
	           
	            
	           System.out.println("Quin vehicle vols utilitzar ?");
	           opcion = sn.nextInt();
	         
	            
	           switch(opcion){
	               case 1:
	            	   System.out.println("1. Arrencar");
	    	           System.out.println("2. Accelerar");
	    	           System.out.println("3. Frenar");
	    	           System.out.println("Que vols fer ?");
	    	           opcion = sn.nextInt();
	    	           		switch(opcion) {
	    	           		case 1:
	    	           			cotxe1.arrencar();
	    	           			break;
	    	           		case 2:
	    	           			cotxe1.accelerar();
	    	           			break;
	    	           		case 3:
	    	           			cotxe1.frenar();
	    	           		}
	                   break;
	               case 2:
	            	   System.out.println("1. Arrencar");
	    	           System.out.println("2. Accelerar");
	    	           System.out.println("3. Frenar");
	    	           System.out.println("Que vols fer ?");
	    	           opcion = sn.nextInt();
	    	           		switch(opcion) {
	    	           		case 1:
	    	           			bici1.arrencar();
	    	           			break;
	    	           		case 2:
	    	           			bici1.accelerar();
	    	           			break;
	    	           		case 3:
	    	           			bici1.frenar();
	    	           		}
	                   break;
	                case 3:
	                	System.out.println("1. Arrencar");
		    	           System.out.println("2. Accelerar");
		    	           System.out.println("3. Frenar");
		    	           System.out.println("Que vols fer ?");
		    	           opcion = sn.nextInt();
		    	           		switch(opcion) {
		    	           		case 1:
		    	           			avio1.arrencar();
		    	           			break;
		    	           		case 2:
		    	           			avio1.accelerar();
		    	           			break;
		    	           		case 3:
		    	           			avio1.frenar();
		    	           		}
		                   break;
	                case 4:
	                	System.out.println("1. Arrencar");
		    	           System.out.println("2. Accelerar");
		    	           System.out.println("3. Frenar");
		    	           System.out.println("Que vols fer ?");
		    	           opcion = sn.nextInt();
		    	           		switch(opcion) {
		    	           		case 1:
		    	           			vaixell1.arrencar();
		    	           			break;
		    	           		case 2:
		    	           			vaixell1.accelerar();
		    	           			break;
		    	           		case 3:
		    	           			vaixell1.frenar();
		    	           		}
		                   break;
	                
	                case 5:
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo numeros entre 1 y 4");
	           }
	            
	       }
	        
	    }
	}
