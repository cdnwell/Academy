package init;

public class RunnableRun implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<1000000;i++) {
			//getName()은 스레드에 있는 메서드라 안됨
			//currentThread는 static 메서드
			//start를 이용해서 실행해야됨
		}
		System.out.println(Thread.currentThread().getName() + " - 종료");
	}
	//오버라이드 하면 run이 나옴 스레드도 run만 오버라이드 하면됨
	
}
