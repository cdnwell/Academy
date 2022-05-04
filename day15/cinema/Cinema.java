package cinema;

public class Cinema {
	private static Cinema instance = new Cinema();
	private String [] seat = new String [5];
	
	private Cinema() {
		for(int i=0;i<seat.length;i++) {
			seat[i]="빈 좌석";
		}
	}
	
	public static Cinema getInstance() {
		if(instance == null)
			instance = new Cinema();
		
		return instance;
	}
	
	public boolean ticket(int num, String name) {
		
		if(seat[num-1].equals("빈 좌석")) {
			seat[num-1] = name;
			return true;
		}else {
			System.out.println("이미 예약이 완료된 좌석입니다.");
			return false;
		}
		
	}
	
	public void statusAllSeat() {
		for(int i=0;i<5;i++) {
			System.out.println(i+1+" - "+seat[i]);
		}
	}
	
}
