package step02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class EchoMultiServerMain {
	public static ArrayList <ServerWorker> list = new ArrayList<ServerWorker>();
	//문제점 어느 클래스에서나 접근 가능해짐
	//private으로 하면 스레드가 직접 접근을 못해 문제
	
	
	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(1234);
			System.out.println("서버오픈 완료");
			while(true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "님이 접속했습니다.");
				ServerWorker worker = new ServerWorker(client);
				worker.start();
				list.add(worker);
				System.out.println("현재 접속인원 : "+list.size());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
