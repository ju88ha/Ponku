package ∏≈¿Â;

public class Product {
	private String _name;
	private int _cost;
	private String _type;
	
	public Product(){
		this._name = null;
		this._cost = 0;
		this._type = null;
		this._count = 0;
	}
	
	public Product(String t) {
		this._name = null;
		this._cost = 0;
		this._type = t;
	}
	
	public Product(String n, int c, String t){
		this._name = n;
		this._cost = c;
		this._type = t;
	}
	
	public String name() {
		return this._name;
	}
	
	public void setName(String n) {
		this._name = n;
	}
	
	public int cost() {
		return this._cost;
	}
	
	public void setCost(int c) {
		this._cost = c;
	}
	
	public String type() {
		return this._type;
	}
	
	public void setType(String t) {
		this._type = t;
	}
	
	public int count() {
		return this._count;
	}
	
	public void setCount(int co) {
		this._count = co;
	}
	
}