package myShop;
import java.util.ArrayList;
public class UserManager {
	ArrayList<User> userList = new ArrayList<User>();
	int userlog = -1 ; // -1 로그아웃 상태 
	UserManager(){
		init(); // UserManger 클래스 객체 생성하면 user 다섯명 자동 등록 
	}
	// 초기 유저 5명 생성 
	void init() {
		User u1 = new User("1111","1234",10000);
		User u2 = new User("2222","1234",20000);
		User u3 = new User("3333","1234",30000);
		User u4 = new User("4444","1234",40000);
		User u5 = new User("5555","1234",50000);
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
	}
	 // 유저 생성 - 회원가입
	 // 유저 삭제 - 회원 탈퇴
	 // 로그인 
	int checkId(String id) {
		for(int i =0; i < userList.size(); i++) {
			if(userList.get(i).getId().equals(id)) {
			    return i; // userlist 몇번째에 있는 user에 번호 
			}
		}
		return -1; // 해당 아이디를 찾지 못했을때 -1를 유산으로 넘겨줌 
	}
}