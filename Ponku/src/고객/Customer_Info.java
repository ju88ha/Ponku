package ��;

import ����.Product;

public class Customer_Info {
	private Customer_Grade grade;
	private Customer_Pattern pattern;
	private String phonenumber;
	private int point;
	private String name;
	
	public Customer_Info(String phone, String name){
		this.grade = new Customer_Grade();
		this.pattern = new Customer_Pattern();
		this.phonenumber = phone;
		this.point = 0;
		this.name = name;
	}
	
	/* public �޼ҵ� */
	
	public Product bestInPattern(){
		return pattern.getBest();
	}
	
	public void sellProduct(Product p){
		addPoint(p.cost());
		addPattern(p);
	}
	
	public int numOfBest(){
		return pattern.getNumOfBest();
	}
	
	public Customer_Grade getGrade(){
		return this.grade;
	}
	
	public String getPhoneNumber(){
		return this.phonenumber;
	}

	public Customer_Pattern getPattern() {
		return pattern;
	}
	
	public int PointToUpgrade(){
		switch(this.grade.getGrade()){
		case 0:
			return 4000;
		case 1:
			return 10000;
		case 2:
			return 17000;
		case 3:
			return 0;
		}
		return -1;
	}

	public int getPoint() {
		return point;
	}

	public String getName() {
		return name;
	}

	/* private �޼ҵ� */
	
	// ������ �������� �� ���� �߰�
	private void addPattern(Product p){
		pattern.addPattern(p);
	}
	
	// ����� �÷��ִ� �޼ҵ�
	private void gradeUp(){
		switch(grade.getGrade()){
		case 0:
			grade.setGrade(1);
			grade.setAccumulationPoint(0.11);
			break;
		case 1:
			grade.setGrade(2);
			grade.setAccumulationPoint(0.15);
			break;
		case 2:
			grade.setGrade(3);
			grade.setAccumulationPoint(0.19);
			break;
		default:
			System.out.println("�� �̻� ��޻���� ����.");
		}
	}
	
	// ����Ʈ�� Ư�� �Ӱ����� �Ѿ����� üũ�ؼ� �Ѿ����� true �����ʾ����� false�� ��ȯ
	private boolean fullPoint(){
		switch(grade.getGrade()){
		case 0:
			if(4000<point)
				return true;
			break;
		case 1:
			if(10000<point)
				return true;
			break;
		case 2:
			if(17000<point)
				return true;
		}
		return false;
	}
	
	// ����Ʈ�� �����ִ� �޼ҵ�
	private void addPoint(int cost){
		point+=cost*grade.getAccumulationPoint();
		if(fullPoint())
			gradeUp();
	}
	
	
}
