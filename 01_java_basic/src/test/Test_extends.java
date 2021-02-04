package test;
// 자식은 여러명일 수 있다 , 부모는 단 한명 
// extends 부모 클래스를 지정하는데 
// extends 는 단 한개의 부모클래스만 들수 있다 
/* 같은 클래스 내에서 같은 이름                          부모 - 자식클래스 사이에서 
   메서드 오버 로딩                        vs         메서드 오버롸이딩 (덮어쓰기 )
  메서드는 같은 이름 생성하는데                            부모클래스에 있는 메서드를 
  매개 변수값을 다른 타입, 갯수 변화를                 같은 이름 같은 매개변수 : 완전 일치한 메서드 
  줘서 같은 이름으로 호출                                    자식 클래스에서 내용만 바꿔치기 
 */
// 자바안에 모든 것들의 조상은 object 
// b의 부모클래스 , 상위클래스 
class A{
	int a = 100;
	int b= 200;
	int c= 300; 
	// 메서드 오버로딩 
	A(){}
	public A(int a, int b, int c) {
		super(); // 부모의 생성자 object :
		this.a = a; // 인스턴스 객체의 주소값이 this 
		this.b = b;
		this.c = c;
	}
	void print() {
		System.out.println("A클래스야 ");
		System.out.printf("a=%d b=%d c=%d \n" ,a,b,c );
	}
	   // oject 타입이 모든 자식의 부모인데 그 oject 타입 객체 안에있는 tostring 메서드 
	// 안에 내용만 객체 인스턴스에 따라서 바꿔주는 것 
	@Override
	public String toString() {
		return "A 안에 (a=" + a + ", b=" + b + ", c=" + c + ")";
	}
}
// a 를 확장한 클래스 b  
// b는 a의 자식 클래스 , 하위클래스 
class B extends A{
	// 자식은 간단하게 객체가 두개만들어 진다 
	// 본인 객체 주소--> this 
	// 부모객체 주소--> super 
	int a=400;
	int b=500;
	int c=600;
	// 메서드 오버 라이딩 
	void print() {
		System.out.println("b클래스야 ");
		System.out.printf("a=%d b=%d c=%d \n" ,a,b,c );
		System.out.println("부모는 a클래스야");
		super.print();
	}
	void printA() {
		// super 부모타입의 객체 주소가 들어있다 
		System.out.println(super.a);
	}
}
class C extends A {
	int aaa = super.a;
	int bbb = super.b;
	int ccc = super.c;
}
public class Test_extends {
	public static void main(String[] args) {
		A parent = new A();
		//parent.a = 10;
		System.out.println(parent.toString());
		//toString() 은 객체가 가지고 있는 값을 출력을 하는게 기본값 
		B child = new B();
		System.out.println(child.a);
		// 자식은 부모 모든것에 접근이 가능하다 
		// 메서드든 멤버 변수든 
		// 부모는 자식클래스에 있는 것 접근 불가능하다 
		// 그래서 자식이 부모보다 더 큰 범위의 값을 가지고 있다
	//	parent.print();
		//child.printA();		
		child.print();
		C child2 = new C();
		//child2.print();
	}
}