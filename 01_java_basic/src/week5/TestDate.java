package week5;

import java.awt.font.TransformAttribute;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		// Fri Jan 29 15:13:12 KST 2021 new 해서 객체를 만들때 시간이다.
		
		//2021년 1월 29일로 출력을 하고싶다
		
		//1. date format을 변경해주는 방법  (대소문자 구분해야함!)
		
		// yyyy  -> 년 데이터를 받아온다
		// MM    -> (대문자여야함 소문자mm은 분을 의미) -> 한국
		// MMM   -> 영어로 월을 가져옴
		// dd    -> 일데이터
		// hh    -> 시간데이터
		// HH    -> 24시간 시간데이터
		// mm    -> 분 데이터
		// E     -> 요일 데이터
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		                                           //2021년 1월 29일
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMM.dd(E) hh:mm");
													//1월.29(금) 03:18
		System.out.println(sdf2.format(date));
		
		String today = date.toString(); 
	}

}
