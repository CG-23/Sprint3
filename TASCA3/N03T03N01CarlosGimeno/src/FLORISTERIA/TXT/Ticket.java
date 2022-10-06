package FLORISTERIA.TXT;

import java.util.ArrayList;

public class Ticket {
	
	private ArrayList<ItemFloristeria> LlistaCompra = new ArrayList<ItemFloristeria>();
	private float total=0;
	
	public void AfegirTicket(ItemFloristeria Item1) {
		
		LlistaCompra.add(Item1);
		total += Item1.getPreu();
		
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
	public void PrintTicket() {
		for(int i = 0; i<LlistaCompra.size(); i++) {
			System.out.println(LlistaCompra.get(i).toString());
		}
		System.out.println("Total: "+total+"\n"); 
	}
	
	
}
