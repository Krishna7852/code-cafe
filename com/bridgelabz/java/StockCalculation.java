/* 
* Author:Dhareppa Metri
* File:StockCalculation.java
* Date:12/10/2016
* Purpose:program to read in Stock Names, Number of Share, Share Price. Print a Stock Report with total value of each * Stock and the total value of Stock.
**/
import com.bridgelabz.java.StockCalculation;
import com.bridgelabz.java.StockUtility;
import java.util.Scanner;

class StockCalculation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		StockUtility su = new StockUtility();
		int stockNumber;
		System.out.println("Please Enter No. of Stocks: ");
		//To read the integer from the keyboard.
		stockNumber = sc.nextInt();
		su.entry(stockNumber);
		su.calculate();
		su.totalval();
	}
}

