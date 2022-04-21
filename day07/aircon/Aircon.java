package aircon;

public class Aircon {
	private boolean power;
	private int wind;
	private int temper;
	private int mode;
	
	private final int MAX_TEMP = 32;
	private final int MIN_TEMP = 18;
	//상수 사용해서 하는 것도 가능하다
	
	Aircon(){
		power=false;	// 전원 true : 켜짐, false : 꺼짐
		wind=1;			// 바람세기 1-3
		temper=20;  	// 온도 18-32
		mode=1;			// 1-냉방, 2-송풍, 3-제습
	}
	
	public void powerOnOff() {
		power = !power;
		if(power) {
			System.out.println("에어컨 전원이 켜졌습니다.");
		}else {
			System.out.println("에어컨 전원이 꺼졌습니다.");
		}
	}
	
	public void temperUp() {
		if (!power) return;
		if (temper<32)
			temper++;
		System.out.println("온도 : "+temper);
	}
	
	public void temperDown() {
		if (!power) return;
		if (temper>18)
			temper--;
		System.out.println("온도 : "+temper);
	}
	
	public void windChange() {
		if (!power) return;
		
//		if(wind ==1) {
//			System.out.println("바람 세기 : 약");
//		}else if(wind ==2) {
//			System.out.println("바람 세기 : 중");
//		}else if(wind ==3) {
//			System.out.println("바람 세기 : 강");
//		}
		
		wind = wind %3;
		wind++;
		
		switch(wind) {
		case 1:
			System.out.println("바람 세기 : 약");
			break;
		case 2:
			System.out.println("바람 세기 : 중");
			break;
		case 3:
			System.out.println("바람 세기 : 강");
			break;
		}
		
		
	}
	
	public void modeChange() {
		if (!power) return;
		
//		if(mode ==1) {
//			System.out.println("에어컨 모드 : 냉방");
//		}else if(mode ==2) {
//			System.out.println("에어컨 모드 : 송풍");
//		}else if(mode ==3) {
//			System.out.println("에어컨 모드 : 제습");
//		}
		
		mode = mode % 3;
		mode++;
		
		switch(mode) {
		case 1:
			System.out.println("에어컨 모드 : 냉방");
			break;
		case 2:
			System.out.println("에어컨 모드 : 송풍");
			break;
		case 3:
			System.out.println("에어컨 모드 : 제습");
			break;
		}
		
	}
	
}
