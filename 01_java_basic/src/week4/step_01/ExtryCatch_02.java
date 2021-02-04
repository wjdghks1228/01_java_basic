package week4.step_01;

import java.util.Scanner;

public class ExtryCatch_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 30, 40, 50 };
		Scanner scan = new Scanner(System.in);
		

		System.out.println("arr == ");
		String ten = "10";
		String bak = "100k";

		try {
			System.out.println(arr[3]);

			int num1 = Integer.parseInt(ten);
			int num2 = Integer.parseInt(bak);
			int a = 100;
			int b = a / 0;


		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위초과");
			System.out.println(arr[4]);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
			System.out.println(0);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자값이 아닙니다.");
			
		}finally {
			//finally : ERROR과 상관없이 반드시 실행하는 코드
			//EX) scan.close(); 와같은 시스템 닫는 코드들
			System.out.println("try - catch - finally 끝");
			scan.close();
		}
		
		System.out.println("프로그램 끝");
		
	}

}
