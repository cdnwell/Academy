package priority;

public class ThreadPriority extends Thread{
	
	public ThreadPriority(String name) {
		super(name);
		System.out.println(name + " - 스레드 생성");
	}

	@Override
	public void run() {
		
		try {
			for(int i =0;i<10;i++)
			Thread.sleep(100);
			//sleep 해당 숫자만큼의 시간동안 멈추겠다. 1/1000초 단위 1000 = 1초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(getName() + " - 스레드 종료");
	}
	
}
