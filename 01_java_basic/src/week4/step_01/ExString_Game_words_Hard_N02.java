package week4.step_01;

import java.util.Scanner;

public class ExString_Game_words_Hard_N02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제 2 
				/*
				 * # 단어 검색
				 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
				 * 2. 단어가 존재하면 true
				 *    단어가 없으면 false를 출력한다.
				 */
				Scanner scan = new Scanner(System.in);
				String text = "Life is too short.";
				System.out.println(text);
				System.out.print("검색할 단어를 입력하세요 : ");
				String words = scan.next();
				
				//arrText 배열에 text문장 index 별로 저장 : 아스키 코드로 저장
				int arrText[ ] = new int[text.length()];
				int textLength = text.length();
				
				for(int i=0;i<textLength;i++) {
					arrText[i]=(int)text.charAt(i);
					//System.out.print(arrText[i]+" ");
				}
				
				System.out.println();
				
				//arrWord 배열에 word문장 index 별로 저장 : 아스키 코드로 저장
				int arrWords[] = new int[words.length()];
				int wordsLength = words.length();
				for(int i=0; i<wordsLength;i++) {
					arrWords[i] = (int)words.charAt(i);
					//System.out.print(arrWords[i]+" ");
				}
				
				System.out.println();
				
				//log로 검출여부 확인할 것
				int log = 0;
				
				//text 에 words 가 있는지 검사
				for(int i=0; i<textLength; i++) {
					if(arrText[i] == arrWords[0]) {
						int index = i;
						int count = 0;
						
						for(int j=0; j<wordsLength; j++) {
							if( arrText[index] == arrWords[j]) {
								count++;
								index++;
							}
						}
						if( count == wordsLength) {
							log = 1;
						}
					}
					
				}
				
				if(log ==1) {
					System.out.println("검출");
				}
				else if(log == 0) {
					System.out.println("미검출");
				}
				
				
				//문제 3
				/*
				 * # 단어 교체하기(replace)
				 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
				 * 2. 교체해주는 기능을 구현한다.
				 * 예)
				 * 		Life is too short.
				 * 		변경하고 싶은 단어입력 : Life
				 * 		바꿀 단어입력 : Time
				 * 
				 * 		Time is too short.
				 */
	}

}
