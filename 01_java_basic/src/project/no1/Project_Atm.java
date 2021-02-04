package project.no1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Project_Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner intScan = new Scanner(System.in);
		Scanner charScan = new Scanner(System.in);
		
		
		int size = 5;
		int count = 0;
		int log = -1; // 메모리의 주소 :
		// log == -1 하는건 메모리 주소 없다는 뜻 --> 로그아웃
		// 로그 --> 1줄 의미 (한 셋트 )
		// momk/1111/20000 log = 0
		// megait/2222/30000 log = 1
		// github/3333/40000 log = 2
		
		String[] ids = new String[size];
		String[] pws = new String[size];
		int[] moneys = new int[size];
		String fileName = "atm.txt";
		
		//파일 생성
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
		}catch(Exception e) {
			System.out.println("파일생성 오류");
			return;
		}
		
		
		while (true) {
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			int sel = intScan.nextInt();
			
			//회원 가입
			if (sel == 1) {
				int personIndex = 0 ;
				System.out.println("회원 가입을 시작하겠습니다");
				System.out.print("ID를 입력하세요 : ");
				String inputId = charScan.nextLine();
				ids[personIndex] += inputId ; 
				
				
				System.out.print("PW를 입력하세요 : ");
				String inputPw = charScan.nextLine();
				pws[personIndex] += inputPw ; 
				
				System.out.println("현재 잔고를 입력하세요 : ");
				int inputMoneys = intScan.nextInt();
				moneys[personIndex] += inputMoneys ; 
				
				String data = "";
				
				
			} else if (sel == 2) {
			} else if (sel == 3) {
			} else if (sel == 4) {
			} else if (sel == 5) {
			} else if (sel == 6) {
			} else if (sel == 7) {
			} else if (sel == 8) {
			} else if (sel == 9) {
			} else if (sel == 10) {
			} else if (sel == 0) {
				break;
			}
		}
	}

}
