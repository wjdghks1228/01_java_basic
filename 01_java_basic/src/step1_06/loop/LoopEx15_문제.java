package step1_06.loop;

import java.util.Random;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

//2021_01_29 TIME 19 : 44 ~ 19 : 
public class LoopEx15_문제 {

	public static void main(String[] args) {
		Random rand = new Random();
		int totalScore = 0;
		boolean isRun = true;
		int count = 0;
		int passCount = 0;
		int student = 1;
		int max = 0;
		int maxStudent = 0;
		
		while(isRun) {
			if(count == 10) {
				isRun = false;
			}
			//학생성적 랜덤값 받아
			int randNum = rand.nextInt(100) + 1 ;
			System.out.println(student + "학생 점수 : " + randNum);
			//토탈스코어 저장
			totalScore += randNum;
			//합격자 산출
			if(randNum >= 60) {
				System.out.println("합격");
				passCount ++ ;
				if( max <= randNum) {
				maxStudent = student;
				student++;
				max = randNum;
				count++;
				}
				else {
					student++;
					count++;
				}
			}
			else {
				System.out.println("불합격");
				student ++ ;
				count++;
			}
		}
		int average = totalScore / student;
		System.out.println("합격자 수 :  " + passCount);
		System.out.println("총점 : "+ totalScore);
		System.out.println("평균 : " + average);
		System.out.println("최고점 학생 : " + "[" + maxStudent + "]" + " : " + max + "점");
	}
	

}
