package anonymous;

public class PoliceMain {

	public static void main(String[] args) {
		Gun gun = new Gun() {
			//생성자 만들기 불가
			private int bullet = 10;
			
			@Override
			public void shot() {
				
				if(bullet>0) {
				bullet--;
				System.out.println("Bang!");
				}else {
					reload();
				}
			}
			
			@Override
			public void reload() {
				bullet = 10;
				System.out.println("reload!");
			}
		};
		
		for(int i =0;i<13;i++) {
			gun.shot();
		}
		
		Police police = new Police(gun);
		police.changeGun(new Gun() {
			private int bullet = 10;
			
			@Override
			public void shot() {
				bullet--;
				bullet--;
				System.out.println("BangBang");
			}
			
			@Override
			public void reload() {
				System.out.println("reload");
				
			}
			
		});
		
	}

}
