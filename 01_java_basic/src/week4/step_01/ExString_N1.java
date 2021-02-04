package week4.step_01;

import java.util.Scanner;

public class ExString_N1 {
	//2021_04_19 : java방특
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자에게 이름과 주민번호를 입력 받으세요 
		//사용자의 주민번호를 통해서 나이를 계산해서 
		//만나이를 출력
		//사용자가 여자인지 남자인지 주민등록 뒷번호를 통해서 출력
		//EX ) 박연미 19901210 - 2123456
		//나이계산
		//박연미 님은 30세 여자입니다.
		
		Scanner charScan = new Scanner(System.in);
		
		System.out.println("이름과 주민번호를 입력하세요 : ");
		String name = charScan.nextLine();
		String number = charScan.nextLine();
		
		String year = "" ;
		for(int i=0;i<4;i++) {
			year += number.charAt(i);
		}
		
		int age =2021 - Integer.parseInt(year);
		
		char sex = number.charAt(9);
		char gender ;
		if(sex == '1' || sex == '3') {
			 gender = '남';
		}
		else {
			 gender = '여';
		}
		
		System.out.println(name + " 님은 "+ age+"세 "+ gender + " 입니다.");
		
		
		
		/*
		//문자를 숫자로
		
		String age = "30";
		int testAge = Integer.parseInt(age);
		System.out.println(testAge);
		
		//숫자를 문자로
		 * int age2 = 35;
		 * String age3 = age3 + "";
		*/
		
	}

}
