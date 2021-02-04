package week4.step_01;

public class ExString_N2_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1단계
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		System.out.println("문제 1 : 총점 출력");
		String str = "11/100/89";

		// str data분리
		String data[] = str.split("/");

		int[] arr = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			arr[i] = Integer.parseInt(data[i]);
		}

		// 총점 계산
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("총점은 = " + sum);
		System.out.println();

		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		System.out.println("문제2 : 문자열로 연결");
		int[] scores = { 11, 100, 89 };
		String text = "";

		for (int i = 0; i < scores.length; i++) {
			text += scores[i] + "";
			if (i < scores.length - 1) {
				text += '/';
			}
		}

		System.out.println(text);
		System.out.println();
		// 2단계
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		System.out.println("문제2_2 : 사람 성적 분리");
		String str2 = "김철수/87,이만수/42,이영희/95";
		String[] name = new String[3];
		int[] score = new int[3];

		// 사람별로 분리
		String dataPerson[] = str2.split(",");

		// 이름 성적 분리
		for (int i = 0; i < dataPerson.length; i++) {
			String nameScore[] = dataPerson[i].split("/");
			name[i] = nameScore[0];
			score[i] = Integer.parseInt(nameScore[1]);
		}

		// 출력
		System.out.print("이름은 : ");
		for (int i = 0; i < 3; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		System.out.print("성적은 : ");
		for (int i = 0; i < 3; i++) {
			System.out.print(score[i] + "    ");
		}
		System.out.println();

		System.out.println();

		// 문제 2) 사전 순으로 이름 정렬
		// int rs1 = str1.compareTo(str2);
		System.out.println("문제3 : 사전 순으로 이름 정렬");

		String[] names = { "홍길동", "김유신", "마동석", "자바킹", "서동요" };
		String temp;
		int compareResult;

		for (int i = 0; i < names.length - 1; i++) {
			for (int y = i + 1; y < names.length; y++) {
				if ((compareResult = names[i].compareTo(names[y])) > 0) {
					temp = names[i];
					names[i] = names[y];
					names[y] = temp;
				}
				
			}
		}

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}

	}

}
