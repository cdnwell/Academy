package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket client = null;
		PrintWriter pw = null;
		BufferedReader br =null;
		Scanner sc = null;
		
		try {
			client = new Socket("127.0.0.1",5000);
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			sc = new Scanner(System.in);
			
			System.out.print("구매할 로또번호 개수 입력 : ");
			int num = sc.nextInt();
			pw.println(num);
			pw.flush();
			
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			}
			
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(sc != null) sc.close();
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(client != null) client.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
	}

}
