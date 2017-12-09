package 공통;

public class AppIO {

   public AppIO() { // AppIO 기본 생성자

   }

   public static void output(String aString) { // 문장 출력 메소드
      System.out.print(aString);
   }

   public static void outputLine(String aString) { // 문장과 개행 출력 메소드
      System.out.println(aString);
   }

   public void newLine() { // 띄어쓰기 문장 출력 메소드
      System.out.println(" ");
   }

   public void start() { // 프로그램 실행 문장 출력 메소드
      System.out.println("[PONKU] 프로그램을 시작합니다.");
   }

   public void end() { // 프로그램 종료 문장 출력 메소드
      System.out.println("[PONKU] 프로그램을 종료합니다.");
   }

   public void error() { // 에러 문장 출력 메소드
      System.out.println("[PONKU] : ERROR");
   }

   public void goOrStop() { // 프로그램 목록 선택 문장 출력 메소드
      System.out.println("[PONKU] 프로그램을 종료하시려면 0번을, 물건 판매를 하시려면 1번을, 고객 추가를 하시려면 2번을, 고객 정보 확인을 하시려면 3번을, 메뉴 추가를 하시려면 4번을 입력해주세요.");
   }

   public void go(int inputInt) { // 입력 문자 확인 문장 출력 메소드
      System.out.println("[PONKU] " + inputInt + " 을(를) 입력하셨습니다.");
   }

   public void stop(int inputInt) { // 입력 문자 확인 오류 문장 출력 메소드
      System.out.println("[PONKU] 0에서 4 이외의 값 " + inputInt + "을(를) 입력하셨습니다. 다시 입력해주세요.");
   }

   public void PhoneNumberToAdd() { // 고객 번호 추가 문장 출력 메소드
      System.out.println("[PONKU] 추가하고자 하는 고객 번호 11자리를 입력하세요.");
   }

   public void NameToAdd() { // 고객 이름 추가 문장 출력 메소드
      System.out.println("[PONKU] 추가하고자 하는 고객 이름을 입력하세요.");
   }

   public void PhoneNumberToFind() { // 고객 번호 검색 문장 출력 메소드
      System.out.println("[PONKU] 검색하고자 하는 고객번호를 입력해주세요.");
   }


   
   
   
   
   
   
   
//   public void chooseItem() { // 고객&매장 선택 문장 출력 메소드
//      System.out.println("[PONKU] 고객 관련 항목은 1, 매장관련 항목은 2를 입력해주세요.");
//   }
//
//   public void choose(int inputInt) { // 입력 숫자 확인 문장 출력 메소드
//      System.out.println("[PONKU] " + inputInt + " 을(를) 입력하셨습니다.");
//   }
//
//   public void rechoose(int inputInt) { // 입력 숫자 확인 오류 문장 출력 메소드
//      System.out.println("[PONKU] 1이나 2 이외의 값 " + inputInt + "을(를) 입력하셨습니다. 다시 입력하세요.");
//   }
//
//   public void chooseCustomer() { // 고객 관련 항목 선택 문장 출력 메소드
//      System.out.println("[PONKU] 고객 추가는 1, 고객 확인은 2를 입력해주세요.");
//   }
//
//   public void chooseStore() { // 매장 관련 항목 선택 문장 출력 메소드
//      System.out.println("[PONKU] 판매는 1, 메뉴 관리는 2, 가게 정보는 3을 입력해주세요. ");
//   }
//
//   public void chooseMenu() { // 메뉴 관련 항목 선택 문장 출력 메소드
//      System.out.println("[PONKU] 메뉴 추가는 1, 메뉴출력은 2를 입력해주세요.");
//   }
//
//   public void chooseKindOfMenu() { // 메뉴 종류 관련 항목 선택 문장 출력 메소드
//      System.out.println("[PONKU] Coffee는 1, Tea는 2, Ade는  3, SideMenu는 4 입니다. 이 중 메뉴 타입을 입력해 주세요. ");
//   }
//
//   public void chooseothersOfMenu() { // 메뉴 선택 문장 출력 메소드
//      System.out.println("[PONKU] 이름, 가격, Cold/Hot을 차례대로 입력해주세요. (띄어쓰기로 구분됩니다.)");
//   }
//
//   public void wordOfMenu() { // 메뉴 확인 문장 출력 메소드
//      System.out.println("Coffee       Tea       Ade       Side");
//      System.out.println("이름 가격 Hot / Cold 순서입니다.");
//   }
}
