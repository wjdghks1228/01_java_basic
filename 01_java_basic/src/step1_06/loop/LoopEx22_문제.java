package step1_06.loop;


// # 삼각형 그리기


//2021_02_02 TIME --> 20:26 ~ 
public class LoopEx22_문제 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i=0; i<9; i++) {
			System.out.print("#");
			if (i%3 == 2) System.out.println();
		}
		
		System.out.println();
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		System.out.println("문제1");
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0; j <= i ; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		//0 1 2
		//3 4 5
		//6 7 8
		System.out.println("answer 2");
		for(int i = 0; i < 3; i++) {
			for(int j = 2-i; j<3; j++) {
			}
			System.out.println();
		}
		
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		System.out.println("문제 3");
		for ( int i = 0 ; i < 3; i++) {
			for (int j =2 ; j >=i; j-- ) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */

		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */

		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */

		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */

		
		
	}
}
