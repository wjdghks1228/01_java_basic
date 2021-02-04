package week2.stack;

import java.util.Random;
import java.util.Scanner;

public class Loop_Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 랜덤학생
		 * 1. 10회 반복을 한다.
		 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
		 * 3. 성적이 60점 이상이면 합격생이다.
		 * ---------------------------------------
		 * . 전교생(10명)의 총점과 평균을 출력한다.
		 * . 합격자 수를 출력한다.
		 * . 1등 학생의 번호와 성적을 출력한다.
		 */
		//		Scanner sc = new Scanner(System.in);

		Random rnd = new Random();
		int student =0;
		int i=0;
		int count =0;
		int sum =0;
		int max = -1200;
		int average=0;
		while(i<10) {
		student++;
		i++;	
		int rndnum = rnd.nextInt(100);
		if(rndnum>=60) {
			count++;
		}
		sum += rndnum;
		if(rndnum >= max)
		max = rndnum;
		
		System.out.println("학생 "+student+"의 점수 : "+rndnum);
		}
		average = sum/student;
		System.out.println("총 학생수 = "+ student);
		System.out.println("총 점 = "+ sum);
		System.out.println("평균 = "+ average);
		System.out.println("합격자 수 = "+ count);
		System.out.println("최고점 = "+ max);
		
		
		
	}

}
