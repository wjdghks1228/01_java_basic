package week4.step_01;

import java.util.Scanner;

class Ex02{	
	String name = "";
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};
}

public class ExClass_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
		 */
		Scanner scan = new Scanner(System.in);
		
		Ex02 myStruct = new Ex02();
		
		while(true) {
			System.out.println();
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");

			System.out.println();
			System.out.print("선택하세요 : ");
			int choice = scan.nextInt();

			// 1: 성적 출력
			if (choice == 1) {
				for (int i = 0; i < myStruct.arHakbun.length; i++) {
					System.out.println("학생"+ (i+1) + "의 학번 : "+ myStruct.arHakbun[i] + " 성적 : " + myStruct.arScore[i]);
				}
			}

			else if (choice == 2) {
				int maxScore = 0;
				int maxIndex = 0;
				for (int i = 0; i < myStruct.arHakbun.length; i++) {
					if (maxScore <= myStruct.arScore[i]) {
						maxScore = myStruct.arScore[i];
						maxIndex = i;
					}
				}
				System.out.println("1등 학생은 : " + (maxIndex + 1) + "학생, 점수는 : " + myStruct.arScore[maxIndex]);
			}

			// 3 : 꼴등 학생 확인
			else if (choice == 3) {
				int minScore = 200;
				int minIndex = 0;
				for (int i = 0; i < myStruct.arHakbun.length; i++) {
					if (minScore >= myStruct.arScore[i]) {
						minScore = myStruct.arScore[i];
						minIndex = i;
					}
				}
				System.out.println("꼴등 학생은 : " + (minIndex + 1) + "학생, 점수는 : " + myStruct.arScore[minIndex]);
			}

			// 4 : 성적확인하기
			else if (choice == 4) {
				System.out.println("확인 하고싶은 학생을 입력하세요 : ");
				int studentChoice = scan.nextInt();
				
				System.out.println(myStruct.arScore[studentChoice-1 ]);
				
			}

			// 5. 종료하기
			else if (choice == 5) {
				System.out.println();
				System.out.println("종료하겠습니다");
				break;
			}

		}
		
			

	}

}
