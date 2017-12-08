package 공통;

public class AppIO {
	
	public AppIO(){
		
	}
	
	public void start(){
		System.out.println("[PONKU] 프로그램을 시작합니다.");
	}
	
	public void end(){
		System.out.println("[PONKU] PONKU를 종료합니다. ");
	}
	
	public void goOrStop(){
		System.out.println("[PONKU]시작하시려면 Y(y) 종료하시려면 N(n)을 입력해주세요.");
	}
	public void go(int inputChar){
			System.out.println("[PONKU] "+inputChar+" 을(를) 입력하셨습니다.");
	}
	
	public void stop(int inputChar){
		System.out.println("[PONKU] Y(y)이나 N(n)이외의 값 "+inputChar+"을(를) 입력하셨습니다. 다시 입력하세요.");
	}
	
	public void chooseItem(){
		System.out.println("[PONKU] 고객 관련 항목은 1, 매장관련 항목은 2를 입력해주세요.");
	}
	
	public void choose(String inputInt){
		System.out.println("[PONKU] "+inputInt+" 을(를) 입력하셨습니다.");
	}
	
	public void rechoose(String inputInt){
		System.out.println("[PONKU] 1이나 2 이외의 값 "+inputInt+"을(를) 입력하셨습니다. 다시 입력하세요.");
	}
	
	public void choose(int inputInt){
		System.out.println("[PONKU] "+inputInt+" 을(를) 입력하셨습니다.");
	}
	
	public void rechoose(int inputInt){
		System.out.println("[PONKU] 1이나 2 이외의 값 "+inputInt+"을(를) 입력하셨습니다. 다시 입력하세요.");
	}
	
	public void chooseCustomer(){
		System.out.println("[PONKU] 고객 추가는 1, 고객 확인은 2를 입력해주세요.");
	}
	
	public void chooseStore(){
		System.out.println("[PONKU] 판매는 1, 메뉴 관리는 2, 가게 정보는 3을 입력해주세요. ");
	}
	
	public void PhoneNumberToAdd(){
		System.out.println("[PONKU] 추가하고자 하는 고객 번호 11자리를 입력하세요.");
	}
	
	public void NameToAdd(){
		System.out.println("[PONKU] 추가하고자 하는 고객 이름을 입력하세요.");
	}
	
	public void PhoneNumberToFind(){
		System.out.println("[PONKU] 검색하고자 하는 고객번호를 입력해주세요.");
	}
	
	public void chooseMenu(){
		System.out.println("[PONKU] 메뉴 추가는 1, 메뉴출력은 2를 입력해주세요.");
	}
	
	public void chooseKindOfMenu(){
		System.out.println("[PONKU] Coffee는 1, Tea는 2, Ade는  3, SideMenu는 4 입니다. 이 중 메뉴 타입을 입력해 주세요. ");
	}
	
	public void insertNewMenu(){
		System.out.println("[PONKU] 이름, 가격, 분류명을 차례대로 입력해주세요. (띄어쓰기로 구분됩니다.)");
	}
	
	public void wordOfMenu(){
		System.out.println("Coffee       Tea       Ade       Side");
		System.out.println("이름 가격 Hot / Cold 순서입니다.");
	}
	
	public void error(){
		System.out.println("[PONKU] : ERROR");
	}
	
	public void newLine(){
		System.out.println(" ");
	}
}
