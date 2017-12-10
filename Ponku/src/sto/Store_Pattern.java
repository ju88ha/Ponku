package sto;

public class Store_Pattern { //사람들이 가장 많이 구매하는 거
	private Product[] purchased;
	private Product best1;
	private Product best2;
	private int numOfBest1;
	private int numOfBest2;
	
	public Store_Pattern(){
		purchased = new Product[20];
		best1 = new Product();
		best2 = new Product();
		numOfBest1 = 0;
		numOfBest2 = 0;
	}
	
	public void addPattern(Product purchasedOne){
		for(int i = 0; i<purchased.length-1;i++)
			purchased[i+1] = purchased[i];
		purchased[0] = purchasedOne;
		makePattern();
	}
	
	public void makePattern(){
		int[] num = new int[purchased.length];
		
		for(int i = 0; i<purchased.length;i++){
			for(int j = 0; j<purchased.length ; j++){
				if(purchased[i]==purchased[j] && purchased[i].name().equals(null)){
					num[i]++;
				}
			}
		}
		
		int bestIndex1 = 0;
		int bestIndex2 = 0;
		
		for(int i = 0; i<num.length-1; i++){
			if(num[i]<num[i+1])
				bestIndex1 = i+1;
		}
		
		this.best1 = purchased[bestIndex1];
		this.numOfBest1 = num[bestIndex1];
		
		for(int i = 0; i<num.length-1; i++){
			if(num[i]<num[i+1]&& i != bestIndex1 && i+1 != bestIndex1)
				bestIndex2 = i+1;
		}
		
		this.best2 = purchased[bestIndex2];
		this.numOfBest2 = num[bestIndex2];
			
	}
		
}

