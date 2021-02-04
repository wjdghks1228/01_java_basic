package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx02_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 문제1) 숫자 2개를 입력받아서 합 출력
		System.out.println("문제1 : 두 숫자의 합 출력");
		System.out.print("숫자1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자2 입력 : ");
		int num2 = scan.nextInt();

		int sum = num1 + num2;
		System.out.println("입력하신 두 숫자의 합은 : " + sum);

		// 문제2) 숫자 1개를 입력받아서 , 홀수이면 true 출력
		System.out.println();
		System.out.println("문제2 : 홀수인가 ?");
		System.out.print("숫자 입력하세요	");
		int num3 = scan.nextInt();
		System.out.println(num3 % 2 == 1);

		// 문제3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		System.out.println();
		System.out.println("문제3 : 성적을 입력하세요");
		int score = scan.nextInt();
		System.out.println(score >= 60 && score <= 100);
		
		scan.close();
	}
	
}
