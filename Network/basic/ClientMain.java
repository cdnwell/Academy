package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		//1. Server Connect - IP Address, port
		try {
			server = new Socket("127.0.0.1",1234);
		// localhost 정해진 ip 주소 값, 포트 번호
		//2. Stream Init
			pw = new PrintWriter(server.getOutputStream());
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			//이전과 똑같음
		//3. Data Send/Receive
			pw.println("Hello"); //서버에서 먼저 읽어들이고 있음, 먼저 전송
			pw.flush();
			String str = br.readLine();
			System.out.println(str); //서버로 데이터를 전송하고 받았다
			//client와 server가 이부분이 거꾸로 됨
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//4. Close
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(server != null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//서버 먼저 실행 -> 클라이언트 실행
	}

}
