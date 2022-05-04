package quiz;

import java.util.Scanner;

public class StringQuest {

	private static String convertor(char ch) {
		if(ch >= '가' && ch < '까' )
			return "ㄱ";
		else if(ch >= '까' && ch < '나')
			return "ㄲ";
		else if(ch >= '나' && ch < '다')
			return "ㄴ";
		else if(ch >= '다' && ch < '따')
			return "ㄷ";
		else if(ch >= '따' && ch < '라')
			return "ㄸ";
		else if(ch >= '라' && ch < '마')
			return "ㄹ";
		else if(ch >= '마' && ch < '바')
			return "ㅁ";
		else if(ch >= '바' && ch < '빠')
			return "ㅂ";
		else if(ch >= '빠' && ch < '사')
			return "ㅃ";
		else if(ch >= '사' && ch < '싸')
			return "ㅅ";
		else if(ch >= '싸' && ch < '아')
			return "ㅆ";
		else if(ch >= '아' && ch < '자')
			return "ㅇ";
		else if(ch >= '자' && ch < '짜')
			return "ㅈ";
		else if(ch >= '짜' && ch < '차')
			return "ㅉ";
//		else if(ch >= '차' )
//		초성뽑기
		return " " ;
		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		String result = new String();
		
		for(int i=0;i<str.length();i++) {
			result += convertor(str.charAt(0));
		}
		
		System.out.println(result);
		
		char ch = '가';
		System.out.println(Integer.toHexString(ch));
		
	}


}
