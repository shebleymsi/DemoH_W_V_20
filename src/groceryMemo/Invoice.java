package groceryMemo;

import java.util.Scanner; 

public class Invoice { 
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);  // LearnScanner 4.20.01_v20
		
		System.out.print("Enter Five Star Notebook quantity : ");
		int nbookq = input.nextInt();
		System.out.print("Enter Notebook Price : ");
		double nbookp = input.nextDouble();
		
		double totalnbook = nbookq*nbookp;
		
		System.out.print("Enter Duracell Copertop pencil Battery Quantity : ");
		int pbatteryq = input.nextInt();
		System.out.print("Enter Duracell Copertop pencil Battery Price : ");
		double pbatteryp = input.nextDouble();
		
		double totalpbattery = pbatteryq*pbatteryp;
		
		System.out.print("Enter Pringles Potato Chips Quantity : ");
		int chipsq = input.nextInt();
		System.out.print("Enter Pringles Potato Chips Price : ");
		double chipsp = input.nextDouble();
		
		double totalpChips = chipsq*chipsp;
		
		float tax = 0.08f;
		
		int Qtotal = (nbookq+pbatteryq+chipsq);
		double SubTotal = (totalnbook+totalpbattery+totalpChips);
		double TotalTax = ((totalnbook+totalpbattery+totalpChips)*(tax));
		double TotalAfterTax = (SubTotal+TotalTax);
		
		System.out.println();	
		
		System.out.println("\tUSA-BANGLA EXPOT");	
		System.out.println("\t37-57 73RD Street");	
		System.out.println("\tJACKSON HEIGHT, NY-11372");	
		System.out.println("\tBussiness Cell : +1 (929) 424 1900");	
		System.out.println("\t****************************************");	
		System.out.println("\tIteam\t\tQty\t\tPrice");
		
		System.out.println();	
		
		System.out.println("\tNotebook\t"+ nbookq +"\t\t$  "+ totalnbook );
		System.out.println("\tBattery\t\t"+ pbatteryq +"\t\t$  "+ totalpbattery );	
		System.out.println("\tChips\t\t"+ chipsq +"\t\t$  "+ totalpChips );	
		System.out.println("\t-----------------------------------------");	
		System.out.println("\tTotal Qty\t"+Qtotal);
		
		System.out.println();
		
		System.out.printf("\t\t\t    Sub Total = $ %.2f\n", SubTotal);	
		System.out.printf("\t\t\t    Sales Tax = $ %.2f\n", TotalTax);	
		System.out.printf("\t\t\t    Total     = $ %.2f\n", TotalAfterTax);	
		System.out.println("\t*****************************************");	
		System.out.println("\t(Thank you for your shopping.)");
		input.close();
		}
	
}
