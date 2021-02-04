package week2.stack;

public class Loop_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1 ;
		int count=0;
		while(true) {
			if(i == 8 ) {
				System.out.print(i+" ");
				break;
			}
			count++;
			i*=2;
		}
		System.out.println();
		System.out.println("i값은 = "+ i); //8
		System.out.println("count 값은 = "+ count); //3
	}

}
