package week4.step_01;

import java.util.Scanner;

class Ex01{
	int[] arr = {87,100,11,72,92};
}

public class ExClass_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass mc2 = new MyClass();
		// 클래스는 같은 패키지 안에 다른 클래스 사용이 가능하다 
		
		System.out.println(mc2.a);
		System.out.println(mc2.dnum);
		System.out.println(mc2.fnum);
		System.out.println(mc2.name);
		
		Scanner sc = new Scanner(System.in);
		
		//class 호출
		Ex01 myArr = new Ex01();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int sum =0;
		for(int i=0;i<myArr.arr.length;i++) {
			sum += myArr.arr[i];
		}
		System.out.println("문제1) 총 합은 : "+ sum);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int fourSum = 0;
		for(int i=0 ;i<myArr.arr.length;i++) {
			if(myArr.arr[i]%4 == 0) {
				fourSum += myArr.arr[i];
			}
		}
		System.out.println("문제2) 4의 배수의 합 : "+fourSum);
		
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		int fourCount = 0;
		for(int i=0 ;i<myArr.arr.length;i++) {
			if(myArr.arr[i]%4 == 0) {
				fourCount++;
			}
		}
		System.out.println("문제3) 4의 배수의 개수 : "+fourCount);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		
		int twoCount = 0;
		for(int i=0 ;i<myArr.arr.length;i++) {
			if(myArr.arr[i]%2 == 0) {
				twoCount++;
			}
		}
		System.out.println("문제4) 짝수의 개수 : "+twoCount);

		
		
	}

}
