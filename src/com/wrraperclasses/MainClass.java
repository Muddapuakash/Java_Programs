package com.wrraperclasses;

public class MainClass {

	public static void main(String[] args) {
		/*DoublePrinter dPrinter=new DoublePrinter(29.567);
		dPrinter.iprint();
		
		StringPrinter sPrinter=new StringPrinter("akash");
		sPrinter.print();*/
		
//	   Printer dPrinter=new Printer(27.989);
//	   dPrinter.print();
	   
//	   Printer sPrinter=new Printer("Akash");
//	   sPrinter.print();
	   
//	   Printer<String> sPrinter=new Printer<>("Akash");
//	   sPrinter.print();
//	   
//	   Printer<Double> dPrinter=new Printer<>(279.987);
//	   dPrinter.print();
		
		MultiPrinter<Double,String> mp = new MultiPrinter<>(24.89,"akash");
		mp.print();
	   

	}

}
