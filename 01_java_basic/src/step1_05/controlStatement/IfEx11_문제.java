package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */

//2021_01_19 19:30~19:36
public class IfEx11_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		//메뉴판 출력
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우   버거 : " + price2 + "원");
		System.out.println("3.콜       라 : " + price3 + "원");
		
		//주문하고자 하는 번호 입력
		System.out.print("주문하고자 하는 번호를 입력하세요 : ");
		int number = scan.nextInt();
		//현금 제출

		
		if(number == 1) {
			System.out.println("불고기 버거를 고르셨네요");
			System.out.print("값을 지불해 주세요 : ");
			int money = scan.nextInt();
			if(money == price1) {
				System.out.println("잔돈 0 원 입니다");
			}
			if(money > price1) {
				System.out.println("잔돈은 "+(money - price1)+" 입니다");
			}
			if(money < price1) {
				System.out.println("현금이 부족합니다!");
			}
		}
		if(number == 2) {
			System.out.println("새우 버거를 고르셨네요");
			System.out.print("값을 지불해 주세요 : ");
			int money = scan.nextInt();
			if(money == price2) {
				System.out.println("잔돈 0 원 입니다");
			}
			if(money > price2) {
				System.out.println("잔돈은 "+(money - price2)+" 입니다");
			}
			if(money < price2) {
				System.out.println("현금이 부족합니다!");
			}
		}
		if(number == 3) {
			System.out.println("콜라를 고르셨네요");
			System.out.print("값을 지불해 주세요 : ");
			int money = scan.nextInt();
			if(money == price3) {
				System.out.println("잔돈 0 원 입니다");
			}
			if(money > price3) {
				System.out.println("잔돈은 "+(money - price3)+" 입니다");
			}
			if(money < price3) {
				System.out.println("현금이 부족합니다!");
			}
		}
		scan.close();
	}

}
