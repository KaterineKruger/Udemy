package util;

public class CurrencyConverter {

	public static final double IOF = 1.06;
	
	public static double reaisPayment(double dollarPrice, double dollarQuantity) {
		return (dollarPrice * dollarQuantity * IOF);
	}
	
}