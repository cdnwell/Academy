package random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextDouble());	//0.0 ~ 0.99999999... 범위에서 랜덤
		System.out.println(r.nextInt());	//int형 범위에서 랜덤
		System.out.println(r.nextInt(10));	//0~9까지 랜덤
		//36~97까지의 숫자를 랜덤하게 뽑기
		
		//방정식(최소값~최대값) : random
		//r.nextInt((최대값 +1 -최소값) + 최소값)
		//97-36 구하기
		System.out.println();
		System.out.println(r.nextInt(62)+36);
		
		
		
	}

}
