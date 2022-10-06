package FLORISTERIA.TXT;

public class Main {

	public static void main(String[] args) {
		
		//Crear floristeria
		Floristeria F = new Floristeria("Rosa");
		F.LlegirCSV("./catalogo.CSV");
		F.ReporteStock();
		
		//Afegir arbres		
		Arbre roure = new Arbre(2,43);
		F.AfegirArbre(roure);
		//Afegir flor
		Flor rosa = new Flor ("blau",22);
		F.AfegirFlor(rosa);
		//Afegir decoració
		Decoracio armari = new Decoracio("fusta",57);
		F.AfegirDecoracio(armari);
		
		//Mostrar Stock del catàleg
		F.ImprimirStock();
		
		//Retirar Arbre
		F.EliminarArbre(roure);
		//Retirar Flor
		F.EliminarFlor(rosa);
		//Retirar decoració
		F.EliminarDecoracio(armari);
		
		//Stock amb quantitats
		F.ReporteStock();
		
		//Valor total floristeria
		System.out.println(F.GetPreuStock());
		
		//Crear Ticket
		F.comprar(2, 2, 1);
		
		//Llista compres antigues
		F.ImprimirTickets();
		
		//Diners guaññasta vendes
		System.out.println(F.TotalGuanyat());
		
		
		
		
		
	}

}
