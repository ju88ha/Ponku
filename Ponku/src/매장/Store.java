package ∏≈¿Â;

public class Store {
	private Menu menu;
	private Store_Pattern store_pattern;
	private final int itemTypeOfMenu = 4;
	
	public Store() {
		menu = new Menu(itemTypeOfMenu);
		store_info = new Store_Info();
		store_pattern = new Store_Pattern();
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Store_Info getStore_info() {
		return store_info;
	}

	public void setStore_info(Store_Info store_info) {
		this.store_info = store_info;
	}

	public Store_Pattern getStore_pattern() {
		return store_pattern;
	}

	public void setStore_pattern(Store_Pattern store_pattern) {
		this.store_pattern = store_pattern;
	}
	
	
	public void addMenu(String name, int cost, String type){
		Product newMenu = new Product(name,cost,type);
		menu.addMenu(newMenu);
	}
	
	
	public void viewMenu(){
		menu.
	}
	
}