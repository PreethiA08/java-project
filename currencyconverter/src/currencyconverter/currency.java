package currencyconverter;

import java.util.Scanner;

public class currency {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Choose your option:");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("1) USD TO EURO");
		System.out.println("2) EURO TO USD");
		System.out.println("3) POUND TO USD");
		System.out.println("4) IND TO USD");
		System.out.println("5) IND TO SKW");
		
		int exchange = sc.nextInt();
		
		switch (exchange) {
		case 1: {
			System.out.println("Enter the amount in USD");
			
			double usd = sc.nextDouble();
			
			if (usd>=0) {
				System.out.println(usd + " USD is " + usd*0.908 + " EUROS");
			}
			else {
				System.out.println("Please use positive numbers");
			}
		}
		break;
		case 2: {
			System.out.println("Enter the amount in EUROS");
			
			double euro = sc.nextDouble();
			
			if (euro>=0) {
				System.out.println(euro + " EURO is " + euro*1.101 + " USD");
			}
			else {
				System.out.println("Please use positive numbers");
			}
		}
		break;
		case 3: {
			System.out.println("Enter the amount in POUNDS");
			
			double pounds = sc.nextDouble();
			
			if (pounds>=0) {
				System.out.println(pounds + " POUND is " + pounds*1.28 + " USD");
			}
			else {
				System.out.println("Please use positive numbers");
			}
		}
		break;
		case 4: {
			System.out.println("Enter the amount in IND");
			
			double ind = sc.nextDouble();
			
			if (ind>=0) {
				System.out.println(ind + " IND is " + ind*0.013 + " USD");
			}
			else {
				System.out.println("Please use positive numbers");
			}
		}
		break;
		case 5: {
			System.out.println("Enter the amount in IND");
			
			double ind = sc.nextDouble();
			
			if (ind>=0) {
				System.out.println(ind + " IND is " + ind*15.86 + " SKW");
			}
			else {
				System.out.println("Please use positive numbers");
			}
		}
		break;
	}
	sc.close();	
	}
}
