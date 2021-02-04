package week4.step_01;

class Ex06 {
	
	//return 값이 있으면 3개가 일치해야함
	//1. 함수이름 앞에 있는 리턴타입
	//2. 함수 영역 안에 있는 리턴타입
	//3. 함수 호출한 위치에서 return 받아주는 애
	
	int setNum() {
		int a =10;
		int b = 20;
		int result = a + b;
		return result ;  //유산값을 넘긴다
	}
}

public class Class_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex06 e6 = new Ex06();
		int x = 10;
		int y = 20;
		int result = e6.setNum(); //유산값을 받을 변수가 필요하다

		System.out.println(result);
	}

}
