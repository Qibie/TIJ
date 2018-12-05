package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月5日 下午5:22:52   
 */
class Aso {
	void bark() {
		System.out.println("woof");
	}
}

public class Exec7AutomaticConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aso a = new Aso();
		a.bark();
	}

}
