package cinema;

public class CinemaMain {

	public static void main(String[] args) {
//		Cinema cin1 = new Cinema();
//		cin1.statusAllSeat();
//		
//		cin1.ticket(1, "홍길동");
//		cin1.ticket(2, "김영희");
//		cin1.ticket(5, "이철수");
//		
//		System.out.println();
//		
//		cin1.statusAllSeat();
//		
//		System.out.println();
//		
//		cin1.ticket(1, "임티켓");
//		System.out.println();
//		cin1.statusAllSeat();
		
		Cinema cinema = Cinema.getInstance();
		Customer customer = new Customer("김티켓",cinema);
		
		
	}

}
