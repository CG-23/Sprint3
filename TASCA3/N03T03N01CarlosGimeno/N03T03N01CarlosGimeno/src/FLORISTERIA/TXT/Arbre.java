package FLORISTERIA.TXT;

import java.util.ArrayList;
import java.util.Scanner;

public class Arbre {
	
	private int alçada;
	private int preu;
	
	public Arbre(int alçada, int preu) {
		this.alçada = alçada;
		this.preu = preu;	
	}
	
	
	
	

	public int getAlçada() {
		return alçada;
	}

	public void setAlçada(int alçada) {
		this.alçada = alçada;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

}
