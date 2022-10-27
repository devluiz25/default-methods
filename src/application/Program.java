package application;

import java.security.InvalidParameterException;
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
		System.out.print("INFORME A QUANTIDADE DE PARCELAS MENSAIS: ");
		int installments = sc.nextInt();

		try {
			InterestService is = new BrazilInterestService(2.0);
			double payment = is.payment(amount, installments);

			System.out.println("PAYMENT AFTER " + installments + " MONTHS: ");
			System.out.println(String.format("%.2f", payment));

		} catch (InvalidParameterException e) {
			System.out.println("QUANTIDADE DE PARCELAS DEVE SER MAIOR QUE ZERO!");
		}

		sc.close();
	}

}
