package week4.step_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExFileReading_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "day14Ex.txt"	;
		
		FileReader fr = null;     //초기값 : 공장이 만들어 지기 전 : 공장부지 main 안에서 fr
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(fileName);  //new heap 메모리에 공장 생성 fr 공장의 주소
			br = new BufferedReader(fr);
			
			//한줄읽기
			//String data = br.readLine(); //버퍼에서 한줄을 읽어오겠다.   : 공장의 주소를 통해서 공장안에 있는 기능을 사용할 수 있음
			//System.out.println(data);

			//전체읽기
			String data = "";
			while(true) {
				String line = br.readLine(); //한줄씩읽어와
				if(line == null) {
					break;
				}
				// data+=line; //data = data + line;  --> 단 이거는 쭉 한줄로 이어서 나옴
				data+=line + "\n"; //띄어쓰기 추기해줌으로써 띄어쓰기 까지 되어서 출력
			}
			
			System.out.println(data);
			
			
			
		}catch(Exception e) {
			
			System.out.println("파일이 존재하지 않음 ");
			e.printStackTrace();
			
		}finally {
			
			try {
				if (fr != null)	  //파일이 존재하면 
					fr.close();		//닫아라
			} catch (IOException e) {

			};
			try { 
				if(br != null) {	//버퍼가 존재하면
					br.close();			//닫아라
				}
			}catch(IOException e) {
				
			}
			;

		}
	}

}
