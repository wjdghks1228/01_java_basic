package week4.step_01;

import java.util.Scanner;

class Calculation{
	double num1;
	double num2;
	double result;

	
	// 매서드는 모두 독립공간이라서 갈색으로 표시된 변수들은 중복이되어도 전부 다른 변수이다.
	// double a, double b  은 4번이나 사용하지만 각각다른변수이다. 
	void plus(double a, double b) {
		double sum = a + b;
		result = sum ;
	}
	
	void minus(double a , double b) {
		double ma = a - b;
		result = ma;
	}
	
	void multiply(double a , double b) {
		double gop = a*b;
		result = gop;
	}
	
	void division(double a , double b) {
		try {
			double div = a / b ;
			result = div;
		}catch(Exception e) {
			System.out.println("오류 발생");
			System.out.println("0으로 나눌수 없습니다.");
			result = 0;
		}

	}
	
	void printResult() {
		System.out.println(result);
	}
}

public class Class_05_Calculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("calculation program start");
		Calculation cal = new Calculation();

		//숫자 입력받기
		System.out.println("숫자 두개를 입력하세요 : ");
		double num1 = scan.nextDouble() ; 
		double num2 = scan.nextDouble() ;
		
		cal.plus(num1, num2);
		cal.printResult();
		
		cal.minus(num1, num2);
		cal.printResult();
		
		cal.multiply(num1, num2);
		cal.printResult();
		
		cal.division(10, 0);
		cal.printResult();
		
		
	}

}
