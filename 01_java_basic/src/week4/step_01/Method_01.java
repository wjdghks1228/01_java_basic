package week4.step_01;

//메서드 : 함수 
//메서드의 기본 구조 
//1) void 
//2) 메서드 이름 ():
//3){ } 메서드 영역 
class Ex66{
	// 메서드 하나당 한가지 기능을 구현하는게 정석 
	/* 메서드 구조 4가지 
	 1. 유산이 있는애 --> 리턴타입이 있다 : 타입은 자유롭게 사용가능 : int double int[] .. 모든 자료형 타입 리턴가능 
	 2. 유산이 없는애 --> 리턴타입 없다 : void 
	 3. 외부에서 값을 받아오는애 --> () 안에 값이 있다 
	 4. 외부에서 값을 안받는 애 --> 빈 가로 () 를 띈다 
	 종류 4가지 
	 1. 유산이 없고 외부에서 값을 안받는애 
	 2. 유산이 없고 외부에서 값을 받는애 
	 3. 유산이 있고 외부에서 값을 안받는애
	 4. 유산이 있고 외부에서 값을 받는애 
	*/
	//  1. 유산이 없고 외부에서 값을 안받는애
	void sayHello() {
		System.out.println("안녕");
		System.out.println("여기는 ex04에 메서드야 ");
	}
}


public class Method_01 {
	
	
	public static void main(String[] args) {

		//메서드를 호출  : 메서드 이름 () 
				Ex66 e4 = new Ex66(); // 객체 인스턴스화 : 그 클래스의 기능을 사용하는 공장을 만들었다 
				e4.sayHello();
				e4.sayHello();
				e4.sayHello();
				e4.sayHello();
				//Random rd= new Random();
			  //  System.out.println("안녕하세요 ");
			}
		
		
		
	}


