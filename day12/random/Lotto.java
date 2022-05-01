package random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
//		예시1] 푼것
//		HashSet<Integer> lottoNum= new HashSet<Integer>();
//		Random r = new Random();
		
//		while(lottoNum.size()<6) {
//			lottoNum.add(r.nextInt(45)+1);
//		}
		
//		while(lottoNum.size()!=6) {
//			lottoNum.add(r.nextInt(45)+1);
//		}
		
//		System.out.println(lottoNum);
		
//		예시2]
//		Random r = new Random();
//		
//		
//		HashSet<Integer> set = new HashSet<Integer>();
//		
//		while(set.size()<6) {
//			set.add(r.nextInt(45)+1);
//		}
//		
//		
//		System.out.println(set);
		
		
		Random r = new Random();
		HashSet<Integer> set = new HashSet<Integer>();
		
		ArrayList<HashSet> list = new ArrayList<HashSet>();
		Scanner sc =new Scanner(System.in);
		System.out.print("구매할 로또 개수 : ");
		int num=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<num;i++) {
			
			while(set.size()<6) {
				set.add(r.nextInt(45)+1);
			}
			list.add(set);
		}
		
		System.out.println(list);
		
	}

}
