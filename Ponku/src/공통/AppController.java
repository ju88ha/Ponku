package ����;

import java.util.Scanner;
import ����.Product;
import ����.Store;
import ��.Customer;

public class AppController {
   // AppController ����
   String phone, name;

   Scanner sc = new Scanner(System.in);
   Store store = new Store();
   Customer customer = new Customer();
   AppIO appIO = new AppIO();

   public void run() { // AppContoller ���� �޼ҵ�
      appIO.start(); // "[PONKU] ���α׷��� �����մϴ�."
      int GoOrStop = runtheProgram();   // ���α׷� ��� ���� �޼ҵ�
      while (GoOrStop != 0) {   // ������ ��ȣ�� 0�� �ƴ� ����
         switch (GoOrStop) {
         case 1:   // ���� �Ǹ� �޼ҵ�
            sellProduct();
            break;
         case 2:   // �� �߰� �޼ҵ�
            addCustomer();
            break;
         case 3:   // �� ���� Ȯ�� �޼ҵ�
            confirmCustomer();
            break;
//         case 4:   // �޴� �߰� �޼ҵ�
//            addMenu();
//            break;
         default:   // 1,2,3 �̳��� ���ڰ� �ƴ϶��
            appIO.error();   // "[PONKU] : ERROR"
         }
         appIO.newLine();   // \n
         GoOrStop = runtheProgram();   // ���α׷� ��� ���� �޼ҵ�
      }
      appIO.end(); // "[PONKU] ���α׷��� �����մϴ�."
   }

   private int runtheProgram() {   // ���α׷� ��� ���� �޼ҵ�
      int goOrStop;
      while (true) {
         appIO.goOrStop();   // "[PONKU] ���α׷��� �����Ͻ÷��� 0����, ���� �ǸŸ� �Ͻ÷��� 1����, �� �߰��� �Ͻ÷��� 2����, �� ���� Ȯ���� �Ͻ÷��� 3����, �޴� �߰��� �Ͻ÷��� 4���� �Է����ּ���."
         goOrStop = sc.nextInt();   // ���� �Է¹���
         if (goOrStop == 0 || goOrStop == 1 || goOrStop == 2 || goOrStop == 3 ) { // 0~4 �̳��� ���̸�
            appIO.go(goOrStop);   // "[PONKU] " + inputInt + " ��(��) �Է��ϼ̽��ϴ�."
            return goOrStop;
         }
         appIO.stop(goOrStop);   // "[PONKU] 0���� 4 �̿��� �� " + inputChar + "��(��) �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."
      }
   }

   private void sellProduct() {   // �޴� �Ǹ� �޼ҵ�
      AppIO.outputLine("[PONKU] �Ǹ��ϰ����ϴ� �޴��� �̸��� �����ּ���.");
      String productToSell = sc.next();
      Product p = new Product(productToSell);
      AppIO.outputLine("[PONKU] ����Ʈ�� ������ ����ȣ 8�ڸ��� �Է��� �ּ���.");
      String num = sc.next();

      customer.sellProduct(p, num);
   }

   private void addCustomer() {   // �� �߰� �޼ҵ�
      appIO.PhoneNumberToAdd();   // "[PONKU] �߰��ϰ��� �ϴ� �� ��ȣ 11�ڸ��� �Է��ϼ���."
      String phoneNumber = sc.next();
      appIO.NameToAdd();   // "[PONKU] �߰��ϰ��� �ϴ� �� �̸��� �Է��ϼ���."
      String name = sc.next();
      
      customer.addCustomer(phoneNumber, name);
   }

   private void confirmCustomer() {   // �� ���� Ȯ�� �޼ҵ�
      appIO.PhoneNumberToFind();   // "[PONKU] �˻��ϰ��� �ϴ� ����ȣ�� �Է����ּ���."
      String phoneNumber = sc.next();
      
      customer.findInfo(phoneNumber);
   }
   
   private void addMenu() {   // �޴� �߰� �޼ҵ�
      AppIO.outputLine("[PONKU] �߰��ϰ��� �ϴ� �޴� �̸��� �Է��ϼ���.");
      String n = sc.next();   // �޴� �̸�
      AppIO.outputLine("[PONKU] �߰��ϰ��� �ϴ� �޴� ������ �Է��ϼ���.");
      int c = sc.nextInt();   // �޴� ����
      AppIO.outputLine("[PONKU] �߰��ϰ��� �ϴ� �޴� Ÿ���� �Է��ϼ���.");
      String t = sc.next();   // �޴� Ÿ��
      
      store.addMenu(n, c, t);
   }
}
