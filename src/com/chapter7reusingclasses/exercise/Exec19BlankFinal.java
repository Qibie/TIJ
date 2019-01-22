package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2019年1月22日 下午11:51:07
 */
class Poppet {
	private int i;

	Poppet(int k) {
		i = k;
	}

	public String toString() {
		return ("Poppet " + i);
	}
}

class BlankFinalEx {
	final Poppet p; // Blank final reference
	// Blank finals MUST be initialized in the constructor:

	public BlankFinalEx() {
		p = new Poppet(1); // Initialize blank final reference
	}

	public BlankFinalEx(int x) {
		p = new Poppet(x); // Initialize blank final reference
	}
}

public class Exec19BlankFinal {
	public static void main(String[] args) {
		BlankFinalEx b1 = new BlankFinalEx();
		BlankFinalEx b2 = new BlankFinalEx(47);
		// b1.p = new Poppet(2); // Errors: cannot assign values
		// b2.p = new Poppet(3); // to final variables p
		System.out.println("b1.p: " + b1.p);
		System.out.println("b2.p: " + b2.p);
	}
}