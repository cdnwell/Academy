import java.util.Scanner;

public class SwitchQuest {
	/* 
	 * 
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
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		switch(score / 10) {
		case 10:
		case 9:
			System.out.println("A 등급입니다.");
		break;
		case 8:
			System.out.println("B 등급입니다.");
		break;
		case 7:
			System.out.println("C 등급입니다.");
		break;
		case 6:
			System.out.println("D 등급입니다.");
		break;
		default:
			System.out.println("F 등급입니다.");
		}
		// case 뒤의 숫자 중복 안된다.
	}

}
