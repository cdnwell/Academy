package echoservermain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClientMain {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br =null;
		PrintWriter pw = null;
		Scanner sc = null;
		
		try {
			server = new Socket("127.0.0.1",1234);
			
			pw = new PrintWriter(server.getOutputStream());
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("메시지 입력 > ");
				String str = sc.nextLine();
				pw.println(str);//서버로 전송
				pw.flush();
				if(str.equals("exit")) break;
				str = br.readLine();
				System.out.println(str);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (pw != null)
					pw.close();
				if (sc != null)
					sc.close();
				if (server != null)
					server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		
	}

}
