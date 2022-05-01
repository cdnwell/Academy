package date;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		System.out.println(now.getTime());
		//정수 밀리초단위
		Date start=new Date(1);
		System.out.println(start);
		Date date = new Date(20,1,1);
		//2월이 나오는 이유는 월은 0부터 시작 , 0-1월 1-2월
		//1920.1.1
		Date date0 = new Date(120,1,1);
		System.out.println(date);
		System.out.println(date0);
		System.out.println(date.getTime());
		Date date1=new Date(120,11,31);
		System.out.println(date1);;
		
	}

}
