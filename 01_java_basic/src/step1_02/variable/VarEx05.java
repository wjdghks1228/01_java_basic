package step1_02.variable;

public class VarEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수의 생명주기
		
		
		
		int x = 10;
		
		if(true) {
			int y = 7;
			System.out.println(x);
			System.out.println(y);
			//System.out.println(z);     z선언은 아래 if 문에 가있기때문에 여기 if 문에서는 생명력이 없다
		}
		
		if(true) {
			int z = 3;
			System.out.println(x);
			//System.out.println(y);     y 선언은 위의 if문에 되있어서 생명력이 없다.
			System.out.println(z);
		}
		
		System.out.println(x);
		
		
	}

}
