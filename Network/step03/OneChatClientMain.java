package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class OneChatClientMain {
	private static class ClientWorker extends Thread{
		private Socket server;
		private BufferedReader br;
		public ClientWorker(Socket server) {
			this.server = server;
			
			try {
				br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		@Override
		public void run() {
			try {
				while(true) {
					String str = br.readLine();
					if(str == null || str.equals("exit")) break;
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(br != null) br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
		}
	}//클라이언트 프로그램이 있으면 서버프로그램도 있다. 게임 클라이언트
	
	public static void main(String[] args) {
		Socket server = null;
		Scanner sc = null;
		PrintWriter pw = null;
		
		try {
			server = new Socket("192.168.5.101", 1234);	//통신 위한 ip 주소 (접속함)
			//스레드로 입력해서 전송하는 부분이랑 받는 부분이 분리되서 메시지를 안보내도 전송받을 수 있다.
			sc = new Scanner(System.in);
			pw = new PrintWriter(server.getOutputStream());
			ClientWorker worker = new ClientWorker(server);
			while(true) {
				System.out.println("메세지 입력 >>> ");
				String str = sc.nextLine();
				pw.println(str);
				pw.flush();
				if(str.equals("exit")) break;
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
			if(pw != null) pw.close();
			if(sc != null) sc.close();
			if(server != null) server.close();
			} catch ( IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
