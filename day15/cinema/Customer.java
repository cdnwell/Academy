package cinema;

import java.util.Random;

public class Customer extends Thread{
	private String name;
	private int seatNo;
	Random r = new Random();
	Cinema cinema;
	
	public Customer(String name,Cinema cinema){
		this.name = name;
		seatNo = r.nextInt(5)+1;
		this.cinema = cinema;
	}
	
	@Override
	public void run() {
		
	}
	
}
