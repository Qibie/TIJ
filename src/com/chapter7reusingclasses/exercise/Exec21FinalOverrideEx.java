package com.chapter7reusingclasses.exercise;

import static net.mindview.util.Print.*;
/**
 * @author qibie
 * @date 2019年1月23日 上午12:01:48   
 */
class WithFinal{
	final void f() { print("WithFinal.f()"); }
	void g() { print("WithFinal.g()"); }
	final void h() { print("WitFinal.h()"); }
}

class OverrideFinal extends WithFinal {
	// attempt to override:
	// public final void f() { print("OverrideFinal.f()"); } // no can do
	@Override public void g() { print("OverrideFinal.g()"); } // OK, not final
	// final void h(); { print("OVerrideFinal.h()"); } // cannot override final 	
}

public class Exec21FinalOverrideEx {
	public static void main(String[] args) {
		OverrideFinal of = new OverrideFinal();
		of.f();
		of.g();
		of.h();
		// Upcast:
		WithFinal wf = of;
		wf.f(); 
		wf.g();
		wf.h(); 
	}
}
