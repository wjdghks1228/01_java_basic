package step1_02.variable;

public class VarEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * # 변수 ( variable )
		 * 
		 * - 단 하나의 값을 저장할 수 있는 메모리 공간
		 * 
		 * 1) 변수의 선언 그리고 초기화
		 * 
		 * 변수의 선언 : int nData; // 메모리 공간 할당 변수의 초기화 : nData = 0; // 값 저장
		 * 
		 * 
		 * 2) 변수의 선언과 동시에 초기화
		 * 
		 * int nData = 0;
		 * 
		 * 
		 * 3) 변수의 특징
		 * 
		 * 3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ] 3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다. //*
		 */
		// 1. 정수 : Integer (int)
		System.out.println("정수값 확인");
		int nData; // 변수의 선언(쓰레기데이터가 저장돼있다)
		nData = 10; // int nData = 10;
		System.out.println(nData);
		System.out.println();
		
		// 2. 실수 : double
		System.out.println("실수값 확인");
		double fData = 3.14;
		System.out.println(fData);
		System.out.println();
		
		// 3. 문자 : 1개-> Character(char)
		System.out.println("문자 1개  확인");
		char cData1 = 'a';
		char cData2 = '가'; // 단일 문자는 ' ' single cutter
		System.out.println(cData1);
		System.out.println(cData2);
		System.out.println();
		
		// 4. 문자열 : String
		System.out.println("문자열  확인");
		String strdata = "java"; // 문자열은 " " double cutter
		System.out.println(strdata);
		System.out.println();
		
		// 5. 참과 거짓 : boolean (true or false)
		System.out.println("논리식 확인");
		boolean isChecked = true;
		boolean isChecked2 = false;
		System.out.println(isChecked);
		System.out.println(isChecked2);
		System.out.println();
		
		//변수 활용
		int tempData = 10;
		// int tempData =9; error : 변수명은 고유해야만 한다.
		tempData = 9; // tempData 값 변경
		System.out.println(tempData);
		System.out.println();
	}

}
