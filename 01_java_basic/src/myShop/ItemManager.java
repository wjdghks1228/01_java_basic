package myShop;
import java.util.ArrayList;
import java.util.Scanner;
public class ItemManager {
  // 아이템에 관련된 기능들만 있는 클래스 
	Scanner sc = new Scanner(System.in);
	ArrayList<Item> itemlist = new ArrayList<Item>(); //전체 아이템 목록 
	// 길이가 알아서 늘어났다가 줄어드는 클래스 배열 : item 타입만 들어가는 
	// 주의! 아직 아이템 객체 안만들었다 new Item();
	// Item itemlist[] = new Item[100]; 클래스배열 
	ArrayList<String> category = new ArrayList<String>();// 전체 카테고리 목록 
	// 초기값
	void init() {
		category.add("과자"); //0
		category.add("과일"); //1
		category.add("음료"); //2
		category.add("육류"); //3 
		//category[0] 이렇게 해야지 배열에서 0번째 방에 있는 값을 가져온다 
		//arraylist  어레이리스트배열 이름.get(인덱스 번호)	
		Item i1 = new Item("새우깡" , 1000, category.get(0)); // 이때 아이템 객체 생성 
		itemlist.add(i1);
		Item i2 = new Item("포도" , 6000, category.get(1));
		Item i3 = new Item("봉봉" , 500, category.get(2));
		Item i4 = new Item("돼지등심" , 12000, category.get(3));
		itemlist.add(i2);
		itemlist.add(i3);
		itemlist.add(i4);
		for(int i =0; i < itemlist.size(); i++) {
               System.out.println(itemlist.get(i).toString());
		}
	}
	// new ItemManager 객체 만들때 실행 
	ItemManager(){
		// 생성자 안에는 초기 설정 값들을 넣어준다 , 
		init(); // itemManger 객체를 만들면 자동으로 init 메서드 호출 
	}
	// addItem()
	//deleteItem()
	//addcategory()
	//deleteCategory() 
}