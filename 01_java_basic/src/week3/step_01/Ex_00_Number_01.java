package week3.step_01;

import java.util.Random;
import java.util.Scanner;

public class Ex_00_Number_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int now=0;
		while (true) {
			int check =0;
			System.out.println();
			//배열 상태 출력
			System.out.print("현재 배열상태 : ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			//배열이 다차면 종료 now : 현재 커서 위치
			if(now ==5 ) {
				break;
			}
			int rndNum = rnd.nextInt(5); //0,1,2,3,4 0부터 5개 받아올거다
			System.out.println("랜덤 값은 : "+rndNum);
			
			//처음 값을 배열 에 넣어준다
			if(now == 0) {
				arr[now]=rndNum;
				now++;
			}
			System.out.println("현재 커서위치 : "+now);
			
			//중복숫자 검사 시작 
			for(int i=0;i<now;i++) {
				for(int k=0;k<now;k++) {
					if(rndNum == arr[k]) {
						check=1;
						break;
					}
				}
			}
			if(check ==1) {
				continue;
			}
		
				arr[now]=rndNum;
				now++;
			
			System.out.print("대입후 배열상태 : ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("대입후 커서위치 : "+now);
			System.out.println();
			System.out.println();
			
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
}
