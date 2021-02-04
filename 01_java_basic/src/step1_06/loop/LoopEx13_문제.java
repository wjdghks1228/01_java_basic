package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수찾기[1단계]
 * 
 * 1. 소수란, 1과 자기자신으로만 나눠지는 수
 * 2. 예) 2, 3, 5, 7, 11, 13, ..
 * 3. 힌트
 * 1) 해당 숫자를 1부터 자기자신까지 나눈다.
 * 2) 나머지가 0일 때마다 카운트를 센다.
 * 3) 그 카운트 값이 2이면 소수이다.
 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	소수x
 * 
 * 정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
 * 
 */

//2021_01_29 TIME 19 : 28 ~ 19 : 34
public class LoopEx13_문제 {

	public static void main(String[] args) {
		System.out.println("정수입력");
		Scanner scan = new Scanner(System.in);
		int myNum = scan.nextInt();
		
		int divNum = 1;
		int count = 0;
		boolean isRun = true;
		while(isRun) {
			if(divNum == myNum + 1	) {
				isRun = false;
			}
			if( myNum % divNum == 0	) {
				count++;
			}
			divNum++;
		}
		if(count==2) {
			System.out.println("소수");
		}
		else {
			System.out.println("소수 아님");
		}
	}

}
