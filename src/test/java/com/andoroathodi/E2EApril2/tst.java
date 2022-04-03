package com.andoroathodi.E2EApril2;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class tst {

	
	@Test
	public void test1() {
		SoftAssert a1= new SoftAssert();
	int a = 5;
	int b=6;
	int x=5;
	int y=9;
	AssertJUnit.assertEquals(a, b);	
	AssertJUnit.assertEquals(a, x);
	System.out.println("check TEST1");
	a1.assertAll();
	}
	

	@Test
	public void test2() {
		SoftAssert a2= new SoftAssert();
		int c=4;
		int d=4;
		
		AssertJUnit.assertEquals(c, d);
		System.out.println("check TEST2");
		a2.assertAll();
	}
	
	@Test
	public void test3() {
		SoftAssert a3= new SoftAssert();
		int g=5;
		int x=9;
		AssertJUnit.assertEquals(g, x);
		System.out.println("check TEST3");
		a3.assertAll();
	}
}
