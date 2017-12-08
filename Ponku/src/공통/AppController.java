package 공통;

import java.util.Scanner;
import 매장.Store;
import 고객.Customer;

public class AppController {
		String phone,name;
		
		Scanner sc = new Scanner(System.in);
		Store store = new Store();
		Customer customer = new Customer();
		AppIO appIO = new AppIO();
		
		
		public void run(){
			appIO.start();
			int GoOrStop = runtheProgram();
			while(GoOrStop != 0){
				switch(GoOrStop){
				case 1:
					sellProduct();	
					break;
				case 2:
					addCustomer();		// 구현 완료.
					break;
				case 3:
					confirmCustomer();	// 구현 완료.
					break;
				case 4:
					addMenu();	// 구현 완료
					break;
				default:
					appIO.error();
				}
				GoOrStop = runtheProgram();
				appIO.newLine();
			}
			appIO.end();
		}
		
		private int runtheProgram(){
			int goOrStop;
			while(true){
				appIO.goOrStop();
				goOrStop = sc.nextInt();
				if(goOrStop == 0 || goOrStop == 1 || goOrStop == 2 || goOrStop == 3 || goOrStop == 4 ){
					appIO.go(goOrStop);
					return goOrStop;
				}
				appIO.stop(goOrStop);
			}
		}
		
		private void addCustomer(){
			appIO.PhoneNumberToAdd();
			String phoneNumber = sc.next();
			appIO.NameToAdd();
			String name = sc.next();
			customer.addCustomer(phoneNumber, name);
		}
		
		private void confirmCustomer(){
			appIO.PhoneNumberToFind();
			String phoneNumber = sc.next();
			customer.findInfo(phoneNumber);
		}
		
		private void addMenu(){
			appIO.insertNewMenu();
			String n = sc.next();
			int c = sc.nextInt();
			String t = sc.next();
			store.addMenu(n,c,t);
		}
		
		private void sellProduct(){	
			System.out.println("판매하고자하는 메뉴의 이름을 적어주세요.");
			String productToSell = sc.next();
			System.out.println("포인트를 적립할 고객번호 11자리를 입력해 주세요.");
			String num = sc.next();
			
			customer.sellProduct(,num);
		}
}

