package step1_06.loop;

import javax.swing.text.StyledEditorKit.ForegroundAction;
/*
 *  # 반복문 for
 * 
 * 1. 반복문의 조건 3가지 
 * 		1) 초기식 2) 조건식 3) 증감식
 * 
 * 2. [ 형식 ]
 * 
 * for (초기식;조건식;증감식) {
 * 		조건식이 참일때 반복할 명령어;
 * }
 * 
 * 3. for문의 실행순서
 *  1) 초기식
 *  2) 조건식  3) 명령어  4) 증감식 
 *  조건이 false가 될때까지 2)3)4) 반복 
 * 
 * 
 * */
public class LoopEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		while(x<5) {
			System.out.println("x");
			x++;
		}
		
		for ( int i = 0 ; i < 5 ; i ++ ) {
			System.out.println("y");
		}
		
		for( int i = 0 ; i < 10 ; i++ ) {
			for ( int j = 0; j < 10 ; j ++) {
				for(int k = 0 ; k< 10 ; k++) {
					for(int l = 0 ; l<10 ; l++) {
						for(int n = 0 ; n < 10 ; n++ ) {
							for ( int m  = 0 ; m < 10 ; m ++ ) {
								System.out.println("1");
							}
						}
					}
				}
			}
		}

		
	}
}
