package job;

public class JobInfo {
	private static JobInfo instance = new JobInfo();
	private String jobInfo;
	
	private JobInfo() {}

	public static JobInfo getInstance() {
		if(instance == null)
			instance = new JobInfo();
		return instance;
	}
	
	public synchronized String getJobInfo() throws InterruptedException { 
		//여러명이 한번에 접속하면 중복되므로 synchronized 처리
		String msg = null;
		if(jobInfo == null)
			wait();		//스레드 대기 상태로 만듬
		
		msg = jobInfo;
		jobInfo = null;
		
		return msg;
	}
	
	public synchronized void writeJob(String job) {
		jobInfo = job;
		notifyAll();		//대기 중이던 스레드를 다 꺠운다.
	}
	
}//wait, notifyAll 메서드
//init 스레드 최초 패키지 까지 하기 [오늘 중요한 것]
