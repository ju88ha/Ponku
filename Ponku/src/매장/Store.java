package ∏≈¿Â;

public class Store {
	private Menu menu;
	private Store_Pattern store_pattern;
	
	public Store() {
		menu = new Menu();
		store_pattern = new Store_Pattern();
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Store_Pattern getStore_pattern() {
		return store_pattern;
	}

	public void setStore_pattern(Store_Pattern store_pattern) {
		this.store_pattern = store_pattern;
	}
	
	public Product findMenu(String name,String type){
		return menu.findMenu(name, type);
	}
	
	
	public void addMenu(String name, int cost, String type){
		Product newMenu = new Product(name,cost,type);
		menu.addMenu(newMenu);
	}
	
}