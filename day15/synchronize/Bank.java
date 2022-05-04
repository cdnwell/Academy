
package synchronize;

public class Bank {
	private static Bank instance = new Bank();
	private int hasMoney;
	
	private Bank() {
		hasMoney=1000;
	}
	
	public static Bank getInstance() {
		if(instance == null)
			instance = new Bank();
		
		return instance;
	}
	
	public synchronized int withdraw(int withMoney) {
		hasMoney -= withMoney;
		return hasMoney;
	}
	
}
