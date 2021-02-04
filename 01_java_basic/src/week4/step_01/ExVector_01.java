package week4.step_01;

import java.util.Vector;

public class ExVector_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 컨트롤러를 구현 : vector : 가변배열 컨트롤러 
				int arr[] = {10,20,30,40,50};
				// int 하는 애는 자료형 값을 저장을 하는데 정수만 저장 
				for(int i = 0 ; i < arr.length; i++) {
					System.out.print(arr[i] + " "); 
				}
				//배열의 한계 --> vector 클래스를 사용해서 배열 크기를 조절한다 --> 구현 
				// int 타입으로 만들면 정수만 들어갈 수 있다 
				// 처음에 배열의 크기를 지정하면 그 배열의 길이는 고정 --> 변할 수 없다
				System.out.println();
				Vector<Integer> arr2 = new Vector<Integer>();
				arr2.add(10); // 값을 추가하고: 자동으로 배열의 길이가 1 증가 
				for(int i =0; i < arr2.size(); i++) {
					System.out.print(arr2.get(i) + " "); 
				}
				System.out.println();
				arr2.add(20); // 순서대로 배열에 추가되고 배열길이 1 증가 
				arr2.add(30);
				arr2.add(40);   // size() 사용해서 방길이 구함 
				for(int i =0; i < arr2.size(); i++) {
					System.out.print(arr2.get(i) + " ");
					                  // get을 사용해서 i 번째 방에 있는 값을 가져옴 
				}
				System.out.println();
			   arr2.remove(2); // 2번째 방에 있는 값을 삭제 자동으로 뒤에 있는 값들이 넘어옴 
			   // 배열길이 1 자동으로 감소 
				for(int i =0; i < arr2.size(); i++) {
					System.out.print(arr2.get(i) + " "); 
				}
				System.out.println();
				// 수정    (수정 위치 , 수정할 값 )
				arr2.set(3, 100) ;  
				for(int i =0; i < arr2.size(); i++) {
					System.out.print(arr2.get(i) + " "); 
				}
				System.out.println();
				 // 삽입 
				// add 함수에 그냥 값만 넣으면 순차적으로 값이 들어간다 
				// 근데 add(삽입할 인덱스 번호 , 삽입할 값) 을 넣으면 
				 arr2.add(1, 500);  // 자동으로 해당위치에 있는 값이 뒤로 빠짐
					for(int i =0; i < arr2.size(); i++) {
						System.out.print(arr2.get(i) + " "); 
					}
					System.out.println();


	}

}
