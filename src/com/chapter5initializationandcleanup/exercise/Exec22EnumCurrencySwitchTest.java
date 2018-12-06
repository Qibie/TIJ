package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月6日 下午8:38:43
 */
class CurrencyContainer {
	Currency currency;

	CurrencyContainer(Currency currency) {
		this.currency = currency;
	}

	void describe() {
		switch (currency) {
		case ONE:
			System.out.println("ONE yuan");
			break;
		case FIVE:
			System.out.println("FIVE yuan");
			break;
		case TEN:
			System.out.println("TEN yuan");
			break;
		case TWENTY:
			System.out.println("TWENTY yuan");
			break;
		case FIFTY:
			System.out.println("FIFTY yuan");
			break;
		case HUNDRED:
			System.out.println("HUNDRED yuan");
			break;
		default:
			System.out.println("not in the list");
			break;
		}
	}
}

public class Exec22EnumCurrencySwitchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyContainer 
			one = new CurrencyContainer(Currency.ONE),
			five = new CurrencyContainer(Currency.FIVE),
			ten = new CurrencyContainer(Currency.TEN),
			twenty = new CurrencyContainer(Currency.TWENTY),
			fifty = new CurrencyContainer(Currency.FIFTY),
			hundred = new CurrencyContainer(Currency.HUNDRED);
		one.describe();
		five.describe();
		ten.describe();
		twenty.describe();
		fifty.describe();
		hundred.describe();
	}

}
