package test;

import java.util.Random;

class Unit{
	final int MAX_HP; // 상수는 무조건 대문자 
	int hp;
	String name;
	Unit(int hp , String name){
		MAX_HP = hp;
		this.hp = hp;
		this.name = name;
	}
	void attack( Unit unit , int hitDamage ) {
		if(unit.name == "soldier") {
			System.out.println("솔져확인");
		}
		unit.hp = unit.hp - hitDamage;
		System.out.printf("%s가 %s %d 공격 (%d / %d) \n" , name, unit.name, hitDamage , unit.hp , unit.MAX_HP  );
	}
}
class AirUnit extends Unit{
    AirUnit(int hp, String name) {
		super(hp, name); // 부모 생성자에 접근 : 부모안에 상수가 무조건 초기값을 가져야 하기때문에
		// 생성할때 반드시 초기값을 넣어줘야됨 
	}
}
class GroundUnit extends Unit{
	GroundUnit(int hp, String name) {
		super(hp, name);
	}
}
interface Heal{}
interface Repair{}
class Tank extends GroundUnit implements Repair{
	Tank() {
		super(150, "탱크");
	}
	@Override
	public String toString() {
		return "Tank [hp = "+ hp +"]";
	}
}
class Zat extends AirUnit {
	Zat(){
		super(100, "제트");
	}
	@Override
	public String toString() {
		return "Zat [hp = "+ hp +"]";
	}
}
class FixMechine extends GroundUnit implements Repair{
	FixMechine(){
		super(120, "수리기계");	
	}
	@Override
	public String toString() {
		return "FixMechine [hp = "+ hp +"]";
	}
	// 수리할 수 있는 기능 
	void repairHp( Repair repair) {
		Unit unit = (Unit) repair; // 여러개의 클래스가 있는데 unit 상속받은애 , 
		                           //repair 상속받은 애만 수리할 수 있음
    //그래서 unit 타입 이기 때문에 unit 안에 들어가 있는 애만 접근 가능하다 
		// MAX_HP ,hp , name 접근이 가능하다 
		unit.hp=unit.hp + 10;
		System.out.printf("%s: 수리 완료 %d/%d \n" , unit.name, unit.hp , unit.MAX_HP);
	}
}
class Fighter extends GroundUnit implements Repair{

	Fighter() {
		super(120 , "파이터");
	}
	@Override
	public String toString() {
		return "fighter [hp = "+ hp +"]";
	}
}
class Soldier extends GroundUnit implements Repair{

	Soldier() {
		super(100, "솔저");
	}
	@Override
	public String toString() {
		return "soldier [hp = "+ hp +"]";
	}
	
}
class Healler extends GroundUnit implements Repair{
	Healler(){
		super(80, "힐러");	
	}
	@Override
	public String toString() {
		return "Healler [hp = "+ hp +"]";
	}
	// 수리할 수 있는 기능 
	void repairHp( Repair repair, int ranHeal) {
		Unit unit = (Unit) repair; // 여러개의 클래스가 있는데 unit 상속받은애 , 
		                           //repair 상속받은 애만 수리할 수 있음
    //그래서 unit 타입 이기 때문에 unit 안에 들어가 있는 애만 접근 가능하다 
		// MAX_HP ,hp , name 접근이 가능하다 
		unit.hp=unit.hp + ranHeal;
		System.out.printf("%s: %d HP 수리 완료 %d/%d \n" , unit.name, ranHeal , unit.hp , unit.MAX_HP);
	}
}
public class InterfaceEx {
	public static void main(String[] args) {
		Random rand = new Random();
		//솔저 -> 탱크 공격
		int soldierToTank = rand.nextInt(10)+5;
		//탱크 -> 파이터 공격
		int tankToFighter = rand.nextInt(8)+10;
		//힐러 -> 파이터 치료
		int heallerToFighter = rand.nextInt(8)+6;
		Tank tank = new Tank();
		Zat zat = new Zat();
		FixMechine fx = new FixMechine();
		Fighter fighter = new Fighter();
		Healler healler = new Healler();
		Soldier soldier = new Soldier();
//		tank.attack(zat);
//		tank.attack(zat);
//		tank.attack(zat);
//		zat.attack(tank);
//		zat.attack(tank);
//		fx.repairHp(tank);
		soldier.attack(tank, soldierToTank);
		tank.attack(fighter, tankToFighter);
		healler.repairHp(fighter, heallerToFighter);
		//fx.repairHp(zat); implement Repair zat 클래스에 없어서 불가능 
	}
}