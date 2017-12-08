package 고객;

import 매장.Product;

public class Customer {
	public Customer_Info customers[];	//고객 저장 자료구조
	private int numberOfCustomer;	//총 고객 수
	
	public Customer(){
		customers = new Customer_Info[100];
		numberOfCustomer = 0;
	}
	
	public void addCustomer(String phone, String name){	//맨처음 고객 생성
		if(numberOfCustomer==customers.length)
			resize();
		else{
			Customer_Info newCustomer = new Customer_Info(phone,name);
			customers[numberOfCustomer++] = newCustomer;
		}
	}
	
	public void sellProduct(Product sold,String phoneNum){
		int customerIndex = customerIndex(phoneNum);
		customers[customerIndex].sellProduct(sold);
	}
	
	public void cutomerPattern(String phoneNum){
		int customerIndex = customerIndex(phoneNum);
		customers[customerIndex].bestInPattern();
	}
	
	public String returnGrade(int customerIndex){
		return customers[customerIndex].getGrade().getGradeAsString();
	}
	
	public String returnName(int customerIndex){
		return customers[customerIndex].getName();
	}
	
	public String returnPoint(int customerIndex){
		return Integer.toString(customers[customerIndex].getPoint());
	}
	
	public Product returnPattern(int customerIndex){
		return customers[customerIndex].getPattern().getBest();
	}
	
	public int returnHowManyDrinksOfPattern(int customerIndex){
		return customers[customerIndex].getPattern().getNumOfBest();
	}
	
	public void findInfo(String phoneNum){
		
		System.out.println(phoneNum+"에 대한 정보");
		int customerIndex = customerIndex(phoneNum);
		System.out.println("등급: "+returnGrade(customerIndex));
		System.out.println("이름: "+returnName(customerIndex));
		System.out.println("포인트: "+customers[customerIndex].getPoint());
		System.out.println("구매 패턴: "+customers[customerIndex].getPattern());
	}
	
	private int customerIndex(String a){
		for(int i = 0; i < customers.length; i++){
			if(a.equals(returnName(i)))
				return i;
		}
		return -1;	//오류시 -1 반환 
	}
	
	private void resize(){
		Customer_Info[] newCustomers = new Customer_Info[customers.length*2];
		System.arraycopy(customers, 0, newCustomers, 0, customers.length);
		customers = newCustomers;
	}
	
}
