package step1_06.loop;

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

//2021_01_29 TIME 19 : 07 ~ 19 : 27
public class LoopEx12_문제 {

	public static void main(String[] args) {
		int i = 1;
		boolean isRun = true;
		while(isRun) {
			if( i == 51)  isRun = false;
			if(i < 10 ) {
				if( i % 3 == 0 ) {
					System.out.println("짝");
				}
				else {
					System.out.println(" " + i + " ");
				}
				i++;
			}
			else if(i >= 10) {
				int countTen = i/10;
				int countOne = (i%10);
				//1의자리 짝 확인
				if(countOne ==3 || countOne == 6 || countOne == 9) {
					System.out.println("짝");
				}
				else if(countOne%3 == 0 && countTen == 3) {
					System.out.println("짝짝");
				}
				else {
					System.out.println(i);
				}
				i++;
			}
		}
	}

}
