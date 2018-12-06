package com.chapter5initializationandcleanup;

/**
 * @author qibie
 * @date 2018年12月6日 下午6:21:04   
 */
public class EnumOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Spiciness s: Spiciness.values()) {
			System.out.println(s + ", ordinal " + s.ordinal());
		}
	}
}
