package com.chapter5initializationandcleanup;

import static net.mindview.util.Print.*;

/**
 * Demonstrates initialization order.
 * 
 * @author qibie
 * @date 2018年12月6日 下午4:53:09
 */
//When the constructor is called to create a
//Window object, you’ll see a message:
class Window {
	Window(int marker) {
		print("Window(" + marker + ")");
	}
}

class House {
	Window w1 = new Window(1); // Before constructor

	House() {
		// Show that we’re in the constructor:
		print("House()");
		w3 = new Window(33); // Reinitialize w3
	}

	Window w2 = new Window(2); // After constructor

	void f() {
		print("f()");
	}

	Window w3 = new Window(3); // At end
}

public class OrderOfInitialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h = new House();
		h.f(); // Shows that construction is done
	}

}
