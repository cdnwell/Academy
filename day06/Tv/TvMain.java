package Tv;

public class TvMain {

	public static void main(String[] args) {
		TvClass tv1=new TvClass();
		
		System.out.println("채널:"+tv1.channel);
		System.out.println("볼륨:"+tv1.volume);
		System.out.println("음소거:"+tv1.mute);
		System.out.println("전원:"+tv1.power);
		
		System.out.println("볼륨 세 번 올립니다.");
		
		for(int i=0;i<3;i++) {
			tv1.VolumeUp();
		}
		
		System.out.println("볼륨:"+tv1.volume);
		
		System.out.println("채널 567번으로 갑니다.");
		tv1.channel=567;
		System.out.println("채널:"+tv1.channel);
		
		System.out.println("채널을 5번 올립니다.");
		for(int i=0;i<5;i++) {
			tv1.ChannelUp();
		}
		System.out.println("채널:"+tv1.channel);
		
		System.out.println("볼륨을 1로 내립니다.");
		tv1.volume=1;
		
		System.out.println("볼륨을 4번 내립니다.");
		for(int i=0;i<4;i++) {
			tv1.VolumeDown();
		}
		System.out.println("볼륨:"+tv1.volume);
		
		System.out.println("tv 전원을 끕니다.");
		tv1.PowerSwitch();
		System.out.println("전원:"+tv1.power);
		
		System.out.println("tv 전원을 킵니다.");
		tv1.PowerSwitch();
		System.out.println("채널:"+tv1.channel);
		System.out.println("볼륨:"+tv1.volume);
		System.out.println("음소거:"+tv1.mute);
		System.out.println("전원:"+tv1.power);
	}

}
