package synchronize;

public class Bank01 {
	private static Bank01 instance = new Bank01();
	private int money;
	
	private Bank01() {
		money = 1000;
	}
	
	public static Bank01 getInstance() {
		if(instance == null)
			instance = new Bank01();
		return instance;
	}
	
	public synchronized int withdraw(int m) {
		money -= m;
		return money;
	}
	
}
