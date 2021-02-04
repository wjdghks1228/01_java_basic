package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

//2021_01_29 	TIME  19 : 39 ~ 19 : 43
public class LoopEx14_문제 {

	public static void main(String[] args) {
		int first = 0;
		int second = 0;
		int third = 0;
		
		int running = 0;
		int max = -1000;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		boolean isRun = true;
		while(isRun) {
			if(running == 3 ) {
				isRun = false;
			}
			if(running == 0 ) {
				System.out.println("첫 숫자 입력");
				first = scan.nextInt();
				running ++;
			}
			else if(running == 1) {
				System.out.println("두 번째 숫자 입력");
				second = scan.nextInt();
				running++;
			}
			else if(running == 2) {
				System.out.println("세 번째 숫자 입력");
				third = scan.nextInt();
				running++;
				if(first > max) {
					max = first;
					count = 1;
				}
				if(second > max) {
					max = second;
					count = 2;
				}
				if(third > max) {
					max = third;
					count = 3;
				}
				
				System.out.println("최대값은 " + count + "번째 입력하신 " + max + "입니다.");
			}
		}
	}
}

