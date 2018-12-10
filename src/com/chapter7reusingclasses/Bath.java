package com.chapter7reusingclasses;

import static net.mindview.util.Print.*;
/**
 * Constructor initialization with composition.
 * @author qibie
 * @date 2018年12月10日 下午11:14:25   
 */
class Soap {
	private String s;
	Soap() {
		print("Soap()");
		s = "Constructed";
	}
	public String toString() {
		return s;
	}
}

public class Bath {
	// Initializaing at point of definition
	private String
		s1 = "Happy",
		s2 = "Happy",
		s3, s4;
	private Soap castille;
	private int i;
	private float toy;
	public Bath() {
		print("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	// Instance initialization:
	{
		i = 47;
	}
	public String toString() {
		// Delayed initialization:
		if(s4 == null) {
			s4 = "Joy";
		}
		return
				"s1 = " + s1 + "\n" +
				"s2 = " + s2 + "\n" +
				"s3 = " + s3 + "\n" +
				"s4 = " + s4 + "\n" +
				"i = " + i + "\n" +
				"toy = " + toy + "\n" +
				"castille = " + castille;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bath b = new Bath();
		print(b);
	}

}
