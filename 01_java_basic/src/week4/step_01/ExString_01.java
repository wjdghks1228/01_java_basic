package week4.step_01;

import java.util.Scanner;

public class ExString_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 scanner
		Scanner intScan = new Scanner(System.in);
		// 문자 scanner
		Scanner charScan = new Scanner(System.in);
		
		//문자열은 배열이랑 똑같다
		//class : 공장이다. : 안에 여러 기능이 있다.
		//String : 대문자로 시작 -> class다 (기본타입 자료형 아님 X)
		//string main안에 import 되어있기 때문에 class 지만 import 해줄 필요가 없다.
		String test = "hello";
		//char [] test = {'h','e','l','l','o','\0'};
		System.out.println(test);
		System.out.print("숫자를 입력하세요 : ");
		int num = intScan.nextInt();
		System.out.println("num = " + num);
		
		System.out.println();
		
		System.out.print("이름을 입력하세요 : ");
		String name = charScan.nextLine();
		// String -> next  nextLine
		//next : 첫번째 띄어쓰기 값만 가져옴
		//nextLine : 전부다 가져옴
		System.out.println("name = "+name);
		
		intScan.close();
		charScan.close();
	}

}
