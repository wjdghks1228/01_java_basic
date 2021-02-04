package week4.step_01;

import java.util.Scanner;

class Ex03{
	String[][] game = new String[3][3];
	int turn = 0;
	int win = 0;		
}
/* 
* # 틱택토
* === 틱택토 ===
* [X][X][O]
* [ ][O][ ]
* [ ][ ][ ]
* [p1]인덱스 입력 : 6
* === 틱택토 ===
* [X][X][O]
* [ ][O][ ]
* [O][ ][ ]
* [p1]승리
* 
* 
* 
* 0 1 2
* 3 4 5
* 6 7 8
* 
* 0.0  0.1  0.2
* 1.0  1.1  1.2
* 2.0  2.1  2.2
*/

public class ExClass_03_TickTakTok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//class 호출
		Ex03 user = new Ex03();
		
		//게임판 초기화
		for(int y=0 ;y<3;y++) {
			for(int x=0;x<3;x++) {
				user.game[y][x]="*";
			}
		}
		
		// 게임시작
		while (true) {
			//게임 승패 확인
			//세로 확인
			int user1RowCount =0 ;
			int user2RowCount =0 ;
			for (int x = 0; x < 3; x++) {
				user1RowCount =0 ;
				user2RowCount =0 ;
				for (int y = 0; y < 3; y++) {
					if (user.game[y][x] == "O") {
						user1RowCount++;
					} else if (user.game[y][x] == "X") {
						user2RowCount++;
					}
				}
			}
			if(user1RowCount == 3) {
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 3; x++) {
						System.out.print("[" + user.game[y][x] + "]");
					}
					System.out.println();
				}
				System.out.println("player1 승리");
				break;
			}
			else if(user2RowCount ==3) {
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 3; x++) {
						System.out.print("[" + user.game[y][x] + "]");
					}
					System.out.println();
				}
				System.out.println("player2 승리");
				break;
			}
			
			//가로확인
			int user1ColCount=0 ;
			int user2ColCount=0 ;
			
			for (int y = 0; y < 3; y++) {
				user1ColCount =0 ;
				user2ColCount =0;
				for (int x = 0; x < 3; x++) {
					if (user.game[y][x] == "O") {
						user1ColCount++;
					} else if (user.game[y][x] == "X") {
						user2ColCount++;
					}
				}
			}
			if(user1ColCount == 3) {
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 3; x++) {
						System.out.print("[" + user.game[y][x] + "]");
					}
					System.out.println();
				}
				System.out.println("player1 승리");
				break;
			}
			else if(user2ColCount ==3) {
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 3; x++) {
						System.out.print("[" + user.game[y][x] + "]");
					}
					System.out.println();
				}
				System.out.println("player2 승리");
				break;
			}
			
			/*
			 * 0.0  0.1  0.2
			 * 1.0  1.1  1.2
			 * 2.0  2.1  2.2
			 * */
			//대각 확인
			//\확인
			int slashX =0;
			int slashY =0;
			int slash1Count =0;
			int slash2Count =0;
			for(int i=0;i<3;i++) {
				if(user.game[slashY][slashX]=="O") {
					slash1Count++;
				}
				else if(user.game[slashY][slashX]=="X") {
					slash2Count++;
				}
				slashX++;
				slashY++;
				
			}
			if(slash1Count == 3) {
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 3; x++) {
						System.out.print("[" + user.game[y][x] + "]");
					}
					System.out.println();
				}
				System.out.println("player1 승리");
				break;
			}
			else if(slash2Count ==3 ) {
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 3; x++) {
						System.out.print("[" + user.game[y][x] + "]");
					}
					System.out.println();
				}
				System.out.println("player2 승리");
				break;
			}
			
			//  /확인
			int slashX2 =0;
			int slashY2 =2;
			int slash1Count2 =0;
			int slash2Count2 =0;
			for(int i=0;i<3;i++) {
				if(user.game[slashY2][slashX2]=="O") {
					slash1Count2++;
				}
				else if(user.game[slashY2][slashX2]=="X") {
					slash2Count2++;
				}
				slashX++;
				slashY--;
			}
			if(slash1Count2 == 3) {
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 3; x++) {
						System.out.print("[" + user.game[y][x] + "]");
					}
					System.out.println();
				}
				System.out.println("player1 승리");
				break;
			}
			else if(slash2Count2 ==3 ) {
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 3; x++) {
						System.out.print("[" + user.game[y][x] + "]");
					}
					System.out.println();
				}
				System.out.println("player2 승리");
				break;
			}
			
			
			//PLAYER1 게임
			
			if (user.turn == 0) {
				// 판출력
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 3; x++) {
						System.out.print("[" + user.game[y][x] + "]");
					}
					System.out.println();
				}
				System.out.println("player 1 차례");
				// Index 입력
				System.out.println("ticktacktox 번호 입력 : ");
				int putIndex = scan.nextInt();
				// Index 값 game 판에 적용
				int indexCount = -1;
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 3; x++) {
						indexCount++;
						if (indexCount == (putIndex - 1)) {
							user.game[y][x] = "O";
							user.turn =1 ;
						}
					}
				}
			}
			
			//PLAYER2 게임
			else if (user.turn == 1) {
				// 판출력
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 3; x++) {
						System.out.print("[" + user.game[y][x] + "]");
					}
					System.out.println();
				}
				
				System.out.println("player 2 차례");
				// Index 입력
				System.out.println("ticktacktox 번호 입력 : ");
				int putIndex = scan.nextInt();
				// Index 값 game 판에 적용
				int indexCount = -1;
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 3; x++) {
						indexCount++;
						if (indexCount == (putIndex - 1)) {
							user.game[y][x] = "X";
							user.turn =0 ;
						}
					}
				}
			}
			
			

		}
	}

}
