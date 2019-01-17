/**
 * 
 */
package com.chapter7reusingclasses;

/**
 * "Blank" final fields.
 * 
 * @ClassName: BlankFinal
 * @author: qibie-pc
 * @date: 2019年1月17日 下午10:26:16
 */
class Poppet {
	private int i;

	Poppet(int ii) {
		i = ii;
	}
}

public class BlankFinal {
	private final int i = 0; // Initialized final
	private final int j; // Blank final
	private final Poppet p; // Blank final reference
	// Blank finals MUST be initialized in the constructor:

	BlankFinal() {
		j = 1; // Initialize blank final
		p = new Poppet(1); // Initialize blank final reference
	}

	BlankFinal(int x) {
		j = x; // Initialize blank final
		p = new Poppet(x); // Initialize blank final reference
	}

	public static void main(String[] args) {
		new BlankFinal();
		new BlankFinal(47);
	}

}
