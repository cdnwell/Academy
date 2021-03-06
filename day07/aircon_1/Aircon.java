package aircon_1;


public class Aircon {
	private boolean power;
	private int wind;
	private int temp;
	private int mode;
	
	private final int MAX_TEMP = 32;
	private final int MIN_TEMP = 18;

	public Aircon() {
		wind = 2;
		temp =24;
		mode =1;
		//전원은 기본값 false
	}
	
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("에어컨 전원 On");
		else
			System.out.println("에어컨 전원 Off");
	}
	
	/*
	 * 에어컨 희망 온도를 올리는 메서드
	 * 최대 온도 32도를 넘어갈수는 없음
	 *  
	 */
	
	public void tempUp() {
		//운전모드가 냉방일떄만 실행
		if(!power) return;
		if(mode!=1) return;
		//if(mode == 2|| mode ==3) return;
		//if(mode ==1){ 명령어 }
		if (temp < MAX_TEMP) temp++;
		System.out.println("희망 온도 : "+temp);
	}
	
	public void tempDown() {
		//운전모드가 냉방일떄만 실행
		if(!power) return;
		if(mode!=1) return;
		if (temp > MIN_TEMP) temp--;
		System.out.println("희망 온도 : "+temp);
	}
	
	public void changeWind() {
		wind = wind % 4;
		wind++;
		
		switch(wind) {
		case 1:
			System.out.println("약풍");
			break;
		case 2:
			System.out.println("중풍");
			break;
		case 3:
			System.out.println("강풍");
			break;
		default:
			System.out.println("자동");
		}
	}
	
	public void selectMode() {
		mode = mode % 3;
		mode++;
		
		switch(mode) {
		case 1:
			System.out.println("냉방 운전 설정");
			break;
		case 2:
			System.out.println("송풍 운전 설정");
			break;
		default:
			System.out.println("제습 운전 설정");
			
		}
	}
	
	public void remote(int command) {
		switch(command) {
		case 1:
			powerOnOff();
			//이름이 안겹쳐서 구분이 되기때문에 this를 굳이 안써도 된다.
			//구분이 안될경우에는 써줘야됨
			break;
		case 2:
			tempUp();
			break;
		case 3:
			tempDown();
			break;
		case 4:
			changeWind();
			break;
		case 5:
			selectMode();
			break;
			
		}
		
	}
	
}
