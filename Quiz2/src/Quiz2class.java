import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class Quiz2class {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double t;
		System.out.print("Enter Tution: ");
		t = (scanner.nextDouble());
		
		double p;
		System.out.print("enter percent increase: ");
		p = (scanner.nextDouble()) / 100;
		
		double t2, t3, t4;
		t2 = t * p;
		t3 = t2 * p;
		t4 = t3 * p;
		
		double T;
		T = t + t4 + t2 + t3;
		
		int y;
		System.out.print("enter term of repayment: ");
		y = (scanner.nextInt())*12;
		
		int APR;
		System.out.print("Enter APR: ");
		APR = (scanner.nextInt())/100;
		
		
		double z = 0;
		boolean f = false;
		double PMT;
		
		PMT = FinanceLib.pmt(APR, y, T, z, f);
		System.out.println("Pay each month: " + (PMT/12)*-1);
	}

}



