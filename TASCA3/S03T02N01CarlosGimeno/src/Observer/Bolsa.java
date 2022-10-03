package Observer;

import java.util.Scanner;

public class Bolsa {

	public static void main(String[] args) {
		
		AgenteBolsa agente = new AgenteBolsa();
		Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion; 
	       String nombre;
	        
	       while(!salir){
	            
	           System.out.println("1. Suscribir Agencia");
	           System.out.println("2. Dar de baja agencia");
	           System.out.println("3. Subir Bolsa");
	           System.out.println("4. Bajar Bolsa");
	           System.out.println("5. Salir");
	           
	            
	           System.out.println("Que acción quieres ejecutar ?");
	           opcion = sn.nextInt();
	           
	         
	            
	           switch(opcion){
	               case 1:
	            	   System.out.println("Nombre de la agencia: ");
	            	   nombre= sn.next();
	            	   agente.Suscribir(new Agencia(nombre));
	            	   break;
	            	   
	               case 2:
	            	   System.out.println("Nombre de la agencia: ");
	            	   nombre= sn.next();
	            	   agente.Baja(nombre);
	            	   break;
	               case 3:	            	 
	            	   agente.Notificar("Subida Bolsa");
	            	   break;
	               case 4:
	            	   agente.Notificar("Bajada Bolsa");
	            	   break;
	               case 5:
	            	   salir = true;
	            	   break;            	   
	           }

	       }
	}
}
