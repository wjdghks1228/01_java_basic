package week3.step_01;

import java.util.Random;
import java.util.Scanner;

public class Ex_00_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 중복숫자 금지[1단계] 1. 0~4 사이의 숫자를 arr배열에 저장한다. 2. 단, 중복되는 숫자는 없어야 한다.
		 * 
		 * 예) 랜덤숫자 : 1 arr = {1, 0, 0, 0, 0} 랜덤숫자 : 3 arr = {1, 3, 0, 0, 0} 랜덤숫자 : 2 arr
		 * = {1, 3, 2, 0, 0}
		 */

		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int arr[] = new int[5];
		
		while(true) {
			System.out.println();
			System.out.print("현재 배열 상태 : ");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("count 값은 : "+count);
			if(count == 5) {
				break;
			}
			int rndNum = rnd.nextInt(5);
			System.out.println("랜덤값은 : "+rndNum);
			int check = 0;
			if(count == 0) {
				arr[count] =rndNum;
				count++;
			}
			for (int i = 0; i < count; i++) {		
				for (int k = 0; k < count; k++) {
				  if(rndNum == arr[k]) {
					  check = 1;
					  break;
				  }
				}	
			}
			
			if (check ==0) {
				arr[count] = rndNum;
				count++;
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
}
