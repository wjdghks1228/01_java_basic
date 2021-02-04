package week3.step_01;

import java.util.Scanner;

public class Ex_00_ATM {
	/*
	 * # ATM[종합]
	 * 1. 로그인
	 * . 로그인 후 재 로그인 불가
	 * . 로그아웃 상태에서만 이용 가능
	 * 2. 로그아웃
	 * . 로그인 후 이용가능
	 * 3. 입금
	 * . 로그인 후 이용가능
	 * 4. 출금
	 * . 로그인 후 이용가능
	 * 5. 이체
	 * . 로그인 후 이용가능
	 * 6. 조회
	 * . 로그인 후 이용가능
	 * 7. 종료
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//account 1
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		//account 2
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		//standard account
		int putId=0;
		int putPw=0;
		int putMoney=0;
		//change variable
		int toId=0;
		int toMoney=0;
		
		int log = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		boolean run = true;
		while(run) {
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(log == -1) {
					System.out.println("id 입력하세요 : ");
					putId = scan.nextInt();
					if(putId != dbAcc1 && putId != dbAcc2) {
						System.out.println("id 입력 오류 입니다.");
						continue;
					}
					else {
						System.out.println("pw 입력하세요 : ");
						putPw = scan.nextInt();
						if(putPw != dbPw1 && putPw != dbPw2) {
							System.out.println("pw 입력 오류입니다.");
						    continue;
						}
						else {
							if(putPw == dbPw1) {
								System.out.println("ACC1 로그인 성공");
								putMoney = dbMoney1;
								log = 1;
							}
							else {
								System.out.println("ACC2 로그인 성공");
								putMoney = dbMoney2;
								log =2;
							}
						}
					}
				}
				else {
					System.out.println("이미 로그인 된 상태입니다.");
				}
			}
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("로그인이 안돼있습니다.");
					continue;
				}
				putId =0;
				putPw =0;
				putMoney=0;
				log = -1;
				System.out.println("로그아웃 완료");
			}
			//입금
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("로그인이 안돼있습니다.");
					continue;
				}
				System.out.println("현재 계좌 : "+ putId);
				System.out.println("현재잔액은 : "+ putMoney);
				System.out.println("입금하실 금액 입력하세요 : ");
				toMoney = scan.nextInt();
				System.out.println("입금전 잔액 : "+putMoney);
				putMoney += toMoney;
				System.out.println("입금후 잔액 : "+putMoney);
			}
			//출금
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("로그인이 안돼있습니다.");
					continue;
				}
				System.out.println("현재 계좌 : "+ putId);
				System.out.println("츨금하실 금액을 입력하세요 : ");
				toMoney = scan.nextInt();
				System.out.println(putId+" 계좌의 출금전 잔액 :"+putMoney);
				putMoney -= toMoney;				
				System.out.println(putId+" 계좌의 출금후 잔액 :"+putMoney);
			}
			//이체
			else if(sel == 5) {
				if(log == -1) {
					System.out.println("로그인이 안돼있습니다.");
					continue;
				}
				System.out.println("입급하실 계좌를 입력하세요 : ");
				
				toId = scan.nextInt();
				
				if(toId != dbAcc1 && toId != dbAcc2) {
					System.out.println("없는 계좌입니다.");
				}
				else {
					System.out.println("현재 계좌 : "+ putId+" 잔액 : "+putMoney);
					System.out.println("보낼 금액을 입력하세요 : ");
					toMoney = scan.nextInt();
					if(toId == dbAcc1) {
						dbMoney1 += toMoney;
						putMoney -= toMoney;
						System.out.println(toId +"님께"+toMoney+"원 이체 완료");
						System.out.println(putId +"님 이체 후 잔액 "+ putMoney);
					}
					else {
						dbMoney2 += toMoney;
						putMoney -= toMoney;
						System.out.println(toId +"님께"+toMoney+"원 이체 완료");
						System.out.println(putId +"님 이체 후 잔액 "+putMoney);
					}
				}
			}
			//조회
			else if(sel == 6) {
				if(log == -1) {
					System.out.println("로그인이 안돼있습니다.");
					continue;
				}
				System.out.println(putId +"님의 잔액은 " + putMoney + "입니다");
				
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}
