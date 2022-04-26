package has_a_1;
/*
 * 총 클래스
 * 	총알 개수를 가지고 있음
 * 	총알의 최대값은 8
 * 	shot이라는 메서드를 사용하면, 총을 1발씩 발사, 효과음 출력
 * 	만약에 총알을 다 쓰면 reload라고 외치고 총알을 리필
 * 
 * 총쏘기, reload - 메서드
 * 필드 - 총알
 */
public class Gun {
//	private final int MAX_AMMO = 8;
//	private int ammo;
//
//	public Gun() {
//		ammo=MAX_AMMO;
//	}
//	
//	public void shot() {
//		if(ammo == 0) {
//			reload();
//			ammo=MAX_AMMO;
//		}else {
//			System.out.println("탕");
//			ammo--;
//		}
//	}
//	
//	public void reload() {
//		System.out.println("reload!");
//	}
	protected int bullet;

	public Gun() {
		bullet = 8;
	}
	
	public void shot() {
		if (bullet == 0) 
			reload();
		else {
			bullet--;
			System.out.println("Bbang!");
		}
	}
	
	public void reload() {
		bullet = 8;
		System.out.println("reload!!");
	}
	
}
