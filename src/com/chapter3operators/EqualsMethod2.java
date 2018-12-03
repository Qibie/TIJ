package com.chapter3operators;

/** Default equals() does not compare contents.
 * @author qibie
 * @date 2018年12月3日 下午5:22:15
 */
class Value {
	int i;
}

public class EqualsMethod2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println(v1.equals(v2));
	}

}
