package week2.stack;

import java.util.Scanner;

public class Loop_Ex_31 {

	/* # 베스킨라빈스31
	 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다. --> 범위 벗어나면 예외 
	 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
	 * 3. br이 31을 넘으면 게임은 종료된다.
	 * 4. 승리자를 출력한다.
	 * 
	 * 예)
	 *  
	 * 1턴 : p1(2)	br(2)
	 * 2턴 : p2(1)	br(3)
	 * 3턴 : p1(3)	br(6)
	 * ...
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int br=0;
		boolean brgame = true;
		while(brgame) {
		System.out.println("p1차례");
		int p1 = sc.nextInt()	;
		if(p1>=4 || p1<=0) {
		 System.out.println("범위오류");
		 continue;
		}
		br += p1;
		if(br>=31) {
			System.out.println("p1승리");
			
			break;
		}
		System.out.println("p2차례");
		int p2 = sc.nextInt()	;
		if(p2>=4 || p2<=0) {
			 System.out.println("범위오류");
			 br = br - p1;
			 continue;
			}
		br += p2;
		if(br>=31)	{
			System.out.println("p2승리");
			brgame = false;
		}
		
		System.out.println("현재 총 값은  = " + br);
		
		}
	}

}
