package week3.step_01;

import java.util.Scanner;

public class Ex_00_Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 영화관 좌석예매
		 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
		 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
		 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
		 * 4. 한 좌석당 예매 가격은 12000원이다.
		 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
		 * 예)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * 좌석선택 : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 이미 예매가 완료된 자리입니다.
		 * ----------------------
		 * 매출액 : 24000원
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("예매 시작");
		System.out.println("몇명 예매하시겠습니까?");
		int person;
		int check=0;
		person = sc.nextInt();
		int seat[]=new int[7];
		//처음 좌석 0으로 초기화
		for(int i=0;i<seat.length;i++) {
			seat[i]=0;
		}
		for(int k=0;k<seat.length;k++) {
			if(seat[k]==1) {
				check++;
			}
		}
		if(check==7) {
			System.out.println("매진");
		}
		int pay=0;
		for(int i=0; i<person;i++) {
		System.out.println("예매할 좌석을 선택하세요 : ");
		int choose = sc.nextInt();
		if(seat[choose]==1)	{
			System.out.println("이미 예매된 자석입니다.");
			i--;
			continue;
		}
		else {
		seat[choose]=1;
		}

		}
		for(int i=0; i<seat.length;i++) {
			if(seat[i]==1) {
				pay+=12000;
			}
		}
		System.out.println("총 요금은 "+pay+"입니다.");

	}

}
