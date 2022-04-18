import java.util.Scanner;

public class Quest02 {
	/*
	 * 	영화 평점 1~5까지의 정수를 받은 후
	 * 	입력 받은 평점 만큼 ★을 출력하시오.
	 * 	평점 및 별 출력 후 프로그램이 종료
	 * 
	 * 	ex)
	 *  이번 영화의 평점을 입력 하세요 : 3
	 *  평점 : ★★★
	 * 
	 * 	두번째 예시)
	 *  다시 입력하기
	 *  
	 *  이번 영화의 평점을 입력 하세요 : 6
	 *  평점은 1~5 사이만 입력할 수 있습니다.
	 *  
	 *  이번 영화의 평점을 입력 하세요 : 3
	 *  평점 : ★★★
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
//		String strScore="평점 : ";
//		String star="★";
//		String temp="";
		
		for(;;) {
			System.out.print("이번 영화의 평점을 입력하세요 : ");
			score = sc.nextInt();
			if(score>=1 && score<=5) {
				System.out.print("평점 : ");
				for(int i=1;i<=score;i++) {
					System.out.print("★");
				}
				break;
			}else {
				System.out.println("평점은 1~5 사이만 입력할 수 있습니다.");
			}
			//else는 안써도 된다. break문 떄문.
		}
		
		
		
	}

}

// 두번째 예시
//		for(;;) {
//			System.out.print("이번 영화의 평점을 입력하세요 : ");
//			score = sc.nextInt();
//			if(score>=1 && score<=5) {
//				for(int i=1;i<=score;i++) {
//					temp +=star;
//				}
//				System.out.println(strScore+temp);
//				break;
//			}else {
//				System.out.println("평점은 1~5 사이만 입력할 수 있습니다.");
//			}
//			
//		}

/*	세번째  예시
* 	while(true){
* 		System.out.print("이번 영화의 평점을 입력하세요 : ");
* 		int star - sc.nextInt();
* 		if(star > 5 || star < 1){
* 			System.out.println("평점은 1~5 사이만 입력할 수 있습니다.");
* 			continue;
* 		}
* 		System.out.print("평점 : ");
* 
* 		switch(star) {
* 		case 5:
* 			System.out.print("★");
* 		case 4:
* 			System.out.print("★");
* 		case 3:
* 			System.out.print("★");
* 		case 2:
* 			System.out.print("★");
* 		case 1:
* 			System.out.print("★");
* 
* 		}
* 
* 		break;
* 	}
*/

