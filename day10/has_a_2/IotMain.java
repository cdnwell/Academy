package has_a_2;

public class IotMain {

	public static void main(String[] args) {
		
//		IotApp ia = new IotApp();
//		ia.deviceAllPowerOn();
		
		IotApp app = new IotApp();
		
		PowerOnOff device = new Light();
		app.addDevice(device);
		device = new Tv();
		app.addDevice(device);
		device = new Aircon();
		app.addDevice(device);
		
		app.deviceAllPowerOn();
		app.deviceAllPowerOff();
		
	}

}
