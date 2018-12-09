package com.chapter6accesscontrol.access;

//import com.chapter6accesscontrol.access.dessert.Cookie;

/**
 * @author qibie
 * @date 2018年12月9日 下午5:26:04
 */
//public class ChocolateChip extends Cookie {
public class ChocolateChip {
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}

	public void chomp() {
		// ! bite(); // Can’t access bite
	}

	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();
	}
}
