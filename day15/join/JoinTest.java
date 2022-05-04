package join;

public class JoinTest {

	public static void main(String[] args) {
		JoinThread j = new JoinThread("Join");
		
		j.start();
		
		try {
			//현재 스레드가 j 스레드가 끝날때까지 대기
			//밀리초가 들어가면 해당 시간까지만 대기한다.
			//join에 밀리초가 들어가서 해당 시간 만큼 기다린 후 main 종료
			j.join(1000);//1초동안 작업을 기달려 주겠다.
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}//join은 작업을 대기하는 것, join이 끝나자 main이 끝남
		
		
		System.out.println("main thread exit");
	}

}
