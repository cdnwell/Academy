package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		//노드 스트림 자동 만들어짐,  프로세스 스트림만 만듦
		BufferedReader br = null;
		PrintWriter pw =null;
		
		try {
			//1 .Server Open
			//매개변수 = 포트 번호
			//중복된 포트 번호 = 실행 x ,먼저 잡는 서버만 열림
			//포트번호 되도록이면 1000번대 이후로 잡기
			//1000번대 이하로 잡으면 생기는 문제 : 시스템이 할당하는 번호->오류
			server = new ServerSocket(1234);
			
			//2. Client Accept
			Socket client = server.accept();	//클라이언트의 정보 저장
			//클라이언트도 이부분만 다르고 같음
			//3. Stream Init , 클라이언트랑 통신해야하니 클라이언트와 연결
			pw = new PrintWriter(client.getOutputStream());	
			//통로하나 방향 한쪽, 클라이언트에서는 인풋스트림 서버에서는 아웃풋스트림
			//클라이언트에서 읽음
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			// 이부분이 불편하다
			
			//4. Data Send/Receive
			String str = br.readLine();
			System.out.println(str);
			pw.println("서버에서 보낸 메세지");
			pw.flush();
			//여는 것이 있으면 닫는 것이 있음
			//data 스트림과 같다. 1,2번만 뺴면
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//5. Close(finally에서 진행)
			try {
			if(br!=null) br.close();
			if(pw!=null) pw.close();
			if(server!=null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
