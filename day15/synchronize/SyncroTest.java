package synchronize;

public class SyncroTest {

	public static void main(String[] args) {
		Bank bank = Bank.getInstance();
		Player01 p1 = new Player01(bank);
		Player01 p2 = new Player01(bank);
		Player01 p3 = new Player01(bank);
		
		p1.start();
		p2.start();
		p3.start();
	}

}
