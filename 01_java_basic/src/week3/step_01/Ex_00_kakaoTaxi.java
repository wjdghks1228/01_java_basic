package week3.step_01;

import java.util.Random;
import java.util.Scanner;

public class Ex_00_kakaoTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("목적지 설정");
		int rndXnum = rnd.nextInt(10) - 10;
		int rndYnum = rnd.nextInt(10) - 10;
		System.out.println("목적지 좌표 (" + rndXnum + "," + rndYnum + ")");
		int speed;
		int goTo;
		int move;
		int pay = 0;
		int startX = 0;
		int startY = 0;
		while (true) {
			if (startX == rndXnum && startY == rndYnum) {
				System.out.println("도착 !");
				System.out.println("지불하실 금액은 = " + pay + "원 입니다!");
				break;
			}
			System.out.println("목적지 (" + rndXnum + "," + rndYnum + ")");
			System.out.println("현재위치 (" + startX + "," + startY + ")");
			System.out.println();
			System.out.println("갈 방향을 입력하세요 : 1:동 2:서 3:남 4:북");
			goTo = sc.nextInt();
			System.out.println("이동할 속도를 입력하세요");
			speed = sc.nextInt();
			System.out.println();
			if (speed < -1 || speed > 3) {
				System.out.println("지정속도 위반");
				continue;
			}
			if (goTo == 1) {
				startX += speed;
			} else if (goTo == 2) {
				startX -= speed;
			} else if (goTo == 3) {
				startY -= speed;
			} else if (goTo == 4) {
				startY += speed;
			}
			pay += (50 * speed);
		}
	}
}
