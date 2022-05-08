package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerMain {
	private static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	private static class ServerWorker extends Thread {
		private Socket client;
		private BufferedReader br;
		private PrintWriter pw;

		public ServerWorker(Socket client) {
			this.client = client;

			try {
				pw = new PrintWriter(client.getOutputStream());
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {

			try {
				while (true) {
					String str = br.readLine();
					if(str == null || str.equals("exit")) break;
//					if(str.eqauls("exit") || str == null) 강제종료했을때 
//					nullpointexception 에러가 난다. 널부터 체크해 줘야 됨 
//					단락회로의 영향도 있다.
					broadCasting(client.getInetAddress() + "님의 메세지 : " + str);
					//thread내에 만들면 안됨 list가 outter에 있어서
					//구조상 겉에 있는 것은 겉에서 건들기
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				list.remove(this);
				System.out.println(client.getInetAddress() + "님이 접속종료하셨습니다.");
				broadCasting(client.getInetAddress() + "님이 접속종료하셨습니다.");
				try {
					if(br != null) br.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		//담당하는 클라이언트에게만 메세지를 보낸다.
		public void sendMessage(String msg) {
			pw.println(msg);
			pw.flush();
			//내가 연결하고 있는 사람에게만 메세지를 보낸다.
		}//추가된 부분 1]

	}

	public static void broadCasting(String msg) {
		//sendMessage를 호출해 준다.
		for(int i=0;i<list.size();i++) {
			list.get(i).sendMessage(msg);
			//모든 클라이언트에게 메시지를 보낸다.
		}
	}//추가된 부분 2]
	
	public static void main(String[] args) {
		ServerSocket server = null;

		try {
			server = new ServerSocket(1234);

			while (true) {
				Socket client = server.accept();
				ServerWorker worker = new ServerWorker(client);
				worker.start();
				list.add(worker);
				System.out.println(client.getInetAddress() + "님이 접속하셨습니다.");
				// 똑같은 사용자가 접속하면 어떻게 해결하는지
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
