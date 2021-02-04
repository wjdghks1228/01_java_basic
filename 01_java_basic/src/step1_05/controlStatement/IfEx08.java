package step1_05.controlStatement;

import java.util.Scanner;

public class IfEx08 {

	/*
	 * 
	 * # 중첩 if 문
	 * 
	 * 	- if문 안의 명령어에 또 if문이 중첩으로 들어간 형태
	 * 
	 * */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("#성적입력 : ");
		
		int getGrade = scan.nextInt();
		
		if( getGrade >= 60) {
			if( getGrade == 100) {  //             *****들여쓰기 매우 중요 ******
				System.out.println("만점");
			}
			System.out.println("합격");
		}
		if( getGrade < 60) {
			System.out.println("불합격");
		}
		
		scan.close();
		
	}

}
