package com.tactfactory.designpatternniveau1.command.tp5.models;

import java.util.ArrayList;
import java.util.List;

import com.tactfactory.designpatternniveau1.command.tp5.utils.Invoker;

public class GlobalStock {

	private List<Stock> stocks = new ArrayList<Stock>();
	private Invoker invoker = new Invoker();

	public List<Stock> getStocks() {
		return stocks;
	}

	public void executeCommand(Command command) throws CloneNotSupportedException {
		if (command.execute()) {
			this.invoker.push(command);
		}
	}
	
	public void undo() {
		
	    if (this.invoker.isEmpty()) {
	      return;
	    }
	    
	    Command command = invoker.pop();
	    if (command != null) {
	      command.undo();
	    }
	  }

	public void showHistory() {
		this.invoker.showHistory();
	}

	public void printStock() {
		if (!stocks.isEmpty()) {
			for (Stock stock : stocks) {
				System.out.println(stock.toString());
			}
		} else {
			System.out.println("il n'y � pas de stock");
		}
	}

}
