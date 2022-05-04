package priority;

public class PriorityMain {

	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority("T1");
		ThreadPriority t2 = new ThreadPriority("T2");
		ThreadPriority t3 = new ThreadPriority("T3");
		ThreadPriority t4 = new ThreadPriority("T4");
		ThreadPriority t5 = new ThreadPriority("T5");
		ThreadPriority t6 = new ThreadPriority("T6");
		
		t1.setPriority(Thread.MAX_PRIORITY);	//1~10 우선순위 값, 10으로 갈수록 높음
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(Thread.MIN_PRIORITY);
		t6.setPriority(Thread.MIN_PRIORITY);
		
		//우선순위가 높다고 무조건 먼저 끝나는 것이 아니다.
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		System.out.println("main 종료");
		//main : main 스레드, main이 끝나더라도 프로그램이 끝난 것이 아니다. main이 계속 일을 시켰으면
		//게속 일을 하고 있다. 
		
		//join : 지정된 시간동안 스레드 수행
	}

}
