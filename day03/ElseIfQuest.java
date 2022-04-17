import java.util.Scanner;

public class ElseIfQuest {
	/* 
	 * 점수 하나를 입력 받아서
	 * 100~90 A
	 *  89~80 B
	 *  79~70 C
	 *  69~60 D
	 *  59- 0 F
	 *  성적등급을 출력
	 *  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		char grade = 'F';
		
		System.out.print("점수를 입력해 주세요 : ");
		score = sc.nextInt();
		
		if(score > 89) {
			grade = 'A';
		}else if (score > 79) {
			grade = 'B';
		}else if (score > 69) {
			grade = 'C';
		}else if (score > 59) {
			grade = 'D';
		}
		System.out.println(grade + "등급 입니다.");
		
	}

}
