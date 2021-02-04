package project.no1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Project_Atm_fileOpenClose_No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		String fileName = "fileTest02.txt";
		int size = 0;
		String data = "";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();
				// System.out.println(line);
				if (line == null) {
					break;
				}
				data += line + ",";
			}
			// System.out.println();
			String temp[] = data.split(",");
			size = temp.length; // 줄의 갯수
			System.out.println(temp.length);
			ids = new String[size];
			pws = new String[size];
			moneys = new int[size];
			for (int i = 0; i < size; i++) {
				String info[] = temp[i].split("/");
				ids[i] = info[0];
				pws[i] = info[1];
				moneys[i] = Integer.parseInt(info[2]);
			}
			System.out.println("불러오기 성공 ");
		} catch (Exception e) {
		}
		for (int i = 0; i < size; i++) {
			System.out.printf("id: %s pw:%s money: %d \n", ids[i], pws[i], moneys[i]);
		}
	}

}
