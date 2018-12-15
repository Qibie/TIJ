package com.chapter7reusingclasses.exercise;

import static net.mindview.util.Print.*;
/**
 * @author qibie
 * @date 2018年12月16日 上午12:31:53   
 */
class Component1 {
	Component1() {print("Component1()");}
}
class Component2 {
	Component2() {print("Component2()");}
}
class Component3 {
	Component3() {print("Component3()");}
}

class Root {
	Component1 c1root;
	Component2 c2root;
	Component3 c3root;
	Root() { print("Root()"); } 
}

class Stem extends Root {
	Component1 c1root;
	Component2 c2root;
	Component3 c3root;
	Stem() {
		print("Stem()");
	}
}

public class Exec9Stem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stem();
	}

}
