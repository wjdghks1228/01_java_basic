package week4.step_01;

import java.io.FileWriter;

public class ExFileOpenClose_N02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		
		String[] names = { "momk", "megait", "github" };
		String[] pws = { "1111", "2222", "3333" };
		int[] moneys = { 20000, 30000, 40000 };
		
		String fileName = "fileTest02.txt";
		
		
		//int string 으로 변환
		String data = "";
		for(int i=0;i<moneys.length;i++) {
			data += moneys[i]+"";
			if(i<(moneys.length - 1)) data += "/";
		}
		
		//realData 에 string /없이 값만 배열로 분리
		String[] realData = data.split("/");

		
		
		FileWriter fw = null; //객체 초기화
		
		try {
		
			fw = new FileWriter(fileName);
			for(int i=0 ;i<3; i++) {

				fw.write(names[i]);
				fw.write("/");
				fw.write(pws[i]);
				fw.write("/");
				fw.write(realData[i]);
				fw.write("\n");
				
				
			}
			
			fw.close();
			
		}catch(Exception e	) {
			
			e.printStackTrace();
			
		}
		
	}

}
