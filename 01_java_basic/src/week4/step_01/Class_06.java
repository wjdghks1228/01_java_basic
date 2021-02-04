package week4.step_01;

class TestReturn1 {
	void loop1() {
		int i = 0;
		// while(true) --> 무한 반복문
		// for(;;) --> 무한 반복문
		for (i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("종료");
				break; // 반복문 즉시 종료 
			}
		}
		System.out.println("i= " + i);
		System.out.println("메서드 종료");
      // return; void 에서는 return 생략이 가능하다 
	}
	void loop2() {
		int i = 0;
		// while(true) --> 무한 반복문
		// for(;;) --> 무한 반복문
		for (i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("종료");
				return; // 그 즉시 함수 종료 
			}
		}
		System.out.println("i= " + i);
		System.out.println("메서드 종료");
	}
}
public class Class_06 {
	public static void main(String[] args) {
		TestReturn1 tr = new TestReturn1();
		tr.loop1();
		tr.loop2();
	}
}