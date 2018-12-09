package com.chapter6accesscontrol.access;

/**
 * @author qibie
 * @date 2018年12月9日 下午5:23:36   
 */
class Sundae {
	private Sundae() {};
	static Sundae makeASundae() {
		return new Sundae();
	}
}

public class IceCream {
	public static void main(String[] args) {
//		Sundae x = new Sundae();
		Sundae x = Sundae.makeASundae();
	}
}
