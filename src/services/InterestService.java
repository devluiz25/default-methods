package services;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();

	default double payment(double amount, int months) {

		if (months < 1) {
			throw new InvalidParameterException("QUANTIDADE DE PARCELAS DEVE SER MAIOR QUE ZERO!");
		}

		return amount * Math.pow(1 + getInterestRate() / 100.00, months);
	}
}
