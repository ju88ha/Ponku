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
	
	public void sellProduct(Product sold, int customerIndex){
		customers[customerIndex].sellProduct(sold);
	}
	
	public void cutomerPattern(int customerIndex){
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
	
	public String returnPhoneNumber(int customerIndex){
		return customers[customerIndex].getPhoneNumber();
	}
	
	public int remainedPointToUpgrade(int customerIndex){
		 return customers[customerIndex].PointToUpgrade()- customers[customerIndex].getPoint();
	}
	
	public String returnPattern(int customerIndex){
		if(customers[customerIndex].getPattern().getBest()==null)
			return "구매기록이 없어요.";
		else
			return customers[customerIndex].getPattern().getBest().name();
	}
	
	public int returnHowManyDrinksOfPattern(int customerIndex){
		return customers[customerIndex].getPattern().getNumOfBest();
	}
	
	public int customerIndex(String a){ 
		for(int i = 0; i < numberOfCustomer; i++){
			if(a.equals(customers[i].getPhoneNumber()))
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
