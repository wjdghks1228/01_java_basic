package week3.step_01;

import java.util.Random;
import java.util.Scanner;

public class Ex00_1to4 {

	/*
	 * # 1 to 4 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다. 
	 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다. 
	 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
	 *  예) 4 2 3 1 
	 * 		 입력 : 3 
	 * 		 4 2 3 9 
	 *  		입력 : 1
	 * 			 4 9 3 9 ...
	 */
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int check[]= new int [4];
		int arr[]= new int [4];
		int i=0;
		while(true) {
			int rndNum = rnd.nextInt();
			if(check[(rndNum-1)]!=1) {
				arr[i]=rndNum;
				i++;
				System.out.println(arr[i]+" ");
			}
			else {
				continue;
			}
		}
		
		
	}

}
