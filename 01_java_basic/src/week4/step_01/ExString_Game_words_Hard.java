package week4.step_01;

import java.util.Scanner;

public class ExString_Game_words_Hard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 문제 1 
		/*
		 * # 문자열 속 숫자검사
		 * 예) adklajsiod
		 * 	     문자만 있다.
		 * 예) 123123
		 *    숫자만 있다.
		 * 예) dasd12312asd
		 *    문자와 숫자가 섞여있다.
		 */
		//문자열 입력
		String myWords = scan.nextLine();
		
		//arr배열에 나누기
		char arr[] = new char[myWords.length()];
		for(int i=0;i<myWords.length();i++) {
			arr[i] = myWords.charAt(i);
		}
		
		//int 형으로 전환해서 저장
		int intArr[] = new int[myWords.length()];
		for(int i=0;i<myWords.length();i++) {
			intArr[i] = (int)arr[i];
		}
		
		//숫자 검사
		int numberFind = 0 ;
		int charFind = 0;
		int length = myWords.length();
		
		for(int i=0;i<length;i++) {
			if(intArr[i]<97) {
				numberFind ++;
			}
			else {
				charFind++;
			}
		}
		
		if(numberFind > 0 && charFind > 0) {
			System.out.println("문자 숫자 , 둘다있다");
		}
		else if(numberFind>0 && charFind == 0){
			System.out.println("숫자만 있다");
		}
		else {
			System.out.println("문자만 있다");
		}
		
		

		

	}

}
