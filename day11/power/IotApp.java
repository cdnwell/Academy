package power;

import java.util.Scanner;

public class IotApp {
	private PowerOnOff[] arr;
	private int index;
	
	public IotApp() {
		arr = new PowerOnOff[10];
		arr[index++] = new Tv();
		arr[index++] = new Tv();
		arr[index++] = new Light();
		arr[index++] = new Aircon();
	}
	
	//새로운 기기를 받아서 배열에 등록하는 메서드
	public void addDevice(PowerOnOff device) {
//		System.out.println("새로운 기기(1.에어컨 2.Tv 3.전등)....");
//		int registerThing=sc.nextInt();
//		
//		
//		if(registerThing ==1) {
//			
//			arr[index++] = new Aircon();
//		}else if(registerThing == 2) {
//			arr[index++] = new Tv();
//		}else if(registerThing == 3){
//			arr[index++] = new Light(); 
//			
//		}
		
		
//		예시2]
		if(index != arr.length) {
			arr[index++] = device;
			System.out.println("디바이스 등록 완료");
		}else {
			System.out.println("더이상 등록할 공간이 없습니다.");
		}
		
	}
	
//	전체 powerOn
	
	public void deviceAllPowerOn() {
//		if(index == 0) {
//			System.out.println("기기가 등록되지 않았습니다.");
//			return;
//		}
		
		for(int i=0;i<index;i++) {
			arr[i].powerOn();
//			System.out.println("전체 기기의 전원을 켰습니다.");
		}
	}
	
//	전체 powerOff

	public void deviceAllPowerOff() {
//		if(index == 0) {
//			System.out.println("기기가 등록되지 않았습니다.");
//			return;
//		}
		
		for(int i=0;i<index;i++) {
			arr[i].powerOff();
//			System.out.println("전체 기기의 전원을 껐습니다.");
		}
	}

	
}
