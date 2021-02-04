package week3.step_01;

import java.util.Scanner;

public class Ex_00_Loto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// 7이 연속으로 나오면 복권 당첨 출력 그렇지 않으면 꽝 출력 
				Scanner scan = new Scanner(System.in);
				int[] lotto = { 0, 0, 7, 7, 7, 0, 0, 0 }; // 당첨
				//int[] lotto = {7, 0, 7, 7, 0, 7, 0, 7}; // 꽝
				int result=0;
				for(int i=1;i<lotto.length-1;i++) {
					if((lotto[i-1])==(lotto[i])&&(lotto[i+1])==(lotto[i])) {
					result=1;
					}
				}
				if(result >=1) {
					System.out.println("당첨");
				}
				else {
					System.out.println("꽝");
				}
	}

}
