import java.util.Scanner;
public class Retirement {
	

public static void main(String args[]) {
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please enter Years To Work:"); 
	 int work_years = sc.nextInt();  //variable for years to work
	 System.out.println("Please enter Annual Return (not in decimal form):");
	 double annual_return = sc.nextDouble() / 100;  //variable for annual return, make decimal
	 System.out.println("Please enter Years Retired:");
	 int years_retired = sc.nextInt(); //variable for years retired
	 System.out.println("Please enter Second Annual Return (not in decimal form):");
	 double annual_return1 = sc.nextDouble() / 100; //variable for second annual return, make decimal
	 System.out.println("Please enter Required Income:");
	 int required_income = sc.nextInt(); //variable for required income
	 System.out.println("Please enter Monthly SSI:");
	 int monthly_ssi = sc.nextInt(); //variable for monthly SSI
	 
	 
	 double total_amount_save = (((required_income-monthly_ssi)*12)*((1-1/(Math.pow((double)1+annual_return1/12, 
			 (double)years_retired*12)))/annual_return1)); // Calculation for total_amount saved
	 
	 double save_each_month = ((total_amount_save*annual_return/12)/ ((Math.pow((double)1+(annual_return/12),
			 (double)work_years*12))-1)); // Calculation for amount need to save each month
	
	 System.out.printf("Each month you need to save: "+"$" + "%.2f",save_each_month);
	 System.out.println();
	 System.out.printf("Total need to save: "+"$" + "%.2f",total_amount_save);
}
}
	 