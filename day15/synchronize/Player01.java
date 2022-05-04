package synchronize;

public class Player01 extends Thread{
	private int money;
	private Bank bank;
	
	public Player01(Bank bank) {
		this.bank = bank;
		money = 0;
	}
	
	public void getMoney() {
//		money += 1000; 
		System.out.println(getName() + " : " + bank.withdraw(1000));
	}
	
	@Override
	public void run() {
		getMoney();
	}
	
}
