package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterMain01 {

	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			//저장할 파일 경로
			//쓰기용으로 파일을 열면 매번 새로 생성
			//다른 언어도 마찬가지로 쓰기용으로 열면 매번 새로 생성한다.
			//추가 모드로 열었는데 파일이 없으면 새로 만들어준다.
			//단 파일이 이쓰면 출력할 맨 끝으로 커서를 옮긴다.
			fw = new FileWriter("hello.txt",true);//try catch를 안잡으면 안된다. 
			//FileWriter에서 exception을 잡아놓음]
			pw = new PrintWriter(fw);
			
			pw.println("안녕하세요");
			pw.println("Hello World");
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {//close 할때는 만들어진 역순으로 pw.close->fw.close
				if(pw != null) pw.close();
				if(fw != null) fw.close();//fw != null은 무조건 들어간다
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
