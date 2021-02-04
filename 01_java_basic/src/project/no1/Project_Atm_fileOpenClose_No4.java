package project.no1;

public class Project_Atm_fileOpenClose_No4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] student = {
				{"aaa","신촌","1001"}, 
				{"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , 
				{"ddd" , "강동","1004"}};
		String[][] score = {
				{"1001" ,"10" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};
		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 
		int avg[] = new int[student.length];
		for(int i =0; i < score.length; i++) {
			int total =0;
			for(int k=0; k < score.length-1; k++) {
				total += Integer.parseInt(score[i][k+1]);
			}
			avg[i] = total; 
		}
		int max_val = avg[0];
		int max_idx = 0;
		for(int i =0; i < avg.length;i++) {
			if(max_val < avg[i]) {
				max_val = avg[i];
				max_idx = i;
			}	
			System.out.printf(" 이름 : %s 총점 : %d \n" , student[i][0] , avg[i] );
		}
		System.out.println("1등학생은 " + student[max_idx][0] );
	}

}
