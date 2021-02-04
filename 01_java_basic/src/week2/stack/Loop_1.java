package week2.stack;

import java.util.Scanner;

public class Loop_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 반복문 횟수를 아는 반복문 : 처음에 시작할값 처음에 시작할 값 조건식이 true 일 때만 실행 된다.
		 * 
		 * 횟수를 모르는 반복문
		 */
		// 문제1) 1~10까지 반복해 5~9 출력
		// 정답1) 5, 6, 7, 8, 9
		int num = 0;
		while (num < 10) {
			if (num >= 5) {
				System.out.print(num + " ");
			}
			num++;
		}
		System.out.println();
		// 문제2) 10~1까지 반복해 6~3 거꾸로 출력
		// 정답2) 6, 5, 4, 3
		int num2 = 10;
		while (num2 >= 0) {
			if (num2 <= 6 && num2 >= 3) {
				System.out.print(num2 + " ");
			}
			num2--;
		}
		System.out.println();

		// 문제3) 1~10까지 반복해 짝수만 출력
		// 정답3) 2, 4, 6, 8, 10
		int num3 = 1;
		while (num3 <= 10) {
			if (num3 % 2 == 0) {
				System.out.print(num3 + " ");
			}
			num3++;
		}
		System.out.println();
		// 문제4) 1~5까지의 합 출력
		// 정답 4) 15
		int num4 = 0;
		int sum = 0;
		while (num4 <= 5) {
			sum = sum + num4;
			num4++;
		}
		System.out.print(sum + " ");
		System.out.println();

		// 문제5) 1~10까지 반복해 3미만 7이상만 출력
		// 정답5) 1, 2, 7, 8, 9, 10
		int num5 = 0;
		while (num5 <= 10) {
			if (num5 < 3) {
				System.out.print(num5 + " ");
			}
			if (num5 >= 7) {
				System.out.print(num5 + " ");
			}
			num5++;
		}
		System.out.println();

		// 문제6) 문제2의 조건에 맞는 수들의 합 출력
		// 정답6) 37
		int num6 = 10;
		int sum2 = 0;
		while (num6 >= 0) {
			if (num6 >= 3 && num6 <= 6) {
				sum2 = sum2 + num6;
			}
			num6--;
		}
		System.out.println(sum2);
		// 문제7) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답7) 6
		int num7 = 10;
		int count = 0;
		while (num7 > 0) {
			if (num7 <= 6 && num7 >= 3) {
				count++;
			}
			num7--;
		}
		System.out.println(count + "개");
		System.out.println("문제 8 ");
		/*# 소수찾기[1단계]
				 * 1. 소수란, 1과 자기자신으로만 나눠지는 수
				 * 2. 예) 2, 3, 5, 7, 11, 13, ..
				 * 3. 힌트
				 * 1) 해당 숫자를 1부터 자기자신까지 나눈다.
				 * 2) 나머지가 0일 때마다 카운트를 센다.
				 * 3) 그 카운트 값이 2이면 소수이다.
				 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	소수x
				 * 
				 * 정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
		
				 */
		
		Scanner sc = new Scanner(System.in);
		int me = sc.nextInt();
		int cnt =0;
		int find =1;
		while(find <= me) {
			if(me%find == 0) {
				cnt++;
			}
			find++;
		}
		if(cnt==2) {
			System.out.println("소수");
		}
		else {
			System.out.println("소수아님");
		}
		
	}

}
