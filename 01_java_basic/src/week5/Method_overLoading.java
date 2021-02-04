package week5;

//매개인자 : 외부에서 주는 값
//매개변수 : 외부에서 온 값을 받는 변수

class Ex01 {

	//**************************issue*********************************
	//*******************METHOD OVERLOADING***************************
	// 매개 인자 매개변수가 다르다면 이름은 상관없다.
	//****************************************************************
	void add1( int x, int y , int z) {
		
	}
	
	// return type 없음
	void add1(int x, int y) {

	}
	//****************************************************************
	
	// return type 있음
	int add2(int x, int y) {
		// int x , int y --> add2의 지역변수 = 매개변수 : 매서드의 지역변수
		int res = x + y;
		return res;
	}

}

public class Method_overLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method type
		// return이 있는거 없는거, 외부값 == 매개변수 / 매개인자
		// return 이 없다 : void
		// return 이 있다 : return type + method

		// class call
		Ex01 e1 = new Ex01();

		// add1 call
		e1.add1(1, 200);

		// add2 call
		int res = e1.add2(100, 20); // 매개인자 : 외부에서 전달하는 값
		
		// return type 과 동일해야한다.
		System.out.println(res);
	}

}
