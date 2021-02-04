package step1_04.inputFunction;

import java.util.Scanner;

/*
 * 
 * # 콘솔에 키보드로 입력받기
 * 
 * [ 순서 중요 ]
 * 
 * 1) import java.util.Scanner;  				// Scanner클래스를 불러온다.
 * 2) Scanner scan = new Scanner(System.in);    // scan 객체를 생성한다.
 * 3) System.out.println("#나이 입력: ");       // 안내문을 작성한다.
 * 4) scan.nextInt();                           // 키보드로 입력받는다.
 * 5) scan.close();								// scan을 다 사용한 코드 뒤에 작성한다.
 * 
 * */

public class InputEx01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int getAge = scan.nextInt(); //숫자 형식만 가능
		
		System.out.println("입력하신 나이는 : " + getAge + "살 입니다.");
		System.out.println("내년 나이는 : " + (getAge+1) + "살 입니다.");
		System.out.println("5년뒤 나이는 : " + (getAge+5) + "살 입니다.");
		
		scan.close();
		
	}

}
