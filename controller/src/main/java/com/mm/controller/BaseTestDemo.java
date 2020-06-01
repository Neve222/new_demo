package com.mm.controller;

import com.mm.business.service.TestNPE;
import com.mm.business.service.impl.TestNPEImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author mmn
 * @date 2020/5/7
 */
public class BaseTestDemo {
	@Autowired
	private TestNPE testNPE;

	public static void main(String[] args) {
		System.out.println(1.0 / 0);

		double c = 0.8;
		double d = 0.7;
		double e = 0.6;
		System.out.println(c - d);
		System.out.println(d - e);

		TestNPE testNPE = new TestNPEImpl();
//		testNPE.test2(null);

		testNPE.test3(1);
	}
}
