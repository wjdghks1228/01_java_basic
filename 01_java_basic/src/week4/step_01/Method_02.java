
package week4.step_01;

import java.util.Random;

class Ex04{
	//  1. 유산이 없고 외부에서 값을 안받는애
	void sayHello() {
		System.out.println("안녕");
		System.out.println("여기는 ex04에 메서드야 ");
	}
	//메서드는 호출이 되면 stack 쌓이고 
	// 메서드 영역이 끝나면 stakc에서 사라진다 
}

public class Method_02 {
	/*	
	   메스드 / 클래스 / 객체 를 사용하는 이유 
	    반복적으로 사용하기 위해서 , 코드 효율성 , 간결성, 생산성을 위해서 
	*/
	//메서드를 호출  : 메서드 이름 () 
	public static void main(String[] args) {
		Random ran = new Random();
		Ex04 e4 = new Ex04(); // 객체 인스턴스화 : 그 클래스의 기능을 사용하는 공장을 만들었다 
		e4.sayHello();
		e4.sayHello();
		e4.sayHello();
		e4.sayHello();
		Random rd= new Random();
		//  System.out.println("안녕하세요 ");
		//rd.sayHello();
		
	}
}
