package all;

import java.util.Scanner;

import cus.Customer;
import sto.Menu;
import sto.Product;
import sto.Store;

public class AppController {
   // AppController ����
   String phone, name;

   Scanner sc = new Scanner(System.in);
   Store store = new Store();
   Customer customer = new Customer();
   AppIO appIO = new AppIO();
   Menu menu = new Menu();

   public void run() { // AppContoller ���� �޼ҵ�
      appIO.start(); // "[PONKU] ���α׷��� �����մϴ�."
      int GoOrStop = runtheProgram(); // ���α׷� ��� ���� �޼ҵ�
      while (GoOrStop != 0) { // ������ ��ȣ�� 0�� �ƴ� ����
         switch (GoOrStop) {
         case 1: // ���� �Ǹ� �޼ҵ�
            menu.MenuBoard();
            sellProduct();
            break;
         case 2: // ���� �߰� �޼ҵ�
            addCustomer();
            break;
         case 3: // ���� ���� Ȯ�� �޼ҵ�
            confirmCustomer();
            break;
         // case 4: // �޴� �߰��� ������
         // addMenu();
         // break;
         default: // 1,2,3,4 �̳��� ���ڰ� �ƴ϶��
            appIO.error(); // "[PONKU] : ERROR"
         }
         GoOrStop = runtheProgram(); // ���α׷� ��� ���� �޼ҵ�
         appIO.newLine(); // \n
      }
      appIO.end(); // "[PONKU] ���α׷��� �����մϴ�."
   }

   private int runtheProgram() { // ���α׷� ��� ���� �޼ҵ�
      String goOrStop;
      while (true) {
         appIO.goOrStop(); // "[PONKU] ���α׷��� �����Ͻ÷��� 0����, ���� �ǸŸ� �Ͻ÷��� 1����, ����
                        // �߰��� �Ͻ÷��� 2����, ���� ���� Ȯ���� �Ͻ÷��� 3���� �Է����ּ���."
         goOrStop = sc.nextLine(); // ���� �Է¹���
         if (goOrStop.equals("0") || goOrStop.equals("1") || goOrStop.equals("2") || goOrStop.equals("3")) { // 0~3
                                                                                    // �̳���
                                                                                    // ���̸�
            appIO.go(goOrStop); // "[PONKU] " + inputInt + " ��(��) �Է��ϼ̽��ϴ�."
            return Integer.parseInt(goOrStop);
         }
         appIO.stop(goOrStop); // "[PONKU] 0���� 3 �̿��� �� " + inputChar + "��(��)
                           // �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."
      }
   }

   private void sellProduct() { // �޴� �Ǹ� �޼ҵ�
      AppIO.outputLine("[PONKU] �Ǹ��ϰ����ϴ� �޴��� �̸��� �����ּ���.");
      String nameToSell = sc.nextLine();
      AppIO.outputLine("[PONKU] �Ǹ��ϰ����ϴ� �޴��� Ÿ���� �����ּ���.");
      String typeToSell = sc.nextLine();
      Product p = store.findMenu(nameToSell, typeToSell);
      if (p == null) // ��ã���� ���
         return;
      AppIO.outputLine("[PONKU] ����Ʈ�� ������ ������ȣ 8�ڸ��� �Է��� �ּ���.");
      String num = sc.nextLine();
      if (customer.customerIndex(num) == -1)
         AppIO.outputLine("[PONKU] ����Ʈ�� ������ ������ ����Ǿ� ���� �ʽ��ϴ�.");
      else
         customer.sellProduct(p, customer.customerIndex(num));
   }

   private void addCustomer() { // ���� �߰� �޼ҵ�
      appIO.PhoneNumberToAdd(); // "[PONKU] �߰��ϰ��� �ϴ� ���� ��ȣ 11�ڸ��� �Է��ϼ���."
      String phoneNumber = sc.nextLine();
      appIO.NameToAdd(); // "[PONKU] �߰��ϰ��� �ϴ� ���� �̸��� �Է��ϼ���."
      String name = sc.nextLine();
      if (customer.customerIndex(phoneNumber) != -1)
         AppIO.outputLine("�̹� ���� ��ȣ�� ������ �����մϴ�.");
      else
         customer.addCustomer(phoneNumber, name);
   }

   private void confirmCustomer() { // ���� ���� Ȯ�� �޼ҵ�
      appIO.PhoneNumberToFind(); // "[PONKU] �˻��ϰ��� �ϴ� ������ȣ�� �Է����ּ���."
      String phoneNumber = sc.nextLine();
      int customerIndex = customer.customerIndex(phoneNumber);
      if (customerIndex == -1)
         AppIO.outputLine("[PONKU]�ش� ��ȣ�� ������ �������� �ʽ��ϴ�.");
      else
         findInfo(customerIndex);
   }
   
   private void findInfo(int customerIndex){
	   AppIO.outputLine("[PONKU] "+customer.returnPhoneNumber(customerIndex)+" ��ȣ�� ���� ����");
	   AppIO.outputLine("�̸� : "+customer.returnName(customerIndex));
	   AppIO.outputLine("��� : "+customer.returnGrade(customerIndex));
	   AppIO.outputLine("���� ����Ʈ : "+customer.returnPoint(customerIndex));
	   AppIO.outputLine("���׷������ ���� ����Ʈ : "+customer.remainedPointToUpgrade(customerIndex));
	   AppIO.outputLine("���� ���� ���� �޴�: "+customer.returnPattern(customerIndex));
	   AppIO.outputLine("���� ���� ���� �޴��� �� "+customer.returnHowManyDrinksOfPattern(customerIndex));
   }
   
   private void addMenu() { // �޴� �߰� �޼ҵ�
      AppIO.outputLine("[PONKU] �߰��ϰ��� �ϴ� �޴� �̸��� �Է��ϼ���.");
      String n = sc.nextLine(); // �޴� �̸�
      AppIO.outputLine("[PONKU] �߰��ϰ��� �ϴ� �޴� ������ �Է��ϼ���.");
      int c = sc.nextInt(); // �޴� ����
      AppIO.outputLine("[PONKU] �߰��ϰ��� �ϴ� �޴� Ÿ���� �Է��ϼ���.");
      String t = sc.nextLine(); // �޴� Ÿ��

      store.addMenu(n, c, t);
   }
}