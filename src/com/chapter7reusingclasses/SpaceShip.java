package com.chapter7reusingclasses;

/**
 * @author qibie
 * @date 2018年12月12日 下午11:53:45   
 */
public class SpaceShip extends SpaceShipControls {
	private String name;
	public SpaceShip(String name) { this.name = name; }
	public String toString() { return name; }
	public static void main(String[] args) {
		SpaceShip protector = new SpaceShip("NSEA Protector");
		protector.forward(100);
	}
}
