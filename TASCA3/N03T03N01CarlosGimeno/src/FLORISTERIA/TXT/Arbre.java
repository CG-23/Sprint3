package FLORISTERIA.TXT;

import java.util.ArrayList;
import java.util.Scanner;

public class Arbre extends ItemFloristeria {
	
	private int alçada;
	private float preu;
	
	public Arbre(int alçada, float preu) {
		this.alçada = alçada;
		this.preu = preu;	
	}
	
	public int getAlçada() {
		return alçada;
	}

	public void setAlçada(int alçada) {
		this.alçada = alçada;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "Arbre alçada=" + alçada + ", preu=" + preu + "";
	}
	

}
