package week3.step_01;

public class Ex_drr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0 ;

		int[][] arr = new int[3][3];
		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		for(int y=0;y<3;y++) {
			for(int x=0;x<3;x++) {
				sum += arr[y][x];
			}
		}
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
	}

}
