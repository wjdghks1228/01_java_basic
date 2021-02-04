package project.no1;

import java.util.Scanner;

public class Project_Atm_arrControler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = { 10, 20 };
		boolean run = true;
		while (run) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[5]종료");
			System.out.println("메뉴 선택: ");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("삽입할 값 입력 : ");
				int value = scan.nextInt();
				int temp[] = new int[arr.length+1]; // 1 추가된 배열 크기 만들기 
				for(int i =0; i < arr.length; i++) {
					temp[i] = arr[i];  // 기존에 있던 값을 복사해서 새로운 방에 값 복사 해놓기 
				}
				temp[arr.length] = value;  // temp[마지막 인덱스] = 값 넣기 
				arr = temp; // 완성된 업데이트된 temp 배열의 주소를 arr 에 넣기 
				temp = null; // temp 값 초기화 --> arr만 arr의 주소값을 가지기 위해서 
			}else if(sel == 2) {
				// 인덱스로 삭제 
				System.out.println("삭제할 인덱스 입력 : ");
				int del_idx = scan.nextInt();
				if( del_idx <0 || del_idx >= arr.length) {
					System.out.println(" 유효하지않는 인덱스 입니다 ");
					continue;
				}
				int temp[] = new int[arr.length-1];
				int idx = 0;
				for(int i =0; i<arr.length; i++) {
					if (del_idx != i) {
						temp[idx] = arr[i];
						idx++;
						// i =0 -> idx = 0 
						// i = 1 -> idx = 1 
						// i=2 -> if 문 안들어옴 
						// i = 3 -> idx =2 
						// i = 4 -> idx = 3 
					}
				}
				arr = temp;
				temp = null;
			}else if(sel == 3) {
				if(arr.length ==0) {
					// 현재 값이 존재하지 않는다 
					continue;
				}
				System.out.println("삭제할 값을 입력하세요 ");
				int del_val = scan.nextInt();
				int del_idx = -1;
				for(int i =0; i < arr.length ; i++) {
					if(del_val == arr[i]) {
						del_idx = i;
						break;
					}
				}
				if(del_idx == -1) {
					System.out.println("해당 값이 존재하지 않습니다");
					continue;
				}
				int temp[] = new int[arr.length-1];
				int count = 0; // 배열에 값을 넣을때만 증가함 
				for(int i =0 ; i < arr.length; i++) {
				    if(del_idx != i) {
				    	temp[count] = arr[i];
				    	count++;
				    }
				}
				arr= temp;
				temp = null;				
			}else if(sel == 4) {
				System.out.println("삽입 인덱스 입력 : ");
				int idx = scan.nextInt(); 
				System.out.println("삽입 값 입력 : ");
				int val = scan.nextInt();
				int temp[] = new int[arr.length+1];
				int count = 0; 
				for(int i =0 ; i < temp.length; i++) {
					if(idx == i) {
						temp[i] = val;
					}else {
						temp[i] = arr[count];
						count++;
					}
				//	 System.out.printf("i =%d count = %d \n" , i , count);
					// i =0 count = 0 
					// i = 1 count =0 
					// i = 2 count = 1 
					//i = 3 count = 2 
				}
				arr = temp;
				temp = null;
			}else {
				break;
			}
		}
	}

}
