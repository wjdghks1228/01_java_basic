package week5;
import java.util.Random;
// 카드 게임 포카카드 
// 카드 모양 : 다이아 하트 스페이드 클로버 
// 숫자 : 1- 10 
// 총 40장의 카드가 있어요 
// 플레이어는 두명 
// 2장씩 나눠 갖은 다음에 : 각 카드의 숫자의 합이 큰쪽이 이긴다 
// 랜덤값 가지기 : 카드가 한팩에서 4장을 꺼내오기 때문에 중복이 있으면 안돼요 
//만약에 같은 합이 나오면 다이아 > 하트 > 스페이드 > 클로버 순으로 이긴다 
class Card{
	static String shapeList[] = {"다이아 " , "하트" , "스페이드" ,"클로버"};
	// 스테틱 변수는 여러 객체들의 공통점을 보통 사용한다 
    static int garo = 100;
    static int sero = 150;
    // 각각의 숫자 , 카드 모양 --> 객체들의 차이점 : 개성 .. 인스턴스 변수로 만든다 
    String shape;
    int number;
	void printCard() {
		System.out.println(shape + " : " + number);
	}
	int findShapeWin(String shape) {
		for(int i =0; i < shapeList.length; i++) {
			if(shape.equals(shapeList[i])) {
				return i;
			}
		}
		return -1;
	}
}
class Player{
	Card card1;
	Card card2;
	int hap;
}
public class ExStatic {
	public static void main(String[] args) {
		/* 비기는 거 테스트 
		Player p1 = new Player();
		Player p2= new Player();
		p1.card1 = new Card();
		p1.card2 = new Card();
		p2.card1 = new Card();
		p2.card2 = new Card();
		p1.card1.number = 10;
		p1.card1.shape = Card.shapeList[0];
		p1.card2.number = 5;
		p1.card2.shape = Card.shapeList[1];
		p2.card1.number = 10;
		p2.card1.shape = Card.shapeList[2];
		p2.card2.number = 5;
		p2.card2.shape = Card.shapeList[3];
        */ 
		Player p1 = new Player();
		Player p2= new Player();
		int size = 40;
	    Card[] deck = new Card[size];
	    // 총 40 : 다이아 1 - 10 (10장 )  하트 1 - 10 (10장 )  스페이드 1 - 10 (10장 ) 클로버  1 - 10 (10장 )	    
		Random ran = new Random();
		String shapeList[] = Card.shapeList;
       int shapCnt =0;
		for(int i = 0; i <size; i++) {
			if(i%10 == 0 && i !=0) {
				shapCnt++; 
			}
			deck[i] = new Card();
			deck[i].shape = shapeList[shapCnt];
			deck[i].number = i % 10 + 1;
		}	
		System.out.println("deck");
		for(int i = 0; i <size; i++) {
		  deck[i].printCard();
		}
		// 셔플
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(size);
			Card temp = deck[0];
			deck[0] = deck[r];
			deck[r] = temp;
		}
		System.out.println("deck");
		for(int i = 0; i <size; i++) {
		  deck[i].printCard();
		}
		p1.card1 = deck[0];
		p1.card2 = deck[1];	
		p2.card1 = deck[2];
		p2.card2 = deck[3];
		System.out.println(" --- player1 ---  ");
		p1.card1.printCard();
		p1.card2.printCard();	
		System.out.println(" --- player2 ---  ");
		p2.card1.printCard();
		p2.card2.printCard();
	     p1.hap = p1.card1.number + p1.card2.number;
	     p2.hap = p2.card1.number + p2.card2.number;
	   if(p1.hap > p2.hap) {
		   System.out.println("p1 승리");
	   }else if(p1.hap < p2.hap) {
		   System.out.println("p2 승리");
	   }else {
		   // 비길때 
		   int p1Card = p1.card1.findShapeWin(p1.card1.shape);
		   int p2Card = p1.card2.findShapeWin(p1.card2.shape);
		   if(p1.card1.number > p1.card2.number) {
			   p1Card = p1.card1.findShapeWin(p1.card1.shape);   
		   }else if(p1.card1.number < p1.card2.number){
			   p1Card = p1.card1.findShapeWin(p1.card2.shape);
		   }else { // 만약 클로버 : 5 하트 : 5 이렇게 나왔을 경우 더 좋은 애 가진다 
			   int card1 = p1.card1.findShapeWin(p1.card1.shape);
			   int card2 = p1.card2.findShapeWin(p1.card2.shape);
			   if(card1 < card2) {
				   card1 = p1Card;
			   }else {
				   card2 = p1Card;
			   }
		   }
		   if(p2.card1.number > p2.card2.number) {
			   p2Card = p2.card1.findShapeWin(p2.card1.shape);   
		   }else if(p2.card1.number < p2.card2.number){
			   p2Card = p2.card1.findShapeWin(p2.card2.shape);
		   }else {
			   int card1 = p2.card1.findShapeWin(p2.card1.shape);
			   int card2 = p2.card2.findShapeWin(p2.card2.shape);
			   if(card1 < card2) {
				   card1 = p2Card;
			   }else {
				   card2 = p2Card;
			   }
		   }
		   if(p1Card < p2Card){
			   System.out.println("p1 승리");
		   }else {
			   System.out.println("p2 승리");
		   }
	   }
	}
}