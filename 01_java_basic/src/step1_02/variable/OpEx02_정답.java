package step1_02.variable;

public class OpEx02_정답 {

	public static void main(String[] args) {
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		System.out.println(1000 - 200);
		System.out.println("잔돈 = " + (1000 - 200) + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		System.out.println("문제1");
		int monthlyPay = 100;
		int yearPay = monthlyPay*12;
		double realYearPay = (yearPay - (yearPay*0.1));
		System.out.println("연봉은 = "+ realYearPay);
		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		System.out.println("문제2");
		int score1 = 30;
		int score2 = 50;
		int score3 = 4;
		int average = (score1+score2+score3)/3;
		System.out.println("평균은 = "+average);
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		System.out.println("문제3");
		int row = 3;
		int col = 6;
		int triangleArea = (row*col)/2;
		System.out.println("삼각형의 넓이 : "+ triangleArea);
		
		//문제4) 100초를 1분 40초로 출력
		System.out.println("문제4");
		int sec = 100;
		System.out.println(sec+"초"+"는 "+sec/60+"분 "+sec%60+"초");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수 출력
		//정답5) 500원(1개), 100원(3개)
		System.out.println("문제5");
		int pocket = 800;
		int coin500 = pocket/500;
		int coin100 = (pocket - (500*coin500))/100;
		System.out.println("500원의 개수는 "+ coin500+"개");
		System.out.println("100원의 개수는 "+ coin100+"개");

	}

}
