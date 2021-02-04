package week3.step_01;

import java.util.Random;
import java.util.Scanner;

public class Game_Bingo {

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
		int[][] mark = new int[maxNum][maxNum]; // 사용자가 이미 사용한 번호인지 체크
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


		while (true) {
			//bingo판 출력
			for(int y=0;y<maxNum;y++	) {
				for(int x=0; x<maxNum; x++) {
					System.out.print(bingo[y][x]+"  ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			//mark판 출력
			for(int y=0; y<maxNum;y++) {
				for(int x=0; x<maxNum;x++) {
					System.out.print(mark[y][x]+"  ");
				}
				System.out.println();
			}
			
		
			//mark에서 빙고검사
			
			//1. 위아래 빙고
			for(int x=0;x<maxNum;x++) {
				int UDBingoCount =0;
				for(int y=0;y<maxNum;y++) {
					if(mark[y][x]==1) {
						UDBingoCount++;
					}
				}
				if(UDBingoCount==maxNum) {
					System.out.println("상하 빙고 검출 : 게임 종료");
					return;
				}
			}
			//2. 양옆 빙고 검사
			for(int q=0; q < maxNum; q++) {
				int LRBingoCount =0;
				for(int w=0; w<maxNum; w++) {
					if(mark[q][w]==1) {
						LRBingoCount++;
					}
				}
				if(LRBingoCount == maxNum) {
					System.out.println("좌우 빙고 검출 : 게임 종료");
					return;
				}
			}
			
			//3. "/" 빙고 검출
			if(mark[maxNum/2][maxNum/2]==1) {
				if((mark[maxNum/2-1][maxNum/2-1]==1)&&(mark[maxNum/2-2][maxNum/2-2]==1)&&(mark[maxNum/2+1][maxNum/2+1]==1)&&(mark[maxNum/2+2][maxNum/2+2]==1)) {
					System.out.println("우하향 모양 빙고 검출 : 게임 종료");
					return;
				}
			}
			
			//4. "/" 빙고 검출
			if(mark[maxNum/2][maxNum/2]==1) {
				if((mark[maxNum/2-1][maxNum/2+1]==1)&&(mark[maxNum/2-2][maxNum/2+2]==1)&&(mark[maxNum/2+1][maxNum/2-1]==1)&&(mark[maxNum/2+2][maxNum/2-2]==1)) {
					System.out.println("우상향 모양 빙고 검출 : 게임 종료");
					return;
				}
			}
			
			
			System.out.println();
			//빙고 숫자 입력 
			System.out.println("빙고 숫자를 입력해주세요 !!");
			int pickNum = sc.nextInt();

			//이미선택된 숫자인지  mark 에서 검사
			for(int y=0;y<5;y++) {
				for(int x=0;x<5;x++) {
					if(mark[y][x]==1) {
						if(bingo[y][x]==pickNum) {
							System.out.println("이미 입력된 숫자입니다.");
							continue;
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
						mark[pickY][pickX] = 1;
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