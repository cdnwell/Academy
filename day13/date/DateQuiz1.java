package date;

import java.util.Date;

public class DateQuiz1 {

	public static void main(String[] args) {
		
//		Date now=new Date();
//		long nowT=now.getTime();
//		Date day = new Date(122,11,17);
//		1월 : 0
//		long dayT=day.getTime();
//
//		long DdayT=dayT-nowT;
//		
//		DdayT=DdayT/1000/60/60/24;
//		System.out.println("수능까지 남은 일:"+DdayT);
		
//		예시2]
		Date now = new Date();
		System.out.println(now);
		Date start = new Date(122,3,29);
		System.out.println(start);
		Date end = new Date(122,10,17);
		long diff = end.getTime() - start.getTime();
		System.out.println(diff/(1000 * 60 * 60 * 24 ));
		
	}

}
