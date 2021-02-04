package week3.step_01;

public class Ex_Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열
		int num = 10;
		num = 20;
		System.out.println("num=" + num);
		//배열 : int []arr;    int arr[];
		//[]붙으면 배열
		//null-> 주소값이 비어있다.
		int arr[] = null; //stack 에 main안에 메모리 생성 
		arr = new int[5]; //heap 에 메모리 생성
		// 				int arr[] = new int [5];
		//형식 : 	자료형   배열이름[]  =  new  자료형  [배열크기];
		int arr2[] = new int[6];
		//new int[6] : 먼저 6개 방을 만들고
		//arr2[]에 그 주소값을 보내준다.
		/*
		 * 기본변수 : 값을저장, 반드시 초기값을 같는다.
		 * 참조변수 : 주소값을 저장, 숫자값이면 자동으로 0, 숫자가 아닌값은 NULL로 초기화한다.
		 * */
		
		//메모리 ->  stack & heap : 자바에서는 모든 참조변수는 HEAP에 만들어준다 
		//stack -->  main안에 변수 메모리 생성
		//heap  -->  new 라는 키워드가 붙으면 HEAP에 만들어진다!!!!!!!
		

	}

}
