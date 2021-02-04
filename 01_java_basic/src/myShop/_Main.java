package myShop;
import java.util.Scanner;
//메인
public class _Main {
	public static void main(String[] args) {
		ItemManager im = new ItemManager();
		//im.init();
		UserManager um = new UserManager();
		System.out.println("아이디: " +um.userList.get(2).getId());
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 ");
		String id = sc.next();
		int check = um.checkId(id);
		if(check == -1) {
			System.out.println("존재하지 않는 아이디 입니다");
		}else {
			System.out.println("어서오세요");
			System.out.println("아이디: " +um.userList.get(check).getId());
		}
	}
}