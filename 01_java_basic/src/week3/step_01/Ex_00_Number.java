package week3.step_01;

import java.util.Random;
import java.util.Scanner;

public class Ex_00_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 중복숫자 금지[1단계]
		 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
		 * 2. 단, 중복되는 숫자는 없어야 한다.
		 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
		 * 
		 * 예)
		 * 랜덤숫자 : 1
		 * check = {0, 1, 0, 0, 0}
		 * arr   = {1, 0, 0, 0, 0}
		 * 랜덤숫자 : 3
		 * check = {0, 1, 0, 1, 0}
		 * arr   = {1, 3, 0, 0, 0}
		 * 랜덤숫자 : 2
		 * check = {0, 1, 1, 1, 0}
		 * arr   = {1, 3, 2, 0, 0}
		 */
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int check[ ]= new int [5];
		int arr[]= new int [5];
		int i=0;
		while(true) {
			for(int a=0;a<check.length;a++) {
				System.out.print(check[a]+" ");
			}
			System.out.println();
			for(int a=0;a<check.length;a++) {
				System.out.print(arr[a]+" ");
			}
			System.out.println();
			
			int rndnum = rnd.nextInt(4);
			System.out.println("랜덤숫자 생성 : "+rndnum);
			if(check[rndnum]==1) {
				System.out.println("중복된 숫자 검출 : "+rndnum);
				break;
			}
			else {
				System.out.println("중복되지 않은 숫자 : "+rndnum);
				check[rndnum]++;
				arr[i]=rndnum;
				i++;
			}
		}
	}

}
