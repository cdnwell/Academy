package synchronize;

public class Player extends Thread{
	private int money;
	private Bank bank;
	
	public Player(Bank bank) {
		this.bank = bank;
	}
	
	public int getMoney() {
		money -= 1000;
		return money;
	}

	@Override
	public void run() {
		getMoney();
	}
	
}
