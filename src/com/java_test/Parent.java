package com.java_test;


public class Parent extends Test2 {
	
public static void main(String args[])
{
    Test2 d1 = new Test2();
    TestJava a1 = new TestJava();

    d1.eat();
    a1.eat();

    TestJava animal = new Test2();
    // eat() method of animal class is overridden by
    // base class eat()
    animal.eat();
}
}