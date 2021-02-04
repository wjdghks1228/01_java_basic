package project.no1;

import java.io.FileWriter;

public class Project_Atm_fileOpenClose_No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fileTest01.txt 안에  김철수/20,이만수/30,이영희/40 저장 
				//파일 저장 1 번문제 
				String[] names = { "김철수", "이만수", "이영희" };
				int[] ages = { 20, 30, 40 };
				String data= "";
				for(int i =0; i < names.length; i++) {
					if(names.length-1==i) {
						data+=names[i] + "/" + ages[i];
					}else {
						data+=names[i] + "/" + ages[i] +",";
					}
				}
				String fileName = "fileTest01.txt";
				FileWriter fw = null;
			   try {
				   fw = new FileWriter(fileName);
				   fw.write(data);
				   fw.close();
			   }catch(Exception e) {
			   }
				System.out.println("파일 생성 완료");
	}

}
