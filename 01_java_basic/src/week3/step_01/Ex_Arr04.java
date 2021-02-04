package week3.step_01;

import java.util.Scanner;

public class Ex_Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인덱스 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1 성적 : 11점
		Scanner sc = new Scanner(System.in);
		System.out.println("input index");
		int index = sc.nextInt();
		System.out.println(arr[index]);
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11 인덱스 : 1
		System.out.println("score");
		int score = sc.nextInt();
		for(int k=0;k<arr.length;k++) {
			if(arr[k]==score) {
				System.out.println(k);
			}
		}
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003 성적 : 45점
		//심화문제
		//없는 학번 입력시 예외처리
		System.out.println("input hak");
		int i=0;
		int hak = sc.nextInt();
		int fndindex =0;
		for(i=0;i<hakbuns.length;i++) {
			if(hakbuns[i]==hak) {
				fndindex=i;
			}
		}
		System.out.println(scores[fndindex]);
		/*
		 * if(hakbuns[i]==hak) {
				System.out.println(scores[i]);
			}*/
		
		
		
		
		//심화문제#2 1등학생의 학번과 성적출력
		int max =-1000;
		int maxindex =0;
		for(int j=0;j<scores.length;j++) {
			if(scores[j]>=max) {
				max=scores[j];
				maxindex =j ;
			}
		}
		System.out.println("최고점학생은 "+maxindex+"학생, 그 점수는 :"+max);
		
	}

}
