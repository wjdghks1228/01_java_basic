package week5;

//직접적으로 값 수정 --> 변수 = 값 : 대입연산자 
//간접적으로 값 수정 --> 메서드를 사용하는것 : 외부에서 값을 주는 매개 인자값으로 매개변수를 통해서 인스턴스변수에 접근이 가능하다 
class Hospital{
	Doctor[] docs = new Doctor[4];
	Patient[] pas = new Patient[10];
	Nurse[] nur = new Nurse[3]; 
	void init() {
		docs[0] = new Doctor();
		//docs[0].dc_name ="홍길동"; // 외부에서 데이터를 직접적으로 고치는것이 불가능하게 만들어주는게 private 변수 ,
		                             //private 변수는 같은 클래스 안에서만 직접적으로 값 수정이 가능하다 
		                                   // 값 수정   .. 변수이름 = 새로운값 
		//docs[0].work_year = 15;
		//docs[0].work = true;
		docs[1] = new Doctor("김영희", 5 , false); // 생성자 오버로딩을 사용하면 외부에 준 값을 통해서 doctor 클래스로 가서 
		                                         // 일처리를 하기 때문에 간접적으로 값을 수정한것이다 
		docs[2]  = new Doctor("김철수", 3 , true);
		docs[3]  = new Doctor("황광희", 10 , false);
	}
}
class Doctor{
	private String dc_name;
	private int work_year;
	private boolean work; // 기본적 자동 초기화 값이 false 
	Doctor(){}
	Doctor(String dc_name ,int work_year, boolean work){ // 간접적으로 값을 수정 
		this.dc_name = dc_name; // 직접 수정 
		this.work_year = work_year;
		this.work = work;
	}
}
class Patient{
	private String pa_name;
	private int pa_brithyear; 
	private int come_day;
	private boolean stay; // 입원인지 아닌지 
	//source -> generate contractor with field -> 자동으로 생성자 오버로딩 : 외부에서 
	  // 인스턴스 변수에 초기값을 받아와서 그 값으로 인스턴스 변수 생성 
	public Patient(String pa_name, int pa_brithyear, int come_day, boolean stay) {
		//super();
		this.pa_name = pa_name;
		this.pa_brithyear = pa_brithyear;
		this.come_day = come_day;
		this.stay = stay;
	}
	// private 했기 때문에 외부 클래스에서는 메서드를 통해서 인스턴스 변수에 접근이 가능핟 ㅏ
	//[get , set ] 사용하는 것을 캡슐화 
	// 값 불러오기 : 인스턴스 변수의 값을 얻는다 --> get 
	String getPa_name(){
		return this.pa_name;
	}
	// 값 넣기 : 인스턴스 변수의 값을 세팅한다 --> set 
	void setPa_name(String pa_name) {
		this.pa_name = pa_name;
	}
}
class Nurse{
	String nr_name;
	boolean work; // 지금 병원에서 일하고 있는지 아닌지 
	public String getNr_name() {
		return nr_name;
	}
	public void setNr_name(String nr_name) {
		this.nr_name = nr_name;
	}
	           // boolean get 대신에 is 단어를 쓴다 
	public boolean isWork() {
		return work;
	}
	public void setWork(boolean work) {
		this.work = work;
	}
}
public class Day18_2 {
	public static void main(String[] args) {
		// 은닉성 --> 캡슐화 : 숨겨놨다 : 메서드를 통해서 값을 수정 , 값을 불러올수 잇게 만드는것이 캡슐화 
		Hospital hp = new Hospital();
		//hp.docs[0].dc_name = "박영희";
		 Patient p1 = new Patient("환자1",19901012,20210127,false);
		//  p1.p_name ="김홍국"; 불가능 하다 
		  // System.out.println(p1.p_name);
		 // 생성자 오버로딩을 통해서 생성을 하면 생성만 가능하고 그 이후에 
		 // 값을 불러오는거 값을 받아오는 것이 불가능하다 --> private 때문에 접근이 제한되어 있기 떄문에 
		 // 그래서 set get 를 만들어서 메서드를 통해서 값을 수정하고 불러 올수 있다 
		 System.out.println(p1.getPa_name());
		 p1.setPa_name("김흥국");
		 System.out.println(p1.getPa_name());
	}
}