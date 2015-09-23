import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;


public class Quiz2class {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double r;
		System.out.print(": ");
		r = (scanner.nextDouble());
		
		double n;
		System.out.print("Years to repay loan: ");
		n = (scanner.nextDouble());
	
		
		double y;
		System.out.print("APR for your loan: ");
		y = (scanner.nextDouble());
		
		double p;
		boolean t;
		double FV;
		
		t = false;
		FV = FinanceLib.fv(r, n, y, p, t);
		
		
		
	}

}
