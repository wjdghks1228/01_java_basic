package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # Up & Down 게임[1단계]
 * 
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. 다음과 같은 메세지를 출력한다.
 * 1) me < com	: Up!
 * 2) me == com : Bingo!
 * 3) me > com  : Down!
 */

//2021_01_15 20:00~20:02
public class IfEx02_문제 {

	public static void main(String[] args) {
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.print("숫자를 입력 하세요 : ");
		Scanner scan = new Scanner(System.in);
		int com = 8;
		int me = scan.nextInt();
		if(me == com) {
			System.out.println("Bingo!");
		}
		if(me > com) {
			System.out.println("Down!");
		}
		if(me <com) {
			System.out.println("Up!");
		}
		
		scan.close();
		
		
	}

}
