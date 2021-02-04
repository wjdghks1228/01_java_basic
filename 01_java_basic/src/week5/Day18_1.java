package week5;

class Ex09{
	int a;
	int b;
	int c; 
	// 메서드 오버로딩 : 이름이 같은 메서드를 사용하기 위해서는 매개변수가 반드시 갯수나 타입을 다르게 해야한다 
	void add(double y) {
		System.out.println("test");
	}
	int add(int x) {
		return x;
	}
	void printall(){
		System.out.printf("a=%d , b=%d ,c=%d \n" , a,b,c);
	}
	Ex09(){}  // 기본 생성자는 자동으로 이클립스에서 만들어 준다더라 -- > 근데 생성자 오버로딩을 하면 
	// 자동으로 안만들어 주기 때문에 new Ex09() 사용하려면 	Ex09(){} 사용해야함 
	// 이렇게 생성자를 오버로딩 할 수 있다 안에 매개 변수 값을 넣어서 
	Ex09(int a,int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	 void init() {
		 this.a = 10;
		 this.b = 20;
		 this.c = 30;
	 }
	 void init(int a, int b, int c ) {
		 this.a = a;
		 this.b = b;
		 this.c = c;
	 }
}
public class Day18_1 {
	public static void main(String[] args) {
		// 생성자  클래스이름 () 
		// 클래스 인스턴스 변수의 객체를 만들때 반드시 필요하다 
		Ex09 e1 = new Ex09();
		//            -------
		         //   생성자
		// 생성자 , 메서드랑 동일하다 호출을 해야지만 실행가능 
		// 생성자 
		// 반드시 클래스 이름으로 불러오고 리턴 타입 없다 
		// 오버로딩 : 같은 이름으로 메서드를 만들 수 있는거 
		// 생성자도 오버로딩이 가능하다 
		e1.printall();
		//e1.a = 10;
		//e1.b = 20;
		//e1.c = 30; 
		e1.init();
		e1.printall();
		Ex09 e2 = new Ex09(40,50,60);
		e2.printall();
		//생성자 오버로딩은 우리가 보통 바로 초기값을 넣고 싶을때 사용한다 
		Ex09 e3= new Ex09();
		e3.init(40,50,60);
		e3.printall();
	}
}