package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */

// 2021_01_15  20:10 ~ 20:13
public class IfEx04_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int dbId = 1234;
		int dbPw = 1111;

		// ID입력
		System.out.print("ID 를 입력하세요 : ");
		int inputId = scan.nextInt();
		if (inputId != dbId) {
			System.out.print("로그인 실패  --->   ");
			System.out.println("아이디를 잘못 입력하셨습니다.");
		}

		// PW입력
		System.out.print("PW 를 입력하세요 : ");
		int inputPw = scan.nextInt();
		if (inputPw != dbPw) {
			System.out.print("로그인 실패  --->   ");
			System.out.println("비밀번호를 잘못 입력하셨습니다.");
		}

		// 최종 로그인 여부 확인
		if ((inputPw == dbPw) && (inputId == dbId)) {
			System.out.println("로그인 성공!");
		}

		scan.close();

	}

}
