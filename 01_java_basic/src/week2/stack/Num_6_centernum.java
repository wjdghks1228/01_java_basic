package week2.stack;

import java.util.Random;
import java.util.Scanner;

public class Num_6_centernum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("가운데 숫자 맞추기 게임");
		Random rnd = new Random();
		int rndnum = rnd.nextInt(101)+150;
		System.out.println("제시값 = "+rndnum);
		int firstStep = rndnum/100;
		//System.out.println(first);
		int secondStep = rndnum - (firstStep*100);
		//System.out.println(second);
		int thirdStep = secondStep%10;
		//System.out.println(third);
		int fInal = secondStep - thirdStep;
		System.out.println("가운데 자리 값 = " + (fInal/10));
	}

}
