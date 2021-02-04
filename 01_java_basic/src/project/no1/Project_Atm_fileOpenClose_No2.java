package project.no1;

import java.io.FileWriter;

public class Project_Atm_fileOpenClose_No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "momk", "megait", "github" };
		String[] pws = { "1111", "2222", "3333" };
		int[] moneys = { 20000, 30000, 40000 };
		String fileName = "fileTest02.txt";
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		String data = "";
		for (int i = 0; i < names.length; i++) {
			data += names[i] + "/" + pws[i] + "/" + moneys[i] + "\n";
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
		} catch (Exception e) {
		}
		System.out.println("파일 생성 완료");
	}

}
