package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */

//2021_01_15 20:34 ~ 20:37
public class IfEx05_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0 ;
		int dbPw = 0;
		
		//회원가입
		System.out.println("회원가입을 시작하겠습니다.");
		System.out.print("ID 를 입력하세요 : ");
		int myId = scan.nextInt();
		dbId = myId ;
		System.out.print("PW 를 입력하세요 : ");
		int myPw = scan.nextInt();
		dbPw = myPw;
		
		System.out.println("로그인 하실 ID를 입력하세요");
		int inputId = scan.nextInt();
		System.out.println("PW를 입력하세요");
		int inputPw = scan.nextInt();
		
		if((inputId == myId)&&(inputPw == myPw)) {
			System.out.println("로그인 성공!");
		}
				
		
		
		
		
		scan.close();
	}

}
