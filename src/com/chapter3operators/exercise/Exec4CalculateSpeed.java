package com.chapter3operators.exercise;

/**
 * @author qibie
 * @date 2018年12月3日 下午5:27:11   
 */
public class Exec4CalculateSpeed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float d = 565.3f;
		float t = 3.6f;
		System.out.println("Distance: " + d);
		System.out.println("Time: " + t);
		float v = VelocityCalculator.velocity(d, t);
		System.out.println("Velocity: " + v);		
	}
}

class VelocityCalculator{
	static float velocity(float d, float t) {
		if(t == 0) {
			return 0f;
		} else {
			return d/t;
		}
	}
}