package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int lotto = ran.nextInt(3)+1;
		if( lotto == 1) {
			System.out.println("당첨");
		}
		if( lotto ==2 || lotto ==3) {
			System.out.println("꽝");
		}
		
		scan.close();
		
	}

}
