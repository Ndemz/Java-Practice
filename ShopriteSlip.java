import java.util.Scanner;
public class ShopriteSlip {
	
	public static void main(String[ ] args) {
		
		Scanner ndemz = new Scanner(System.in);
		
		String sNameOfStore = "Pick 'n Pay";
		String sNameOfMall = "Maponya Mall";
		String sNameOfCashier = "Ndemz";
		String TelNo = "0101252232";
		String item1, item2, item3;
		int quantity1, quantity2, quantity3;
		double price1, price2, price3, total1, total2, total3; 
		double total, vat1, vat2; 
		final double VAT_INC = 1.15;
		final double VAT = 0.15;
		//My fist java project uploaded to Github
		//ITEM1
		System.out.print("Enter the 1st item to buy: ");
		item1 = ndemz.nextLine();
		
		System.out.print("What is the price for each item? ");
		price1 = ndemz.nextDouble();
		
		System.out.print("How many item are you buying? ");
		quantity1 = ndemz.nextInt();
		ndemz.nextLine();
		
		System.out.println("");
		//ITEM2
		System.out.print("Enter the 2nd item to buy: ");
		item2 = ndemz.nextLine();
		
		System.out.print("What is the price for each item? ");
		price2 = ndemz.nextDouble();
		
		System.out.print("How many item are you buying? ");
		quantity2 = ndemz.nextInt();
		ndemz.nextLine();
		
		System.out.println("");
		//ITEM3
		System.out.print("Enter the 3rd item to buy: ");
		item3 = ndemz.nextLine();
		
		System.out.print("What is the price for each item? ");
		price3 = ndemz.nextDouble();
		
		System.out.print("How many item are you buying? ");
		quantity3 = ndemz.nextInt();
		
		//Processing
		total1 = quantity1 * price1;
		total2 = quantity2 * price2;
		total3 = quantity3 * price3;
		total = total1 + total2 + total3;
		vat1 = total * VAT;
		vat2 = total * VAT_INC;
		
		//Output
		System.out.println("");
		System.out.println("              " + sNameOfStore);
		System.out.println("            " + sNameOfMall);
		System.out.println("Name of the Cashier: " + sNameOfCashier);
		System.out.println("Tel No.: " + TelNo);
		System.out.println("-----------------------------------------------------------");
		System.out.println("You bought the following items: ");
		System.out.println(    item1 + " @ R" + price1 + " x" + quantity1);
		System.out.println(    item2 + " @ R" + price2 + " x" + quantity2);
		System.out.println(    item3 + " @ R" + price3 + " x" + quantity3);
		System.out.println("--------------------------------------------------------");
		System.out.println("Total[Excl.VAT]: R" + total);
		System.out.println("            VAT: R" + vat1);
		System.out.println("Total[Incl.VAT]: R" + vat2);
		
		
		
		
		
	}
}