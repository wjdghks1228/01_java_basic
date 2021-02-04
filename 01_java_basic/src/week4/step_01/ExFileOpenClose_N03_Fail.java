package week4.step_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExFileOpenClose_N03_Fail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "fileTest02.txt";
		
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			//우선 데이터 string 으로 전체받기
			String data = "";
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				
				data += line + "\n";    //한줄씩 받아온다
				
			}
			
			System.out.println(data);
			
			//data split 하기
			System.out.println("/ split");
			String splitData[] = data.split("/");
			for(int i=0; i<splitData.length;i++) {
				System.out.print(splitData[i]+ " ");
			}
			System.out.println();
			
			//split data 정수화 시키기
			int arrSplitData[]= new int [splitData.length];
			for(int i=0 ;i< splitData.length; i++) {
				
				arrSplitData[i]=splitData[i].charAt(i);
				System.out.print(arrSplitData[i]+" ");
			}
			

			
			
			
		}catch(Exception e	) {
			
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
