package week3.step_01;

import java.util.Scanner;

public class Ex_00_Lotto_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] lotto = { 0, 0, 7, 7, 7, 0, 0, 0 }; // 당첨
		//int[] lotto = {7, 0, 7, 7, 0, 7, 0, 7}; // 꽝
		int count=0;
		for (int i = 0; i < lotto.length; i++) {
			if (count>=3) {
				System.out.println("복권 당첨");
				return;
			}
			if (lotto[i] == 7) {
				count++;
			}
			else {
				if(count!=0) {
					count--;
				}
			}
		}
		System.out.println("꽝");
	}

}
