package week4.step_01;

//class MyClass -> ERROR : class는 전 eclipse내에서 적용되므로 01에서 이미 MyClass 사용되어서 정의가 안됨.


public class Class_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc = new MyClass();
		mc.dnum = 10;
		mc.fnum = 3.145;
		mc.a = '4';
		mc.name = "김정환";
		
		System.out.println(mc.dnum);
		System.out.println(mc.fnum);
		System.out.println(mc.a);
		System.out.println(mc.name);
	}

}
