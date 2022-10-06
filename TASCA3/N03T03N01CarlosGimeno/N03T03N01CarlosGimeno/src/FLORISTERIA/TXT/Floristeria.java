package FLORISTERIA.TXT;

import java.util.ArrayList;
import java.util.Scanner;

public class Floristeria {
	
	private String nom;
	private ArrayList<Arbre> LlistaArbre;
	private ArrayList<Arbre> LlistaFlor;
	private ArrayList<Arbre> LlistaDecoracio; 
	
	public Floristeria(String nom, ArrayList<Arbre> LlistaArbre, ArrayList<Arbre> LlistaFlor,ArrayList<Arbre> LlistaDecoracio ) {
		this.nom = nom;
		this.LlistaArbre = new ArrayList<Arbre>();
		this.LlistaFlor = new ArrayList<Arbre>();
		this.LlistaDecoracio = new ArrayList<Arbre>();
	}
	
	public static void AfegirArbre(ArrayList<Arbre> LlistaArbre) {
		Arbre arbre1 = new Arbre(2,3);
		Scanner sc =  new Scanner( new  Arbre( "C:\\Users\\karlo\\Desktop\\Arbol.csv" ));  
		sc.useDelimiter( "," );   //establece el patrón delimitador  
		while  (sc.hasNext())   //devuelve un valor booleano  
		LlistaArbre.add(arbre1);		
		
	}
	
	
	
	

}
