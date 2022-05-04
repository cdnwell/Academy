package init;

public class ThreadRun extends Thread{
	//생성자 -> 스레드 이름을 받음
	//스레드를 받으면 확장성에 문제가 생겨
	public ThreadRun(String name) {
		super(name);
		System.out.println(name + " - 스레드 생성");
	}

	//자동으로 수행할 메서드
	@Override
	public void run() {
		for(int i= 0; i<1000000;i++) {
		}//스레드는 누가 먼저 끝날지 모른다.
		System.out.println(getName() + " 스레드 종료");
		
	}
	
}
