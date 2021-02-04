package week4.step_01;

//Class 를 만드려면 Class 클래스 키워드 + 클래스 이름(대문자로 시작) + {}
class MyClass{
 
	int dnum;
	double fnum;
	char a;
	String name;
	
}

public class Class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 --> 값을 한개 저장하는 애
		//기본형인 변수 -> 실질적으로 값이 들어가 있음
		//int double float short byte char boolean long
		
		int num =10;
		//배열은 변수를 한개 저장 못하니까 여러개 저장하기 위해서 사용
		int numarr[]= new int [10];
		
		numarr[0] = 10;
		numarr[1] = 20 ;
		//numarr[2]= "30 "; 배열의 한계 : 같은 자료형값 이외에는 초기화 할수 없다.
		
		//&&&&&&&                  CLASS               &&&&&&&
		//여려개 자료형을 배열로 저장하고 싶다 -- > CLASS
		//class : 사용자 지정 자료형 타입
		
		MyClass mc = new MyClass();
		            //참조형변수
		            //heap에 생성되기 때문에 new 를 쓸 것!
					//heap에는 숫자형이면 0 초기화 문자값이면 null로 초기화된다.
					//MyClass 같은 경우는 0, 0 , null, null 로 초기화 됨.
		
		mc.dnum = 10;
		mc.fnum = 3.14;
		mc.a = 't';
		mc.name = "홍길동";
			
		
		
	}

}
