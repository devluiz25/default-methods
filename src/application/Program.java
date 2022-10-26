package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("INFORME O VALOR: ");
		double amount = sc.nextDouble();
		System.out.print("INFORME A QUANTIDADE DE MESES: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println();
		
		System.out.println("PAYMENT AFTER " + months + " MONTHS: ");
		System.out.println(String.format("%.2f", payment));
		
		
		
		
		
		
		sc.close();
	}

}
