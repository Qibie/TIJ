/**
 * 
 */
package com.chapter7reusingclasses;

/**
 * Making an entire class final.
 * @ClassName:  Jurassic
 * @author: qibie-pc
 * @date:   2019年1月17日 下午10:40:19
 */
class SmallBrain {}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {}
}

// class Further extends Dinosaur {}
//error: Cannot extend final class ‘Dinosaur’ 

public class Jurassic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur(); 
		n.f();
		n.i = 40;
		n.j++;
	}

}
