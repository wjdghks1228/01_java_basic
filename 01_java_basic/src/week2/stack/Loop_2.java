package week2.stack;

import java.util.Random;
import java.util.Scanner;

public class Loop_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 무한루프 : 횟수를 모르는 반복문
		 */
		/*
		 * Scanner scan = new Scanner(System.in); while (true) {
		 * System.out.println("입력"); int num = scan.nextInt(); if (num == 100) break; }
		 * System.out.println("반복문 종료");
		 */
		Random rnd = new Random();
		int com = rnd.nextInt(100);
		System.out.println("정답 = "+ com);
		Scanner sc = new Scanner(System.in);
		System.out.println("맞춰보세요");

		while(true) {
			int me = sc.nextInt();
			if(com > me) {
				System.out.println("up");
			}
			else if(com<me) {
				System.out.println("down");
			}
			else if(com == me ) {
				System.out.println("정답");
				break;
			}
			else if(me >100) {
				System.out.println("예외");
			}
		}
	}
}	
