package echoservertest;

public class EchoClientMain {

	public static void main(String[] args) {
		EchoClientThread ect1 = new EchoClientThread("스레드1");
		EchoClientThread ect2 = new EchoClientThread("스레드2");
		EchoClientThread ect3 = new EchoClientThread("스레드3");
		
		ect1.start();
		ect2.start();
		ect3.start();
		
	}

}
