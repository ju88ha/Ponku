package 공통;

import java.util.Scanner;

import 매장.Menu;
import 매장.Product;
import 매장.Store;
import 고객.Customer;

public class AppController {
   // AppController 변수
   String phone, name;

   Scanner sc = new Scanner(System.in);
   Store store = new Store();
   Customer customer = new Customer();
   AppIO appIO = new AppIO();
   Menu menu = new Menu();

   public void run() { // AppContoller 실행 메소드
      appIO.start(); // "[PONKU] 프로그램을 시작합니다."
      int GoOrStop = runtheProgram();   // 프로그램 목록 선택 메소드
      while (GoOrStop != 0) {   // 선택한 번호가 0이 아닌 동안
         switch (GoOrStop) {
         case 1:   // 물건 판매 메소드
            menu.MenuBoard();
            sellProduct();
            break;
         case 2:   // 고객 추가 메소드
            addCustomer();
            break;
         case 3:   // 고객 정보 확인 메소드
            confirmCustomer();
            break;
//         case 4:   // 메뉴 추가는 제외함
//            addMenu();
//            break;
         default:   // 1,2,3,4 이내의 숫자가 아니라면
            appIO.error();   // "[PONKU] : ERROR"
         }
         GoOrStop = runtheProgram();   // 프로그램 목록 선택 메소드
         appIO.newLine();   // \n
      }
      appIO.end(); // "[PONKU] 프로그램을 종료합니다."
   }

   private int runtheProgram() {   // 프로그램 목록 선택 메소드
      int goOrStop;
      while (true) {
         appIO.goOrStop();   // "[PONKU] 프로그램을 종료하시려면 0번을, 물건 판매를 하시려면 1번을, 고객 추가를 하시려면 2번을, 고객 정보 확인을 하시려면 3번을 입력해주세요."
         goOrStop = sc.nextInt();   // 숫자 입력받음
         if (goOrStop == 0 || goOrStop == 1 || goOrStop == 2 || goOrStop == 3) { // 0~3 이내의 값이면
            appIO.go(goOrStop);   // "[PONKU] " + inputInt + " 을(를) 입력하셨습니다."
            return goOrStop;
         }
         appIO.stop(goOrStop);   // "[PONKU] 0에서 3 이외의 값 " + inputChar + "을(를) 입력하셨습니다. 다시 입력해주세요."
      }
   }

   private void sellProduct() {   // 메뉴 판매 메소드
      AppIO.outputLine("[PONKU] 판매하고자하는 메뉴의 이름을 적어주세요.");
      String nameToSell = sc.nextLine();
      AppIO.outputLine("[PONKU] 판매하고자하는 메뉴의 타입을 적어주세요.");
      String typeToSell = sc.nextLine();
      Product p = store.findMenu(nameToSell, typeToSell);
      if(p == null)	// 못찾았을 경우
    	  return;
      AppIO.outputLine("[PONKU] 포인트를 적립할 고객번호 8자리를 입력해 주세요.");
      String num = sc.next();
      if(customer.customerIndex(num)==-1)
    	  AppIO.outputLine("[PONKU] 포인트를 적립할 고객이 저장되어 있지 않습니다.");
      else
    	  customer.sellProduct(p, customer.customerIndex(num));
   }

   private void addCustomer() {   // 고객 추가 메소드
      appIO.PhoneNumberToAdd();   // "[PONKU] 추가하고자 하는 고객 번호 11자리를 입력하세요."
      String phoneNumber = sc.next();
      appIO.NameToAdd();   // "[PONKU] 추가하고자 하는 고객 이름을 입력하세요."
      String name = sc.next();
      if(customer.customerIndex(phoneNumber)!=-1)
    	  AppIO.outputLine("이미 같은 번호의 고객이 존재합니다.");
      else
    	  customer.addCustomer(phoneNumber, name);
   }

   private void confirmCustomer() {   // 고객 정보 확인 메소드
      appIO.PhoneNumberToFind();   // "[PONKU] 검색하고자 하는 고객번호를 입력해주세요."
      String phoneNumber = sc.next();
      
      if(customer.customerIndex(phoneNumber)==-1)
    	  AppIO.outputLine("[PONKU]해당 번호의 고객이 존재하지 않습니다.");
      else
    	  customer.findInfo(phoneNumber);
   }
   
   private void addMenu() {   // 메뉴 추가 메소드
      AppIO.outputLine("[PONKU] 추가하고자 하는 메뉴 이름을 입력하세요.");
      String n = sc.next();   // 메뉴 이름
      AppIO.outputLine("[PONKU] 추가하고자 하는 메뉴 가격을 입력하세요.");
      int c = sc.nextInt();   // 메뉴 가격
      AppIO.outputLine("[PONKU] 추가하고자 하는 메뉴 타입을 입력하세요.");
      String t = sc.next();   // 메뉴 타입
      
      store.addMenu(n, c, t);
   }
}
