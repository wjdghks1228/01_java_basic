package week4.step_01;

import java.io.FileWriter;

public class ExFileOpenClose_N01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fileTest01.txt 안에  김철수/20,이만수/30,이영희/40 저장 
		//파일 저장 1 번문제 
		String[] names = { "김철수", "이만수", "이영희" };
		int [] ages = { 20, 30, 40 };
		
		//int string 으로 변환
		String data = "";
		for(int i=0;i<3;i++) {
			data += ages[i]+"";
			if(i<2) data += "/";
		}
		
		//realData 에 string /없이 값만 배열로 분리
		String[] realData = data.split("/");

		
		String fileName = "fileTest01.txt";
		FileWriter fw = null; //객체 초기화
		
		
		try {
			
			fw = new FileWriter(fileName);
			for(int i=0 ;i<names.length;i++) {
				fw.write(names[i]);
				fw.write("/");
				fw.write(realData[i]);
				fw.write(",");
			}
			fw.write("\n");
			fw.close();
			
			
			
		}catch(Exception e ) {
			
			e.printStackTrace();
		}
		
	}

}
