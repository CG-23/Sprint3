package abstractFactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sn = new Scanner(System.in);
 	            
			System.out.println("Quin tipus de dades vols guardar a l'agenda");
			System.out.println("1.ESPANYA\n2.FRANCIA");
			int n = sn.nextInt();
		           	            
		           switch(n){
		               case 1:
		                   System.out.println("Has seleccionado ESPANYA ");
		                   Scanner sc = new Scanner(System.in);
		                   AgendaFactory Carlos = FactoryMaker.getRepositoryFactory(TipoFactory.ESPANYA);
		                   Telefon telefonCarlos = Carlos.getTelefon();
		                   Adreça adreçaCarlos = Carlos.getAdreça();
		                   break;
		               case 2:
		                   System.out.println("Has seleccionado la opcion FRANCIA");
		                   Scanner sl = new Scanner(System.in);
		                   AgendaFactory Aina = FactoryMaker.getRepositoryFactory(TipoFactory.FRANCIA);
		                   Telefon telefonAina = Aina.getTelefon();
		                   Adreça adreçaAina = Aina.getAdreça();
		                   break;
		                
		                default:
		                   System.out.println("Solo números entre 1 y 2");
		           }
		            
		  }
		        
	}
