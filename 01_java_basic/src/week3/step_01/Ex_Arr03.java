package week3.step_01;

public class Ex_Arr03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열이름.length -> 자동으로 방 갯수를 가져온다. --> int 값
		int[] arr = {10,20,30,40,50};
		// 문제1) 4의 배수만 출력
		// 정답1) 20 40
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%4==0) {
				System.out.print(arr[i]+"  ");
			}
		}
		// 문제2) 4의 배수의 합 출력
		// 정답2) 60
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%4==0) {
				sum+=arr[i];
			}
		}
		System.out.println();
		System.out.println(sum);
		// 문제3) 4의 배수의 개수 출력
		// 정답3) 2
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%4==0) {
				count++;
			}
		}
		System.out.println(count+"개");
	}

}
