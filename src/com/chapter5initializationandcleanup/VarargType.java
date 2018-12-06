package com.chapter5initializationandcleanup;

import javax.swing.plaf.synth.SynthSplitPaneUI;

/**
 * @author qibie
 * @date 2018年12月6日 下午10:32:33
 */
public class VarargType {
	static void f(Character... args) {
		System.out.println(args.getClass());
		System.out.println(" length " + args.length);
	}

	static void g(int... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f('a');
		f();
		g(1);
		g();
		System.out.println("int[]: " + new int[0].getClass());
	}

}
