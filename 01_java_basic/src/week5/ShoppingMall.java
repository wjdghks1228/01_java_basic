package week5;

import java.util.Scanner;
class ShoppingMall{
	String[][] shop = new String[100][2];
	int cateCnt;
	int itemCnt; 
	String[] itemList;
	String[] cateList;
	Scanner charScan = new Scanner(System.in);
	Scanner intScan = new Scanner(System.in);
	
	

	void printMenu() {
		System.out.println("[관리자 모드]");
		System.out.println("[1]카테고리 관리");
		System.out.println("[2]아 이 템  관리");
		System.out.println("[3]전체품목 출력");
		System.out.println("[4]나가기");
	}
	void categoryMenu() {
		System.out.println("[카테고리 관리 ]");
		System.out.println("[1]카테고리 추가 ");
		System.out.println("[2]카테고리 삭제 ");
		System.out.println("[3]카테고리 정렬(갯수 순으로)");
		System.out.println("[4]뒤로");
	}
	void itemMenu() {
		printCateList();
		System.out.println("[ 아이템 관리 ]");
		System.out.println("관리할 카테고리를 선택(이름): ");
		String name = charScan.next();
		System.out.println("[1]아이템 추가 ");
		System.out.println("[2]아이템 삭제  ");
		System.out.println("[3]아이탬 정렬(이름 순으로)");
	}
	void printCateList() {
		// 카테코리만 전체 출력 
		cateCnt = 0;
		while(true) {
			if(shop[cateCnt][0] == null) {
				break;
			}
			System.out.println(shop [cateCnt ][ 0 ] + " ");
			cateCnt++;
		}
		cateCnt = 0;
	}
	void printItemList() {
		// 아이템만 전체출력
		itemCnt = 0 ;
		while (true) {
			if(shop[itemCnt][1] == null) {
				break;
			}
			System.out.println(shop [ itemCnt ][ 1 ]);
			itemCnt++;
		}
		itemCnt = 0;
	}
    void printAll() {
		// 카테고리랑 아이템 출력
    	itemCnt = 0 ;
		while (true) {
			if(shop[itemCnt][1] == null) {
				break;
			}
			System.out.print(shop [cateCnt ][ 0 ] + " " + shop [ itemCnt ][ 1 ] + "\n");
			itemCnt++;
		}
		itemCnt = 0;
	}
	void addCategory(String shop[][]) {
	    // 카테고리 추가 
		String inputCate = charScan.nextLine();
		//shop 마지막 index 찾기
		int lastIndex = 0;
		itemCnt = 0;
		while (true) {
			if(shop[itemCnt][1] == null) {
				lastIndex = itemCnt;
				break;
			}
			itemCnt++;
		}
		//카테고리 마지막에 추가
		shop[lastIndex][0] = inputCate;
		System.out.println(lastIndex + " 칸에"+"카테고리 추가 완료 "+shop[lastIndex][0]);
	}
	void addItem(String shop[][]) {
	   // 아이템 추가 
		String inputItem = charScan.nextLine();
		//shop 마지막 index 찾기
		int lastIndex = 0;
		itemCnt = 0;
		while (true) {
			if(shop[itemCnt][1] == null) {
				lastIndex = itemCnt;
				break;
			}
			itemCnt++;
		}
		//카테고리 마지막에 추가
		shop[lastIndex][1] = inputItem+"/";
		System.out.println(lastIndex + " 칸에"+"아이템 추가 완료 "+shop[lastIndex][0]);
	}
	
	void removeItem(String shop[][]) {
        //아이템 제거 		
		System.out.println("remove Item ");
		System.out.println("choose category : ");
		int chooseIndex = intScan.nextInt();
		
		//아이템 배열에 정렬
		itemList = shop[chooseIndex][1].split("/");
		//아이템 출력
		for(int i = 0; i < itemList.length; i++	) {
			System.out.println(itemList[i]);
		}
		System.out.println("choose delete item : ");
		String delItem = charScan.nextLine();
		int delIndex = 0 ;
		for(int i = 0 ; i < itemList.length; i++) {
			if(itemList[ i ] == delItem) {
				delIndex = i;
				itemList[ i ] = null;
			}
		}
		
		//배열 정렬
		for(int i = delIndex; i < itemList.length -1 ; i++) {
			String temp = "";
			temp = itemList[ i + 1];
			itemList [ i ] = temp;
		}
		//정렬된 배열 출력
		System.out.println(shop[ chooseIndex ][ 1 ]);
		
		
		
	}
	void removeCate() {
		// 카테고리 제거 -- > 제거되면  카테고리 정렬 
	}
	void sortCate() {
		// 카테고리 아이템 갯수로 정렬 
	}
	void sortItem() {
		// 아이템 이름으로 정렬 
	}
	 // 초기값 
	void init() {
		shop[0][0] = "과일"; // 카테고리 
		shop[0][1] = "사과/포도"; // 아이템 
		shop[1][0] = "과자";
		shop[1][1] = "새우깡/감자칩";
		shop[2][0] = "음료";
		shop[2][1] = "콜라/사이다";
		shop[3][0] = "정육";
		shop[3][1] = "돼지/닭/소고기";
	}
	void run() {
		while(true) {
			printMenu();
			System.out.print(": ");
			int sel = intScan.nextInt();
			
			if(sel == 1) {
				
				printCateList();
				categoryMenu();
				System.out.print(": ");
				
				int menu = intScan.nextInt();
				if (menu == 1) {
					addCategory(shop);
				}else if(menu == 2) {
					removeCate();
				}else if(menu == 3) {
					sortCate();
				}
			}
			else if(sel == 2) {
				printItemList();
				itemMenu();
				System.out.print(": ");
				int menu = intScan.nextInt();
				if (menu == 1) {
					addItem(shop);
				}else if(menu == 2) {
					removeItem(shop);
				}else if(menu == 3) {
					sortItem();
				}
			}
			else if(sel == 3) {
				printAll();
			}
		}
	}

/*
 * # 쇼핑몰 [관리자]
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/쪼리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * } 
 */
	public static void main(String[] args) {
		ShoppingMall sm = new ShoppingMall();
		sm.init();
		sm.run();
	}
}