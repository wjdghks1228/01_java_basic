package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */

//2021_02_02 TIME -> 20:28 ~ 
public class LoopEx23_문제 {

	public static void main(String[] args) {
		System.out.println("정수 하나를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int myNum = scan.nextInt();
		
		for(int i = 0 ; i <= myNum ; i++) {
			int count = 0;
			for ( int j = 0; j < i ; j++) {
				if( i % j == 0) {
					count ++;
				}
				if(count == 2) {
					System.out.println(i);
				}
			}
		}
		scan.close();
	}
	
}
