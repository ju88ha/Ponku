package ����;

public class AppIO {

   public AppIO() { // AppIO �⺻ ������

   }

   public static void output(String aString) { // ���� ��� �޼ҵ�
      System.out.print(aString);
   }

   public static void outputLine(String aString) { // ����� ���� ��� �޼ҵ�
      System.out.println(aString);
   }

   public void newLine() { // ���� ���� ��� �޼ҵ�
      System.out.println(" ");
   }

   public void start() { // ���α׷� ���� ���� ��� �޼ҵ�
      System.out.println("[PONKU] ���α׷��� �����մϴ�.");
   }

   public void end() { // ���α׷� ���� ���� ��� �޼ҵ�
      System.out.println("[PONKU] ���α׷��� �����մϴ�.");
   }

   public void error() { // ���� ���� ��� �޼ҵ�
      System.out.println("[PONKU] : ERROR");
   }

   public void goOrStop() { // ���α׷� ��� ���� ���� ��� �޼ҵ�
      System.out.println("[PONKU] ���α׷��� �����Ͻ÷��� 0����, ���� �ǸŸ� �Ͻ÷��� 1����, �� �߰��� �Ͻ÷��� 2����, �� ���� Ȯ���� �Ͻ÷��� 3����, �޴� �߰��� �Ͻ÷��� 4���� �Է����ּ���.");
   }

   public void go(int inputInt) { // �Է� ���� Ȯ�� ���� ��� �޼ҵ�
      System.out.println("[PONKU] " + inputInt + " ��(��) �Է��ϼ̽��ϴ�.");
   }

   public void stop(int inputInt) { // �Է� ���� Ȯ�� ���� ���� ��� �޼ҵ�
      System.out.println("[PONKU] 0���� 4 �̿��� �� " + inputInt + "��(��) �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
   }

   public void PhoneNumberToAdd() { // �� ��ȣ �߰� ���� ��� �޼ҵ�
      System.out.println("[PONKU] �߰��ϰ��� �ϴ� �� ��ȣ 11�ڸ��� �Է��ϼ���.");
   }

   public void NameToAdd() { // �� �̸� �߰� ���� ��� �޼ҵ�
      System.out.println("[PONKU] �߰��ϰ��� �ϴ� �� �̸��� �Է��ϼ���.");
   }

   public void PhoneNumberToFind() { // �� ��ȣ �˻� ���� ��� �޼ҵ�
      System.out.println("[PONKU] �˻��ϰ��� �ϴ� ����ȣ�� �Է����ּ���.");
   }


   
   
   
   
   
   
   
//   public void chooseItem() { // ��&���� ���� ���� ��� �޼ҵ�
//      System.out.println("[PONKU] �� ���� �׸��� 1, ������� �׸��� 2�� �Է����ּ���.");
//   }
//
//   public void choose(int inputInt) { // �Է� ���� Ȯ�� ���� ��� �޼ҵ�
//      System.out.println("[PONKU] " + inputInt + " ��(��) �Է��ϼ̽��ϴ�.");
//   }
//
//   public void rechoose(int inputInt) { // �Է� ���� Ȯ�� ���� ���� ��� �޼ҵ�
//      System.out.println("[PONKU] 1�̳� 2 �̿��� �� " + inputInt + "��(��) �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
//   }
//
//   public void chooseCustomer() { // �� ���� �׸� ���� ���� ��� �޼ҵ�
//      System.out.println("[PONKU] �� �߰��� 1, �� Ȯ���� 2�� �Է����ּ���.");
//   }
//
//   public void chooseStore() { // ���� ���� �׸� ���� ���� ��� �޼ҵ�
//      System.out.println("[PONKU] �ǸŴ� 1, �޴� ������ 2, ���� ������ 3�� �Է����ּ���. ");
//   }
//
//   public void chooseMenu() { // �޴� ���� �׸� ���� ���� ��� �޼ҵ�
//      System.out.println("[PONKU] �޴� �߰��� 1, �޴������ 2�� �Է����ּ���.");
//   }
//
//   public void chooseKindOfMenu() { // �޴� ���� ���� �׸� ���� ���� ��� �޼ҵ�
//      System.out.println("[PONKU] Coffee�� 1, Tea�� 2, Ade��  3, SideMenu�� 4 �Դϴ�. �� �� �޴� Ÿ���� �Է��� �ּ���. ");
//   }
//
//   public void chooseothersOfMenu() { // �޴� ���� ���� ��� �޼ҵ�
//      System.out.println("[PONKU] �̸�, ����, Cold/Hot�� ���ʴ�� �Է����ּ���. (����� ���е˴ϴ�.)");
//   }
//
//   public void wordOfMenu() { // �޴� Ȯ�� ���� ��� �޼ҵ�
//      System.out.println("Coffee       Tea       Ade       Side");
//      System.out.println("�̸� ���� Hot / Cold �����Դϴ�.");
//   }
}
