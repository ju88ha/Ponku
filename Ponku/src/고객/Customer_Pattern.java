package 고객;

import 매장.Product;

public class Customer_Pattern {
	private Product purchased[];
	private Product best;
	private int numOfBest;
	
	public Customer_Pattern(){
		purchased = new Product[10];
		best = new Product("없음",0,"");
		numOfBest = 0;
	}
	
	public void addPattern(Product purchasedOne){
		for(int i = purchased.length -1 ; i > 0;i--)
			purchased[i] = purchased[i-1];
		purchased[0] = purchasedOne;
		makePattern();
	}
	
	public void makePattern(){
		int[] num = new int[purchased.length];
		
		for(int i = 0; i<purchased.length && purchased[i] != null ;i++){
			for(int j = 0; j<purchased.length  && purchased[j] != null; j++){
				if(purchased[i]==purchased[j]){
					num[i]++;
				}
			}
		}
		
		int bestIndex = 0;
		
		for(int i = 0; i<num.length-1; i++){
			if(num[i]<num[i+1])
				bestIndex = i+1;
		}
		
		this.best = purchased[bestIndex];
		this.numOfBest = num[bestIndex];
	}

	public Product getBest() {
		return best;
	}

	public void setBest(Product best) {
		this.best = best;
	}

	public int getNumOfBest() {
		return numOfBest;
	}

	public void setNumOfBest(int numOfBest) {
		this.numOfBest = numOfBest;
	}
	
	
}
