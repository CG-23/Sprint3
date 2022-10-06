package FLORISTERIA.TXT;

import java.util.ArrayList;
import java.util.Scanner;

public class Floristeria {
	
	private String nom;
	private float PreuStock=0;
	private ArrayList<Arbre> LlistaArbre;
	private ArrayList<Flor> LlistaFlor;
	private ArrayList<Decoracio> LlistaDecoracio; 
	
	public Floristeria(String nom) {
		this.nom = nom;
		this.LlistaArbre = new ArrayList<Arbre>();
		this.LlistaFlor = new ArrayList<Flor>();
		this.LlistaDecoracio = new ArrayList<Decoracio>();
	}
	
	public void AfegirArbre(Arbre arbre1) {
		LlistaArbre.add(arbre1);
		PreuStock+=arbre1.getPreu();
		
//		Scanner sc =  new Scanner( new  Arbre( "C:\\Users\\karlo\\Desktop\\Arbol.csv" ));  
//		sc.useDelimiter( "," );   //establece el patrón delimitador  
//		while  (sc.hasNext())   //devuelve un valor booleano  
//		LlistaArbre.add(arbre1);	
		
	}
	
	public void AfegirFlor(Flor flor1) {
		LlistaFlor.add(flor1);
		PreuStock += flor1.getPreu();
	}
	
	public void AfegirDecoracio(Decoracio decoracio1) {
		LlistaDecoracio.add(decoracio1);
		PreuStock+= decoracio1.getPreu();
	}
	
	public void EliminarArbre(Arbre arbre1) {
		LlistaArbre.add(arbre1);
		PreuStock-=arbre1.getPreu();
	}
	
	public void EliminarFlor(Flor flor1) {
		LlistaFlor.add(flor1);
		PreuStock-=flor1.getPreu();
	}
	
	public void EliminarDecoracio(Decoracio decoracio1) {
		LlistaDecoracio.add(decoracio1);
		PreuStock-=decoracio1.getPreu();
	}
	
	public int StockArbre() {
		return LlistaArbre.size();
	}
	
	public int StockFlor() {
		return LlistaFlor.size();
	}
	
	public int StockDecoracio() {
		return LlistaDecoracio.size();
	}
	
	public void ReporteStock() {
		System.out.println("Arbres: "+LlistaArbre.size());
		System.out.println("Flors: "+LlistaFlor.size());
		System.out.println("Decoració: "+LlistaDecoracio.size());
	}
	
	public float GetPreuStock() {
		return PreuStock;
	}
	

}
