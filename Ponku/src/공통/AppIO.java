package ����;

public class AppIO {
	
	public AppIO(){
		
	}
	
	public void start(){
		System.out.println("[PONKU] ���α׷��� �����մϴ�.");
	}
	
	public void end(){
		System.out.println("[PONKU] PONKU�� �����մϴ�. ");
	}
	
	public void goOrStop(){
		System.out.println("[PONKU]�����Ͻ÷��� Y(y) �����Ͻ÷��� N(n)�� �Է����ּ���.");
	}
	public void go(int inputChar){
			System.out.println("[PONKU] "+inputChar+" ��(��) �Է��ϼ̽��ϴ�.");
	}
	
	public void stop(int inputChar){
		System.out.println("[PONKU] Y(y)�̳� N(n)�̿��� �� "+inputChar+"��(��) �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
	}
	
	public void chooseItem(){
		System.out.println("[PONKU] �� ���� �׸��� 1, ������� �׸��� 2�� �Է����ּ���.");
	}
	
	public void choose(String inputInt){
		System.out.println("[PONKU] "+inputInt+" ��(��) �Է��ϼ̽��ϴ�.");
	}
	
	public void rechoose(String inputInt){
		System.out.println("[PONKU] 1�̳� 2 �̿��� �� "+inputInt+"��(��) �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
	}
	
	public void choose(int inputInt){
		System.out.println("[PONKU] "+inputInt+" ��(��) �Է��ϼ̽��ϴ�.");
	}
	
	public void rechoose(int inputInt){
		System.out.println("[PONKU] 1�̳� 2 �̿��� �� "+inputInt+"��(��) �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
	}
	
	public void chooseCustomer(){
		System.out.println("[PONKU] �� �߰��� 1, �� Ȯ���� 2�� �Է����ּ���.");
	}
	
	public void chooseStore(){
		System.out.println("[PONKU] �ǸŴ� 1, �޴� ������ 2, ���� ������ 3�� �Է����ּ���. ");
	}
	
	public void PhoneNumberToAdd(){
		System.out.println("[PONKU] �߰��ϰ��� �ϴ� �� ��ȣ 11�ڸ��� �Է��ϼ���.");
	}
	
	public void NameToAdd(){
		System.out.println("[PONKU] �߰��ϰ��� �ϴ� �� �̸��� �Է��ϼ���.");
	}
	
	public void PhoneNumberToFind(){
		System.out.println("[PONKU] �˻��ϰ��� �ϴ� ����ȣ�� �Է����ּ���.");
	}
	
	public void chooseMenu(){
		System.out.println("[PONKU] �޴� �߰��� 1, �޴������ 2�� �Է����ּ���.");
	}
	
	public void chooseKindOfMenu(){
		System.out.println("[PONKU] Coffee�� 1, Tea�� 2, Ade��  3, SideMenu�� 4 �Դϴ�. �� �� �޴� Ÿ���� �Է��� �ּ���. ");
	}
	
	public void insertNewMenu(){
		System.out.println("[PONKU] �̸�, ����, �з����� ���ʴ�� �Է����ּ���. (����� ���е˴ϴ�.)");
	}
	
	public void wordOfMenu(){
		System.out.println("Coffee       Tea       Ade       Side");
		System.out.println("�̸� ���� Hot / Cold �����Դϴ�.");
	}
	
	public void error(){
		System.out.println("[PONKU] : ERROR");
	}
	
	public void newLine(){
		System.out.println(" ");
	}
}
