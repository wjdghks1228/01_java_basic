package week3.step_01;

import java.util.Scanner;

public class Game_Ladder {
	/*
	 * # 사다리 게임
	 * 1. 인덱스 0~4를 하나선택한다. 
	 * 2. 숫자 0 을 만나면 그냥 아래로 내려간다.
	 * 3. 숫자 1 을 만나면 오른쪽으로 이동후 내려간다.
	 * 4. 숫자 2 를 만나면 완쪽으로 이동후 내려간다.
	 * 5. 오늘의 메뉴 출력 
	 * 
	 * 	System.out.print(" │ "); 
		System.out.print(" ├─"); 
		System.out.print("─┤ ");
	 */
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String menu[] = {"떡라면" , "돈까스" ,"짜장면" , "쫄면" , "된장찌개"};
			int ladder[][]= {
					{0,0,0,0,0},
					{1,2,0,1,2},
					{0,1,2,0,0},
					{0,0,1,2,0},
					{1,2,0,0,0},
					{0,1,2,0,0},
					{1,2,0,0,0},
					{0,0,0,1,2},
					{0,0,0,0,0}};
 			      // 떠 돈 짜 쫄  된
				  // 4 2 1 3  0
			char key = '*';
	
	    
			System.out.println(" 0  1  2  3  4");
			for(int y=0;y<8;y++	) {
				for(int x=0;x<5;x++) {
					if(ladder[y][x]==0) {
						System.out.print(" │ ");
					}
					else if(ladder[y][x]==1) {
						System.out.print(" ├─");
					}
					else if(ladder[y][x]==2) {
						System.out.print("─┤ ");
					}
				}
				System.out.println();
			}
			
		
			System.out.println("시작 index 입력!");
			int startLadder = sc.nextInt();
			int moveY = 0;
			int moveX = 0;

			
			moveX = startLadder;
			
			//처음 한칸 아래로 이동
			moveY ++ ;
	
			while(true) {

				
				System.out.println(" 0  1  2  3  4");
				for(int y=0;y<8;y++	) {
					for(int x=0;x<5;x++) {
						//현재 내 값이 출력 FOR문 값과 같을때 주인공 이동표시 * 출력
						if(moveX == x && moveY == y) {
							System.out.print(" * ");
						}else {
						if(ladder[y][x]==0) {
							System.out.print(" │ ");
						}
						else if(ladder[y][x]==1) {
							System.out.print(" ├─");
						}
						else if(ladder[y][x]==2) {
							System.out.print("─┤ ");
						}
						}
					}
					System.out.println();
				}
				
		
				
				
				if(moveY>7) {
					System.out.println(moveX+"번째 당첨 : "+menu[moveX]);
					break;
				}
				//0이면 아래로
				if(ladder[moveY][moveX]==0 ) {
					moveY++;
					continue;
				}
				//오른쪽 이동
				else if(ladder[moveY][moveX]==1 && ladder[moveY][moveX+1]==2) {
					moveX++;
					moveY++;
					continue;
				}
				//왼쪽 이동
				else if(ladder[moveY][moveX]==2 && ladder[moveY][moveX-1]==1 ) {
					moveX--;
					moveY++;
					continue;
				}
			}
			
		}

}
