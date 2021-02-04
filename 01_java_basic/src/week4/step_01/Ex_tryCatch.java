package week4.step_01;

import java.util.Scanner;

public class Ex_tryCatch {
	//2021_01_20 수3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try-catch : 예외처리 
		// 프로그램이 어떠한 ERROR 때문에 갑자기 중도멈춤 하는것을 방지하는 것
		// 프로그램이 강제 종료 되는것을 방지해준다.
		
		
		int num =0 ;
		Scanner scan = new Scanner(System.in);
		
		
		try {
			System.out.println("나누고 싶은 값을 입력 : ");
			int div = scan.nextInt();
			
			System.out.println("테슽트1");
			System.out.println("테슽트2");
			num = num/div;  //에러 발생부분 : execption 0으로 나눌수 없음
			System.out.println(num);//에러발생하면 그 밑의 부분은 실행하지 않는다.
			
			
		}catch(Exception e) { //catch 괄호 안에는 발생하는 에러와 같은 클래스를 입력해주어야
			System.out.println("0으로 나눌수 없습니다");
			num = 0;
							// 그 같은 클래스 안의 에러만 잡을 수 있다.
		}
		
		System.out.println("try - catch : 실행되었음");
		System.out.println("num = "+ num);
			
	}

}
