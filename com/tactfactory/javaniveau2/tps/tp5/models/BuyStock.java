package com.tactfactory.designpatternniveau1.command.tp5.models;

public class BuyStock implements Command{

	private Stock stock;
	
	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	public Stock getStock() {
		return stock;
	}


	public boolean execute() throws CloneNotSupportedException {
		for(Stock stock : this.stock.getGlobalStock().getStocks()) {
			if(stock.getName().equals(this.stock.getName())) {
				stock.setQuantity((stock.getQuantity() + this.stock.getQuantity()));
				System.out.println(this.toString());
			}
		}
		return true;
	}
	
	public String toString() {
		return "Stock [ Name: " + stock.getName() + ", Quantity: " + stock.getQuantity() + "] bought";
	}
}
