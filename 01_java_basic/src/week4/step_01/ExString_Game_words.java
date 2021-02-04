package week4.step_01;

import java.util.Random;
import java.util.Scanner;

public class ExString_Game_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner charScan = new Scanner(System.in);
		Random rnd = new Random();

		/*
		 * # 끝말잇기 게임
		 * 제시어 : 자전거
		 * 입력 : 거미
		 * 제시어 : 거미
		 * 입력 : 미술
		 * ...
		 */
		//문제1 

		System.out.println("문제1 : 끝말잇기 게임 10번");
		int count = 0;
		String start = "자전거";
		while (true) {
			if (count == 10) {
				System.out.println("끝말있기 종료");
				break;
			}
			System.out.println("제시어 : " + start);
			String words = charScan.nextLine();
			char lastWord = start.charAt(start.length() - 1);
			char firstWord = words.charAt(0);
			if (lastWord == firstWord) {
				System.out.println(count + 1);
				count++;
				start = words;
			} else {
				System.out.println("땡 , 처음부터 다시");
				count = 0;
				start = "자전거";
			}
		}
		
	
		//문제2
		/*
		 * # 타자연습 게임[1단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 예)
		 * 문제 : mysql
		 * 입력 : mydb
		 * 문제 : mysql
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : jsp
		 */
/*		 
		System.out.println("문제2 : 타자연습게임 1단계");
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		//문제섞기
		int z=0;
		while(z<50) {
			int rndNum = rnd.nextInt(4);
			String temp;
			temp = words[0];
			words[0]=words[rndNum];
			words[rndNum]=temp;
			z++;
		}
		System.out.println("문제 출제");
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]+" ");
		}
		System.out.println();
		
		int j = 0 ;
		int result = -1;
		
		while(true) {	
			if(j==words.length) {
				System.out.println("타자연습 종료 !");
				break;
			}
			System.out.println("문제 : " + words[j]);
			String myWords = charScan.nextLine();
			if((result=words[j].compareTo(myWords))==0) {
				j++;
			}
			
		}
		
*/
		
		
		
		
		//문제3
		/*
		 * # 타자연습 게임[2단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
		 * 예)
		 * 문제 : mys*l
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : *sp
		 * 입력 : jsp
		 * ...
		 */
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		//문제섞기
		int z=0;
		while(z<50) {
			int rndNum = rnd.nextInt(4);
			String temp;
			temp = words[0];
			words[0]=words[rndNum];
			words[rndNum]=temp;
			z++;
		}
		System.out.println("문제 출제");
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]+" ");
		}
		System.out.println();
		
		int j = 0;
		char charTemp;
		int result = -1;
		
		while(true) {
			//게임 끝 조건
			if(j==words.length) {
				System.out.println("타자연습 종료 !");
				break;
			}
			//rndIndex 생성
			int rndIndex = rnd.nextInt(words[j].length());
			
			//word[j] data를 arr배열에 넣기
			char arr[] =  new char[words[j].length()];
			for(int i=0;i<arr.length;i++) {
				arr[i] = words[j].charAt(i);
			}
			
			//rndIndex 에 "*"로 대체
			charTemp = arr[rndIndex];
			arr[rndIndex]='*';
			
			
			//출력
			System.out.print("문제 : ");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			
			//arr값 복구
			arr[rndIndex]=charTemp;
			
			//내값 입력
			String myWords = charScan.nextLine();
			
			//비교
			if((result=words[j].compareTo(myWords))==0) {
				j++;
			}
		}
		
		
	}

}
