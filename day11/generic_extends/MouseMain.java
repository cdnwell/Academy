package generic_extends;

public class MouseMain {

	public static void main(String[] args) {
		ImportMouse<GamingMouse> mouse1 = new ImportMouse<GamingMouse>(new GamingMouse());
		
		mouse1.click(0);
		mouse1.click(1);
		mouse1.click(2);
		
		mouse1.wheel();
		
		//ImportMouse에 Office 마우스 등록 - OfficeMouse는 Mouse를 안받았기 떄문에 등록이 안됨
//		ImportMouse<OfficeMouse> mouse2 = new ImportMouse<OfficeMouse>(new OfficeMouse());
		
//		mouse2.click(0);
//		mouse2.click(1);
//		mouse2.click(2);
//		
//		mouse2.wheel();
		
		
		//오류 OfficeMouse는 Mouse를 상속받지 않기 때문에 안된다.
		//제네릭 - 레퍼클래스를 알아야 한다.
		
	}

}
