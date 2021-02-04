package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */

//2021_01_19 19:39~19:41
public class IfEx12_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//숫자 3개를 입력받기
		System.out.println("첫 숫자 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println("둘째 숫자 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.println("셋째 숫자 입력하세요 : ");
		int num3 = scan.nextInt();
		
		int Max = -100000;
		
		if( num1 >= num2) {
			Max = num1;
			if( num1 >= num3) {
				Max = num1;
				System.out.println("최대값은 : "+Max);
			}
			if( num1 <= num3) {
				Max = num3;
				System.out.println("최대값은 : "+Max);
			}
		}
		if( num1 <= num2) {
			Max = num2;
			if(num2 >= num3) {
				Max = num2;
				System.out.println("최대값은 : "+Max);
			}
			if(num2 <= num3) {
				Max = num3;
				System.out.println("최대값은 : "+Max);
			}
		}

		scan.close();
	}

}
