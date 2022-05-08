package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import step02.ServerWorker;

public class ChattingServerMain {
	public static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	// 문제점 어느 클래스에서나 접근 가능해짐
	// private으로 하면 스레드가 직접 접근을 못해 문제

	public static void main(String[] args) {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			server = new ServerSocket(1234);
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + "님이 접속했습니다.");

			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			// 초기화는 다 똑같다 패턴만 숙지하면 됨
			// 게임서버 <- 채팅서버

			while (true) {
				String str = br.readLine();// 메시지를 받는다.
				if (str.equals("exit")) 
					break;
				pw.println(str);// client에게 보내준다.
				pw.flush();
			} // server 데이터 주고받기 끝

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (pw != null)
					pw.close();
				if (server != null)
					server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}