package week4.step_01;

public class ExString_03_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//split : 원하는 조건 주고 그기준으로 data 분리할때 사용한다.
		String jubun  ="19961228-10101010";
		String[] data = jubun.split("-");
		System.out.println(data[0]);
		System.out.println(data[1]);
		
		String greeting = "안녕/하/세/요/반/갑/습니다"	;
		String [] data2 = greeting.split("/");
		for(int i=0;i<data2.length;i++) {
			System.out.println(data2[i]);
		}
		System.out.println(data2.length);
		
	}

}
