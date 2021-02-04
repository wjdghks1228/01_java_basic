package week4.step_01;

import java.io.FileWriter;
import java.io.IOException;

public class ExFileWritter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//파일 생성
		String fileName = "day14Ex.txt"; //파일이름생성.txt(파일 형식)
		FileWriter fw = null ; //객체 초기화
		
		try {
			
			fw = new FileWriter(fileName);
			fw.write("파일쓰기 성공");
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
			fw.close();
			
		}
		
	
		
	}

}
