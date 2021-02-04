package book;
import java.util.ArrayList;
class Book {
	int b_no;
	String b_name;
	String r_Date;
	int id;
	public Book(int b_no, String b_name, String r_Date, int id) {
		super();
		this.b_no = b_no;
		this.b_name = b_name;
		this.r_Date = r_Date;
		this.id = id;
	}
}
class User {
	int id;
	int b_no;
	int r_day;
	public User(int id, int b_no, int r_day) {
		super();
		this.id = id;
		this.b_no = b_no;
		this.r_day = r_day;
	}
}
class rentManager {   // 0  1  2    3  4    5  6    7  8    9   10  11 
	                   //1  2   3   4  5    6   7   8   9   10  11  12
	int monthList[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
                      // 11       25        10 
	int[] checkDate(int month, int day, int reDay) {
		int mon = monthList[month - 1];
   //25+10 == > 35 
		if (day + reDay > mon) {
			month++;  // 12
			           // 35 - 30  = 5  
			day = (day + reDay) - mon;
		} else {
			day = day + reDay;
		}
		int calDate[] = new int[2];
		calDate[0] = month;
		calDate[1] = day;
		return calDate;
	}
	int calDate(int month, int day) {
		int mon = 0;
		for (int i = 0; i < month - 1; i++) {
			mon += monthList[i];
		}
		int all = mon + day;
		return all;
	}
	int countDay(int startMonth, int startDay, int endMonth, int endDay) {
		int rentday = calDate(startMonth, startDay);
		int returnday = calDate(endMonth, endDay);
		return returnday - rentday;
	}
}
public class Main {
	public static void main(String[] args) {
		String rentalData = "";
		rentalData += "책번호/책제목/대여날짜/회원번호\n";
		rentalData += "20122/연필로쓰기/2020-11-25/1001\n";
		rentalData += "40143/외국어 공부의 감각/2020-11-27/1003\n";
		rentalData += "54321/컴퓨터활용능력/2020-11-27/1041\n";
		rentalData += "26543/아무튼,외국어/2020-12-01/1034";
		String userData = "";
		userData += "회원번호/책번호/대여일수(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";
		ArrayList<Book> rentlist = new ArrayList<Book>();
		ArrayList<User> userList = new ArrayList<User>();
		int rentCnt = 0;
		int userCnt = 0;
		String[] rData = rentalData.split("\n");
		String[] uData = userData.split("\n");
		rentCnt = rData.length - 1;
		userCnt = uData.length - 1;
		for (int i = 0; i < rentCnt; i++) {
			String[] temp = rData[i + 1].split("/");
			// Book b1 = new Book(b_no, b_name, r_Date, id)
			int b_no = Integer.parseInt(temp[0]);
			String b_name = temp[1];
			String r_Date = temp[2];
			int id = Integer.parseInt(temp[3]);
			Book b1 = new Book(b_no, b_name, r_Date, id);
			rentlist.add(b1);
		}
		for (int i = 0; i < userCnt; i++) {
			String[] temp = uData[i + 1].split("/");
			// User u1 = new User(id, b_no, r_day);
			int id = Integer.parseInt(temp[0]);
			int b_no = Integer.parseInt(temp[1]);
			int r_day = Integer.parseInt(temp[2]);
			User u1 = new User(id, b_no, r_day);
			userList.add(u1);
		}
		for (int i = 0; i < userCnt; i++) {
			System.out.println(userList.get(i).id);
		}
		for (int i = 0; i < userCnt; i++) {
			System.out.println(rentlist.get(i).b_name);
		}
		rentManager rm = new rentManager();
		// 오늘은 12월10일 이라고했을때 연체자 이름 출력 
		             // 0123456789
		String today = "2020-12-05";
		                          //시작인덱스 , 끝인덱스 - 1 
		String m1 = today.substring(5, 7);
		                         //시작인덱스만 있으면 배열끝까지 
		String d1 = today.substring(8);
		int month = Integer.parseInt(m1);
		int day = Integer.parseInt(d1);
		System.out.printf("현재날짜 : %d월 %d일 기준 \n" , month,day );
		for(int i = 0; i < rentCnt; i++) {
			User u = userList.get(i);
			Book b = rentlist.get(i);
			// 렌트목록에 회원 아이디와 책 번호 그리고 회원이 빌린 목록중에 책번호와 회원이 일치할때만 비교 
			// 현재는 두 데이터를 맞춰났기 때문ㅇ에 가능 
			if(u.id == b.id && u.b_no == b.b_no) {
			String rentDay = b.r_Date;
            //시작인덱스 , 끝인덱스 - 1 
			String r_m = rentDay.substring(5, 7);
           //시작인덱스만 있으면 배열끝까지 
			String r_d = rentDay.substring(8);
			int r_month = Integer.parseInt(r_m);
			int r_day =  Integer.parseInt(r_d);
			int reDayCnt = u.r_day;
			int[] test = rm.checkDate(r_month, r_day, reDayCnt);
			int date = rm.countDay(month, day, test[0], test[1]);
			if(date < 0) {
				System.out.println(u.id + "님이 빌린 " + b.b_name +" 책이 " + (-date) +"일 연체되었습니다");
			}
			}
		}
	}
}