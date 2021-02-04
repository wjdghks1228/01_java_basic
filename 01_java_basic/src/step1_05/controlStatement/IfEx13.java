package step1_05.controlStatement;

import java.util.Random;

public class IfEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 랜덤 라이브러리 (if 와 관련 없음)
		 * 
		 * */
		
		Random ran = new Random();
		int rNum1 = ran.nextInt(10); //0부터 (10-1) 까지
									//0부터 10개가 나온다
		System.out.println(rNum1);
		
		//100부터 200사이의 랜덤값
		int rNum2 = ran.nextInt(101); // 0부터 100까지
		int rNum3 = ran.nextInt(101) + 100; // 100부터 200까지
		
		//-3~3 까지
		int rNum4 = ran.nextInt(7) - 3; //-3 ~ 0
	}

}
