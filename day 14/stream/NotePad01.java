package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotePad01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("파일명 입력하세요 : ");
		String fileName = sc.nextLine();
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter(fileName,true);
			pw = new PrintWriter(fw);

//			while (true) {
//				String str = sc.nextLine();
//				if(str.equals("exit"))
//					break;
//				pw.println(str);
//			}
			
			
//			예제 2]
//			String str = "";
//			
//			while( !(str = sc.nextLine()).equals("exit")) {
//				pw.println(str);
//				pw.flush();
//			}
			
			
			while(true) {
				String str = sc.nextLine();	//내용 입력
				if(str.equals("exit"))	break;//return;가능	//exit 입력 체크
				pw.println(str);	//파일 출력
				pw.flush();
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {// return으로 끊어도 finally 영역이 실행된다.
			try {
			if(pw != null) pw.close();
			if(fw != null) fw.close();
			} catch( IOException e) {
				e.printStackTrace();
			}
		}
	}

}
