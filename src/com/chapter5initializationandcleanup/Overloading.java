package com.chapter5initializationandcleanup;

//: initialization/Overloading.java
//Demonstration of both constructor
//and ordinary method overloading.
import static net.mindview.util.Print.*;

class Tree {
	int height;

	Tree() {
		print("Planting a seedling");
		height = 0;
	}

	Tree(int initialHeight) {
		height = initialHeight;
		print("Creating new Tree that is " + height + " feet tall");
	}

	void info() {
		print("Tree is " + height + " feet tall");
	}

	void info(String s) {
		print(s + ": Tree is " + height + " feet tall");
	}
}

/**
 * @author qibie
 * @date 2018年12月5日 下午3:32:59   
 */
public class Overloading {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
// Overloaded constructor:
		new Tree();
	}
}