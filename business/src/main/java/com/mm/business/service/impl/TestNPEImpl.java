package com.mm.business.service.impl;

import com.mm.business.service.TestNPE;

/**
 * @author mmn
 * @date 2020/4/30
 */
public class TestNPEImpl implements TestNPE {
	@Override
	public int test1() {
		return 0;
	}

	@Override
	public void test2(String s) {
		System.out.println("String");
	}

	@Override
	public void test2(Integer i) {
		System.out.println("Integer");
	}

	@Override
	public void test3(double d) {
		System.out.println("double");
	}

	@Override
	public void test3(Integer i) {
		System.out.println("integer");
	}

}
