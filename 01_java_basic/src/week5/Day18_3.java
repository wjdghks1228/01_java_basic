package week5;

import java.util.ArrayList;
import java.util.Arrays;
public class Day18_3 {
	public static void main(String[] args) {
		          // 0  1 
		int arr[]= {10,20}; // new int[2]
		// arr[2] = 50; 오류가 난다 
		// 배열 한번 길이가 정해지면 수정이 불가능하다 
		System.out.println("===");
		System.out.println(Arrays.toString(arr));
		int size = arr.length;
		int temp[] = arr;
		arr = new int[size+1];
		for(int i =0; i < size ; i++) {
			arr[i] = temp[i];
		}
		arr[size] = 50;
		temp = null;
		System.out.println("===");
		System.out.println(Arrays.toString(arr));
		//콜렉션 
		// arraylist 클래스는 배열의 길이를 자동으로 수정
		// 해준다 
		//int 기본형 : 순수하게 값만 저장 : 값 비교 , 값 대입 , 연산자 
		 // int -> Integer 클래스 이름 사용 : int 사용하는 여러 기능들을 
		// Integer.parseInt("10") 문자를 숫자int 바꿔주는 기능들 : wrapper class 
		//ArrayList<클래스이름 >
		//double : 기본형 타입 Double : wrapper 클래스 
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		// int 정수만 들어가는 가변(길이가 변한다) 배열을 만들어 주는 것이 arraylist 
		System.out.println(arr2.size()); // arr.length 똑같은 기능을 함 
		System.out.println(arr2.toString());
		arr2.add(10);
		System.out.println("===");
		                    // 배열 안에 값 전부 출력 
		System.out.println(arr2.toString());
		arr2.add(20);
		System.out.println("===");
		System.out.println(arr2.toString());
		arr2.add(30);
		System.out.println(arr2.toString());
		arr2.remove(1); // remove 안에는 인덱스 번호 
		System.out.println(arr2.toString());
		//arr2.clear();// 모든 값 삭제 
		arr2.add(0, 100); // 값 삽입 : 
		// 0번째에 100을 넣어라 
		System.out.println(arr2.toString());
	}
}