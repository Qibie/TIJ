package com.chapter6accesscontrol.exercise;

import com.chapter6accesscontrol.exercise.debug.Debug.*;
import com.chapter6accesscontrol.exercise.debugoff.Debug.*;

import com.chapter6accesscontrol.exercise.debugoff.Debug;
/**
 * @author qibie
 * @date 2018年12月9日 下午5:57:26   
 */
public class Exec3DebugTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.chapter6accesscontrol.exercise.debug.Debug.debug("debug");
		com.chapter6accesscontrol.exercise.debugoff.Debug.debug("debugoff");
	}

}
