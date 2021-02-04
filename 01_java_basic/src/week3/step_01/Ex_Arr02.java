package week3.step_01;

public class Ex_Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,30,40,50};
		/*위와 같은형태
		 * int arr[] = new int [5];
		 * arr[0]=10;
		 * arr[1]=20;
		 * arr[2]=30;
		 * arr[3]=40;
		 * arr[4]=50;
		 * */
		
		//반복문을 사용한 배열에 값대입하는 예제
		int arr2[]= new int[8];
		//2,4,,8,6,8,10;
		int i=0;
		int a =1;
		//boolean run =true;
		/*boolean 을 사용할경우는 if문안에 false종료문 넣어도 바로 반복문 탈출이 아닌 끝까지 내려가고 끝난다.*/
		System.out.println("WHILE문 출력");
		System.out.println();
		while(true) {
			if(i==8) {
				break;
			}
			arr2[i]=2*a;
			System.out.print("arr2["+i+"] : "+arr2[i]+"   ");
			i++;
			a++;
		}
		System.out.println();
		System.out.println("FOR문 으로 출력");
		System.out.println();
		for(int k=0; k<8; k++) {
			System.out.print("arr2["+k+"] : "+arr2[k] + "   ");
		}
		System.out.println("반복문 종료");
	}

}
