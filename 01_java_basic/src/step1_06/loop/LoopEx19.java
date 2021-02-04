package step1_06.loop;

import java.util.Scanner;
/*
 * # do while문
 * 
 * [ 형식 ]
 * 
 * do {
 * 	   반복할 명령어;
 * } while ( 조건식 );
 * 
 * 
 * 1. while문과 do~while문의 차이점은 반복 조건의 '검사시점'이다.
 * 		( while    : 반복 조건식을 먼저 검사 )
 * 		( do~while : 일단 한번 실행한 후 반복조건을 검사 )
 * 
 * 2. while문 조건식 뒤에 ;을 잊지 않고 반드시 써주어야 한다.
 *  
 * */
public class LoopEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		//while문의 예시_한계
		int num = 0;
		while ( num > 0 && num < 4 ) {
			//1,2,3 일때만 while 문 동작
			System.out.println("# 숫자 입력 : 1 ~ 3 ");
			num = scan.nextInt();
		} //조건이 맞지않으면 while 문이 실행이 안됨
		
		//do-while 문
		do {
			System.out.println("# 숫자 입력 : 1 ~ 3 ");
			num = scan.nextInt();
		}while( num > 0 &&  num < 4 );
		
		
		scan.close();

	}
}
