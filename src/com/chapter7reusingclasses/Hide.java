package com.chapter7reusingclasses;

import static net.mindview.util.Print.*;
/**
 * Overloading a base-class method name in a derived class
 * does not hide the base-class versions.
 * @author qibie
 * @date 2018年12月22日 上午12:24:42   
 */
class Homer {
	char doh(char c) {
		print("doh(char)");
		return 'd';
	}
	float doh(float f) {
		print("doh(float)");
		return 1.0f;
	}
}

class Milhouse {}

class Bart extends Homer {
	void doh(Milhouse m) {
		print("doh(Milhouse)");
	}
}

public class Hide {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}

}
