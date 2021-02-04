package week4.step_01;
//2021_01_22 ---> TIME : 16 : 

import java.util.Random;
/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */
import java.util.Scanner;

class ScoreMng{
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	int[] omr = {1, 4, 3, 2, 2};		// 모범답안
	int[] me = new int[5];				// 학생답안
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						//성적
	
	// 1.me 답안 완성하기
		void makeAnswer() {
			for(int i = 0 ; i < me.length; i++ ) {
				System.out.println((i+1) + "번 답을 입력하세요 : ");
				int myOmr = scan.nextInt();
				me[i] = myOmr;
			}
			
			System.out.println();
			System.out.println("완성된 답");
			for(int i = 0 ; i < me.length; i++ ) {
				System.out.print(me[i] + " ");
			}
			System.out.println();
		}
		
		// 2.정답 출력하기
		void showAnswer() {
			System.out.println();
			System.out.println("답안출력");
			for(int i = 0 ; i < omr.length; i++) {
				System.out.print(omr[i] + " ");
			}
			System.out.println();
		}
		// 3.정답 비교하기
		void checkAnswer() {
			System.out.println();
			for(int i = 0; i < omr.length ; i++) {
				System.out.print((i+1)+"번 정답비교 : ");
				if(omr[i] == me[i]) {
					System.out.print("정답");
					System.out.println();
				}
				else if(omr[i] != me[i]	) {
					System.out.print("오답, 정답은 : " + omr[i]);
					System.out.println();
				}
					
			}
		}
		// 4.실행하기
		void run() {
			makeAnswer();
			showAnswer();
			checkAnswer();
			scan.close();
		}
		
}

public class Class_05_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScoreMng sm = new ScoreMng();
		sm.run();
		
	}

}
