package week3.step_01;

import java.util.Random;
import java.util.Scanner;

public class Ex1_50_choiceEndNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		// TODO Auto-generated method stub
		// final int SIZE = 9;
		// int[] front = new int[SIZE];
		// int[] back = new int[SIZE];

		
		final int SIZE = 25;
		int front[ ] =new int[SIZE];
		int back[ ] = new int[SIZE];
		
		for(int i=0; i<25;i++) {
			front[i]=i+1;
		}
		int p = 26;
		for(int z=0;z<25;z++) {
			back[z]=p++;
		}
		int findNum=1;
		int addBack = 51;
		
		//front 배열 섞기
		int c = 0;
		while (c < 100) {
			int rndNum = rnd.nextInt(25);
			int temp = front[0];
			front[0] = front[rndNum];
			front[rndNum] = temp;
			c += 1;
		}
		//back배열 섞기
		int d = 0;
		while (d < 100) {
			int rndNum2 = rnd.nextInt(25);
			int temp = back[0];
			back[0] = back[rndNum2];
			back[rndNum2] = temp;
			d += 1;
		}
		//front 배열 출력
		System.out.println("1 to 50 GAME START!!");
		System.out.println();
		System.out.println();
		for(int b=0;b<5;b++) {
			System.out.print("["+front[b]+"]"+"  ");
		}
		System.out.println();
		for(int b=5;b<10;b++) {
			System.out.print("["+front[b]+"]"+"  ");
		}
		System.out.println();
		for(int b=10;b<15;b++) {
			System.out.print("["+front[b]+"]"+"  ");
		}
		System.out.println();
		for(int b=15;b<20;b++) {
			System.out.print("["+front[b]+"]"+"  ");
		}
		System.out.println();
		for(int b=20;b<25;b++) {
			System.out.print("["+front[b]+"]"+"  ");
		}
		System.out.println();
		System.out.println();
				
		
		
		
		//front에서 1부터 찾기
		int backIndex=0;
		while(true) {
			System.out.println();
			System.out.println("숫자 "+findNum+"을 찾으세요");
			int inputIndex = sc.nextInt();
			for(int i=0;i<25;i++) {
				if(front [i] == findNum) {
					
					if(i==(inputIndex-1)) {
						front[i]=back[backIndex];
						back[backIndex]=addBack;
						addBack++;
						System.out.println();
						if(findNum==3) {
							System.out.println("50탐색완료 게임 끝 ");
							return;
						}
						System.out.println();
						System.out.print("입력하신 index : "+(inputIndex-1));
						System.out.println("   --->       숫자"+findNum+" 탐색 완료");
						System.out.println();
						System.out.println();
						
						System.out.println("FRONT");
						for(int j=0;j<5;j++) {
							System.out.print("["+front[j]+"]"+"  ");
						}
						System.out.println();
						for(int j=5;j<10;j++) {
							System.out.print("["+front[j]+"]"+"  ");
						}
						System.out.println();
						for(int j=10;j<15;j++) {
							System.out.print("["+front[j]+"]"+"  ");
						}
						System.out.println();
						for(int j=15;j<20;j++) {
							System.out.print("["+front[j]+"]"+"  ");
						}
						System.out.println();
						for(int j=20;j<25;j++) {
							System.out.print("["+front[j]+"]"+"  ");
						}
						System.out.println();
						System.out.println();
						if(backIndex==24) {
						backIndex=0;
						findNum++;
						i=0;
						continue;
						}
						backIndex++;
						findNum++;
						i=0;
					}
				}
			}
		}
		
	}

}




/*
 * 
 *	//back 배열 출력
		System.out.println("BACK");
		for(int b=0;b<5;b++) {
			System.out.print("["+back[b]+"]"+"  ");
		}
		System.out.println();
		for(int b=5;b<10;b++) {
			System.out.print("["+back[b]+"]"+"  ");
		}
		System.out.println();
		for(int b=10;b<15;b++) {
			System.out.print("["+back[b]+"]"+"  ");
		}
		System.out.println();
		for(int b=15;b<20;b++) {
			System.out.print("["+back[b]+"]"+"  ");
		}
		System.out.println();
		for(int b=20;b<25;b++) {
			System.out.print("["+back[b]+"]"+"  ");
		}
		System.out.println(); 

 * 
 * 
 * BACK 출력
 * 
 * 
 * 						System.out.println("BACK");
						for(int k=0;k<5;k++) {
							System.out.print("["+back[k]+"]"+"  ");
						}
						System.out.println();
						for(int k=5;k<10;k++) {
							System.out.print("["+back[k]+"]"+"  ");
						}
						System.out.println();
						for(int k=10;k<15;k++) {
							System.out.print("["+back[k]+"]"+"  ");
						}
						System.out.println();
						for(int k=15;k<20;k++) {
							System.out.print("["+back[k]+"]"+"  ");
						}
						System.out.println();
						for(int k=20;k<25;k++) {
							System.out.print("["+back[k]+"]"+"  ");
						}
						System.out.println();
 *
 * 
 * */
