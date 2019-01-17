/**
 * 
 */
package com.chapter7reusingclasses;

/**
 * Using "final" with method arguments. 
 * @ClassName:  FinalArguments
 * @author: qibie-pc
 * @date:   2019年1月17日 下午10:30:25
 */
class Gizmo {
	public void spin() {}
}

public class FinalArguments {
	void with(final Gizmo g) {
		//! g = new Gizmo(); // Illegal -- g is final 
	}
	void without(Gizmo g) {
		g = new Gizmo(); // OK -- g not final
		g.spin();
	}
	// void f(final int i) { i++; } // Can’t change
	 // You can only read from a final primitive: 
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.with(null);
		bf.without(null);
	}

}
