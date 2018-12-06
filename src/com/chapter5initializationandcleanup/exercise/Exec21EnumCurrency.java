package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月6日 下午8:33:42   
 */
enum Currency{
	ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}

public class Exec21EnumCurrency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Currency c : Currency.values()) {
			System.out.println(c + ", ordinal " + c.ordinal());
		}
	}

}
