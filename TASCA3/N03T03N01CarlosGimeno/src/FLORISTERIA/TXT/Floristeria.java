package FLORISTERIA.TXT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Floristeria {
	
	private String nom;
	private float PreuStock=0;
	private ArrayList<Arbre> LlistaArbre;
	private ArrayList<Flor> LlistaFlor;
	private ArrayList<Decoracio> LlistaDecoracio;
	private ArrayList<Ticket> LlistaTickets;
	
	public Floristeria(String nom) {
		this.nom = nom;
		this.LlistaArbre = new ArrayList<Arbre>();
		this.LlistaFlor = new ArrayList<Flor>();
		this.LlistaDecoracio = new ArrayList<Decoracio>();
		this.LlistaTickets = new ArrayList<Ticket>();
	}
	
	public void LlegirCSV(String file) {
		try {
			Scanner sc =  new Scanner( new  File(file));
			
			String linea;
			String[] campo;
			
			while(sc.hasNextLine()) {
				linea=sc.nextLine();
				campo = linea.split(",");
				if(campo[0].equals("Arbre")) {
					LlistaArbre.add(new Arbre(Integer.parseInt(campo[2]),Float.parseFloat(campo[1])));
				}else if(campo[0].equals("Flor")) {
					LlistaFlor.add(new Flor(campo[2],Float.parseFloat(campo[1])));
				}else if(campo[0].equals("Decoracio")) {
					LlistaDecoracio.add(new Decoracio(campo[2],Float.parseFloat(campo[1])));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
	public void AfegirArbre(Arbre arbre1) {
		LlistaArbre.add(arbre1);
		PreuStock+=arbre1.getPreu();
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
		LlistaArbre.remove(arbre1);
		PreuStock-=arbre1.getPreu();
	}
	
	public void EliminarFlor(Flor flor1) {
		LlistaFlor.remove(flor1);
		PreuStock-=flor1.getPreu();
	}
	
	public void EliminarDecoracio(Decoracio decoracio1) {
		LlistaDecoracio.remove(decoracio1);
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
	
	public void ImprimirStock() {
		for(Arbre e : LlistaArbre) {
			System.out.println(e.toString());
		}
		for(Decoracio e : LlistaDecoracio) {
			System.out.println(e.toString());
		}
		for(Flor e : LlistaFlor) {
			System.out.println(e.toString());
		}
	}
	
	public float GetPreuStock() {
		return PreuStock;
	}
	
	public void AfegirTicket(Ticket ticket1) {
		LlistaTickets.add(ticket1);
	}
	
	public float TotalGuanyat() {
		float TotalTickets=0;
		for(int i=0;i<LlistaTickets.size();i++) {
			TotalTickets += LlistaTickets.get(i).getTotal();
		}
		return TotalTickets;
	}
	
	public void ImprimirTickets() {
		for(Ticket e : LlistaTickets) {
			e.PrintTicket();
		}
	}
		
	public void comprar(int nflors, int narbre, int ndecoracio) {
		Ticket ticket1 = new Ticket();
		Flor flor1;
		Arbre arbre1;
		Decoracio decoracio1;
		for(int i = 0; i<nflors;i++) {
			flor1 = LlistaFlor.get(0);
			ticket1.AfegirTicket(flor1);
			EliminarFlor(flor1);
		}
		for(int i = 0; i<narbre;i++) {
			arbre1 = LlistaArbre.get(0);
			ticket1.AfegirTicket(arbre1);
			EliminarArbre(arbre1);
		}
		for(int i = 0; i<ndecoracio;i++) {
			decoracio1 = LlistaDecoracio.get(0);
			ticket1.AfegirTicket(decoracio1);
			EliminarDecoracio(decoracio1);
		}
		LlistaTickets.add(ticket1);
		
	}
}

