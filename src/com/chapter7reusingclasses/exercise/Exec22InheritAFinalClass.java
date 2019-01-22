package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2019年1月23日 上午12:07:15
 */
class SmallBrain {
}

final class Dinosaur {
	SmallBrain x = new SmallBrain();
}

//class Further extends Dinosaur {} // error: cannot inherit from final Dinosaur
public class Exec22InheritAFinalClass {
	public static void main(String[] args) {
		Dinosaur d = new Dinosaur();
	}
}
