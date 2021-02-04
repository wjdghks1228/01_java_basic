package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */

//2021_01_15 20:38 ~ 20:41
public class IfEx06_문제 {

	public static void main(String[] args) {
		System.out.println("구구단 게임 시작");
		Scanner scan = new Scanner(System.in);
		int firstNum = scan.nextInt();
		System.out.println("*");
		int secondNum = scan.nextInt();
		
		int result = firstNum * secondNum;
		
		System.out.print("답을 입력하세요 : ");
		int myResult = scan.nextInt();
		
		if(myResult == result ) {
			System.out.println("정답");
		}
		if(myResult != result) {
			System.out.println("땡");
		}
		
		scan.close();
	}

}
