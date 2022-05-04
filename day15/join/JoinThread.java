package join;

public class JoinThread extends Thread{

	public JoinThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			for(int i =0;i<10;i++)
			Thread.sleep(500);
			//sleep 해당 숫자만큼의 시간동안 멈추겠다. 1/1000초 단위 1000 = 1초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(getName() + " - 스레드 종료");
		
	}
}
//특정스레드가 join시킬때 하위 스레드가 끝나야 일을 할 수 있을 때 사용
//작업을 기달려 줄떄 사용하는 것 