package week3.step_01;

import java.util.Random;
import java.util.Scanner;

public class Game_Bingo_2players {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		// #1. 3 x 3 2차원 배열
		// # 2. 1~50 사이의 랜덤 숫자 25개를 중복없이 저장
		// # 3. 숫자 선택 시, y와 x좌표를 입력받아 처리
		// # 4. 한줄 완성 시, 빙고!(게임 종료)
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int maxNum = 5;
		int[][] bingo = new int[maxNum][maxNum]; // 게임판
		int[][] markP1 = new int[maxNum][maxNum]; // 사용자가 이미 사용한 번호인지 체크
		int[][] markP2 = new int[maxNum][maxNum]; // 사용자가 이미 사용한 번호인지 체크
		int[] temp = new int[50]; // 중복없이 값 넣기 위해서
		int size = 50;

		// bingo판에 중복없이 값 넣기
		for (int y = 0; y < maxNum; y++) {
			for (int x = 0; x < maxNum; x++) {
				int rndNum = rnd.nextInt(50) + 1;
				if (temp[(rndNum - 1)] == 0) {
					bingo[y][x] = rndNum;
					temp[rndNum - 1]++;
					//System.out.print(bingo[y][x] + "  ");
				} else {
					for (int j = 0; j < 50; j++) {
						if (temp[j] == 0) {
							bingo[y][x] = j + 1;
							temp[j]++;
							//System.out.print(bingo[y][x] + "  ");
							break;
						}
					}
				}
			}
			//System.out.println();
		}
		
		//System.out.println();
		//System.out.println();

		int pickY = 0;
		int pickX = 0;
		int log = 1;
		int key = 1;

		
		

		while (true) {
			//bingo판 출력
			System.out.println();
			for(int y=0;y<maxNum;y++	) {
				for(int x=0; x<maxNum; x++) {
					System.out.print(bingo[y][x]+"  ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			//P1 mark판 출력
			System.out.println("P1마크판 출력");
			for(int y=0; y<maxNum;y++) {
				for(int x=0; x<maxNum;x++) {
					System.out.print(markP1[y][x]+"  ");
				}
				System.out.println();
			}
			System.out.println();
			//P2 mark 판 출력
			System.out.println("P2마크판 출력");
			for(int y=0; y<maxNum;y++) {
				for(int x=0; x<maxNum;x++) {
					System.out.print(markP2[y][x]+"  ");
				}
				System.out.println();
			}
		
			//mark에서 빙고검사
			
			//1. 위아래 빙고
			if (log == 1) {
				for (int x = 0; x < maxNum; x++) {
					int UDBingoCount1 = 0;
					for (int y = 0; y < maxNum; y++) {
						if (markP1[y][x] == 1) {
							UDBingoCount1++;
						}
					}
					if (UDBingoCount1 == maxNum) {
						System.out.println("플레이어 1 상하 빙고 검출 : P1 승리");
						return;
					}
				}
			}
			else if (log == 2) {
				for (int x = 0; x < maxNum; x++) {
					int UDBingoCount2 = 0;
					for (int y = 0; y < maxNum; y++) {
						if (markP2[y][x] == 2) {
							UDBingoCount2++;
						}
					}
					if (UDBingoCount2 == maxNum) {
						System.out.println("플레이어 2 상하 빙고 검출 : P1 승리");
						return;
					}
				}
				
			}
			//2. 양옆 빙고 검사
			if (log == 1) {
				for (int q = 0; q < maxNum; q++) {
					int LRBingoCount = 0;
					for (int w = 0; w < maxNum; w++) {
						if (markP1[q][w] == key) {
							LRBingoCount++;
						}
					}
					if (LRBingoCount == maxNum) {
						System.out.println("좌우 빙고 검출 : 게임 종료 : P1 승리");
						return;
					}
				}
			} else if (log == 2) {
				for (int q = 0; q < maxNum; q++) {
					int LRBingoCount = 0;
					for (int w = 0; w < maxNum; w++) {
						if (markP2[q][w] == key) {
							LRBingoCount++;
						}
					}
					if (LRBingoCount == maxNum) {
						System.out.println("좌우 빙고 검출 : 게임 종료 : P2 승리");
						return;
					}
				}

			}

			//3. "/" 빙고 검출
			if (log == 1) {
				int count =0 ;
				int to_MaxY=0;
				int to_MaxX=0;
				if (markP1[maxNum / 2][maxNum / 2] == key) {
					for(int y=0 ; y<maxNum; y++) {
						if(markP1[to_MaxY][to_MaxX]==key) {
							count ++;
						}
						to_MaxY++;
						to_MaxX++;
					}
					if(count == maxNum) {
						System.out.println("P1 우하향 빙고 완성 : P1승리");
					}
				}
			}
			
			if (log == 2) {
				int count =0 ;
				int to_MaxY=0;
				int to_MaxX=0;
				if (markP2[maxNum / 2][maxNum / 2] == key) {
					for(int y=0 ; y<maxNum; y++) {
						if(markP2[to_MaxY][to_MaxX]==key) {
							count ++;
						}
						to_MaxY++;
						to_MaxX++;
					}
					if(count == maxNum) {
						System.out.println("P2 우하향 빙고 완성 : P2승리");
					}
				}
			}
			
			//4. "/" 빙고 검출
				if (log == 1) {
					int count =0 ;
					int to_MaxY=maxNum-1;
					int to_MaxX=0;
					if (markP2[maxNum / 2][maxNum / 2] == key) {
						for(int y=0 ; y<maxNum; y++) {
							if(markP1[to_MaxY][to_MaxX]==key) {
								count ++;
							}
							to_MaxY--;
							to_MaxX++;
						}
						if(count == maxNum) {
							System.out.println("P1 우하향 빙고 완성 : P1승리");
						}
					}
				}
				
				if (log == 2) {
					int count =0 ;
					int to_MaxY=maxNum-1;
					int to_MaxX=0;
					if (markP2[maxNum / 2][maxNum / 2] == key) {
						for(int y=0 ; y<maxNum; y++) {
							if(markP2[to_MaxY][to_MaxX]==key) {
								count ++;
							}
							to_MaxY--;
							to_MaxX++;
						}
						if(count == maxNum) {
							System.out.println("P2 우하향 빙고 완성 : P2승리");
						}
					}
				}
			
			
			//플레이어 결정
			if(log==1) {
				System.out.println();
				System.out.println("player1 차례 입니다.");
				key = 1;
			}
			else if(log ==2) {
				System.out.println();
				System.out.println("player2 차례 입니다");
				key = 2;
			}
			
			System.out.println();
			//빙고 숫자 입력 
			System.out.println("빙고 숫자를 입력해주세요 !!");
			int pickNum = sc.nextInt();

			// 이미선택된 숫자인지 mark 에서 검사
			for (int y = 0; y < 5; y++) {
				for (int x = 0; x < 5; x++) {
					if (log == 1) {
						if (markP1[y][x] == key) {
							if (bingo[y][x] == pickNum) {
								System.out.println("P1님 이미 입력된 숫자입니다.");
								continue;
							}
						}
					}
					else if(log ==2) {
						if (markP2[y][x] == key) {
							if (bingo[y][x] == pickNum) {
								System.out.println("P2님 이미 입력된 숫자입니다.");
								continue;
								
							}
						}
					}
				}
			}

			//빙고값 입력 된거 마크에 춢력	
			for (int y = 0; y < maxNum; y++) {
				for (int x = 0; x < maxNum; x++) {
					if (bingo[y][x] == pickNum) {
						pickY = y;
						pickX = x;
						if(log == 1) {							
						markP1[pickY][pickX] = key;
						}
						else if(log ==2) {
						markP2[pickY][pickX] = key;
						}
						
						if(log == 1) {
							log++;
						}
						else if(log ==2 ){
							log --;
						}
					}
				}
			}
		}
	}
  }





















/*
 * 		int arr[] = {
				0,0,0,
				0,0,0,
				3,3,3
		};
		int c=0;
		//문제1) 배열을 위와 같이3줄씩 출력
		for(int y=0;y<3;y++) {
			for(int a=0;a<3;a++) {
				System.out.print(arr[c]+" ");
				c++;
			}
			System.out.println();
		}
 * 
 */