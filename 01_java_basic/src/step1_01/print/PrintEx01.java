package step1_01.print;  // 1) 패키지 선언문은 '항상' 첫줄에 시작한다.

import java.util.Scanner;
// 2) 주석 (comment) : 설명문을 작성하기 위한 방법으로 프로그램의 실행에 영향을 미치지 않는다.
// 2 -1) 라인주석 : 한줄 주석
/*
 * 2 -2) 블록주석 : 여러줄 주석 
 *       -> 000책임이 000부장의 지시를 받아서 
 *       ~~코드를 ~~이렇게 수정하였음.
 *
 **/
/* 3) 에디터 화면 확대 및 축소 : ctrl + [+}, ctrl + [-]
 * 4) 뒤로가기 (redo) : ctrl + z
 * 	  앞으로가기 (undo) : strl + y
 * 5) 저장 : ctrl + s , 저장하지 않았을경우 파일 앞에 *붙음. (저장하는 습관을 들 것)
 * 6) 출력문 자동완성
 * 			6-1)sout + ctrl space
 * 			6-2)sysout + ctrl space
 * 7) 유용한 단축키
 * 		7-1) 복사 : ctrl + alt + 위 or 아래
 * 		7-2) 이동 : alt +위 or 아래
 *  	7-3) 블록잡기 : shift + 위 or 아래
 *  	7-4) 삭제 : ctrl + d
 *  	
 * */


public class PrintEx01 {

	public static void main(String[] args) {  			//main함수의 {}안에서 프로그래밍을 한다.
		// TODO Auto-generated method stub
		//tab으로 들여쓰기 이후 코드를 작성
		System.out.println("=============");  //println : 자동 줄바꿈 기능
		System.out.println(" 메뉴 선택 ");
		System.out.println("=============");
		System.out.println("1) 로그인 (login)");
		System.out.println("2) 로그아웃 (logout)");
		System.out.println("3) 종료 (exit)");

		System.out.println(); //아무내용 없으면 줄바꿈 기능만 적용(한줄 띄기)
		System.out.println();
		System.out.println();
		
		System.out.print("출력문 1"); //print : 줄바꿈 기능이 없다.
		System.out.print("출력문 2");
		System.out.print("출력문 3");
		System.out.print("\n");
		System.out.println("-- end --");
	}
}