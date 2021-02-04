package week2.stack;

import java.util.Random;
import java.util.Scanner;

public class Num_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd = new Random();
		int randNum = rnd.nextInt(50)+1;
		int count=0;
		//10의자리 369 검출
		if(randNum <= 10) {
			if(randNum==3 || randNum==6 || randNum==9) {
				count++;
			}		
		}
		//1의자리 369검출
		else {
			if(randNum/10==3) {
				count++;
			}
			if(randNum%10==3||randNum%10==6||randNum%10==9) {
				count++;
			}
		}
		//출력
		System.out.println(randNum);
		if(count==1) {
		System.out.println("짝");	
		}
		else if(count==2) {
			System.out.println("짝짝");
		}
		else if(count==0) {
			System.out.println(randNum);
		}
		count=0;
	}

}
