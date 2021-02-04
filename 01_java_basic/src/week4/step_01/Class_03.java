package week4.step_01;


class Ex05{
	          //매개인자 --> 매개 :서로다른 곳에 있는 애를 연결 
	 //2. 유산이 없고 외부에서 값을 받는애 
	void add(int x ,int y ) {
		// int x int y add 지역변수 : 초기값 가져야지만 사용할 수 있다 
		System.out.printf("%d + %d =  %d \n" , x,y,(x+y) );
	}
}
public class Class_03 {
	public static void main(String[] args) {
        Ex04 e4 = new Ex04();
        e4.sayHello();
        int x = 10; // 4byte
        int y = 20;
        double num = 12.5; // 8byte
         byte z = 10; // 1byte 
         char a = 't'; // 2byte 
		 Ex05 e5 = new Ex05();
		 e5.add(10,20);
		// e5.add();
	}
}