package aircon;

public class AriconMain {

	public static void main(String[] args) {
		Aircon aircon = new Aircon();
		
		aircon.powerOnOff();
		
		for (int i=0;i<15;i++)
			aircon.temperUp();
		for (int i=0;i<25;i++)
			aircon.temperDown();
		for (int i=0;i<5;i++)
			aircon.modeChange();
		for (int i=0;i<5;i++)
			aircon.windChange();
		
	}

}
