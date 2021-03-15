package com.tactfactory.designpatternniveau1.command.tp5.models;

public class SellStock implements Command {

	private Stock stock;
	private Stock beforeExecute;

	public SellStock(Stock stock) {

		this.stock = stock;

	}

	public Stock getStock() {

		return stock;
	}

	public boolean undo() {
		System.out.println("SellStock undo");
		this.stock.getName();
		this.stock.setQuantity(this.beforeExecute.getQuantity());
		return true;
	}

	public boolean execute() throws CloneNotSupportedException {

		for (Stock stock : this.stock.getGlobalStock().getStocks()) {

			if (stock.getName().equals(this.stock.getName())) {

				if ((stock.getQuantity() - this.stock.getQuantity()) >= 0) {
					this.beforeExecute = (Stock) this.stock.clone();
					stock.setQuantity((stock.getQuantity() - this.stock.getQuantity()));
					System.out.println(this.toString());
				} else {
					System.out.println("WOOOW C NEGATIF LO");
				}
			}
		}
		return true;
	}

	public String toString() {
		return "Stock [ Name: " + stock.getName() + ", Quantity: " + stock.getQuantity() + "] sold";
	}
}
