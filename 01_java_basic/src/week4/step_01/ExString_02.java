package week4.step_01;

public class ExString_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "안녕하세요 반갑습니다"	;
		System.out.println(greeting.charAt(2));
		//charAt(x) : x번째 인덱스 값을 가져와달라.
		
		int num = 10;
		int num2 = 20;
		if(num == num2) {
			System.out.println("같습니다");
		}
		else {
			System.out.println("다릅니다");
		}
		
		String test = "테스트 1 ";
		String test2 = "테스트  ";
		
		if(test.equals(test2)) {
			System.out.println("같습니다");
		}
		else {
			System.out.println("다릅니다");
		}
		
		
		
		
		//정렬 compareTo
		String str1 = "abc";
		String str2 = "cde";
		String str3 = "fff";
		
		int rs1 = str1.compareTo(str2);
		//음수는 사전적으로 앞에 있는 단어다 str1이 str2보다
		int rs2 = str3.compareTo(str2);
		int rs3 = str3.compareTo(str3);
		
		System.out.println("rs1 = "+ rs1); //음수 -> str1이 str2 보다  사전적으로 앞에있다
		System.out.println("rs2 = "+ rs2); //양수 -> str3가 str2 보다 사전적으로 뒤에있다
		System.out.println("rs3 = "+ rs3); //0   -> 같다
	}
}
