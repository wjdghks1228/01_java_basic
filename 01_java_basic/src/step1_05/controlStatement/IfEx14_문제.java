package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

//2021_01_19 20:42~20:45
public class IfEx14_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		System.out.println(coin);
		System.out.println("앞뒤면을 맞춰주세요 (앞면 : 0 // 뒷면 : 1)");
		Scanner scan = new Scanner(System.in);
		int myChoice = scan.nextInt();
		if(myChoice == coin) {
			System.out.println("정답");
		}
		if(myChoice != coin	) {
			System.out.println("땡");
		}

		scan.close();


	}

}
