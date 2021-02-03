package com.tactfactory.designpatternniveau1.command.tp5;

import com.tactfactory.designpatternniveau1.command.tp5.models.BuyStock;
import com.tactfactory.designpatternniveau1.command.tp5.models.GlobalStock;
import com.tactfactory.designpatternniveau1.command.tp5.models.SellStock;
import com.tactfactory.designpatternniveau1.command.tp5.models.Stock;

public class CommandTp1 {
	  public static void main(String[] args) throws CloneNotSupportedException {

		  GlobalStock globalStock = new GlobalStock();
		  globalStock.getStocks().add(new Stock("myItem"));
		  globalStock.getStocks().add(new Stock("apple"));
		  globalStock.getStocks().add(new Stock("pinapple"));
		  	  
		  globalStock.printStock();
		  
		  System.out.println("\n");

		  Stock stock1 = new Stock("myItem", 20, globalStock);
		  BuyStock buyStock1 = new BuyStock(stock1);
		  SellStock sellStock1 = new SellStock(stock1);
		  globalStock.executeCommand(buyStock1);
		  globalStock.executeCommand(sellStock1);		  
		  Stock stock2 = new Stock("apple", 4, globalStock);
		  SellStock sellStock2 = new SellStock(stock2);
		  globalStock.executeCommand(sellStock2);
		  Stock stock3 = new Stock("pinapple", 7, globalStock);
		  BuyStock BuyStock3 = new BuyStock(stock3);
		  globalStock.executeCommand(BuyStock3);
		  System.out.println("\n");  
		  globalStock.printStock(); 
		  System.out.println("\n");
		  globalStock.showHistory();
		  
	  }
	}
