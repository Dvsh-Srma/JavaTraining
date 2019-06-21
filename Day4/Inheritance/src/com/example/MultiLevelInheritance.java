package com.example;

public class MultiLevelInheritance {
	int value = 100;
}

class Child1 extends MultiLevelInheritance{
	int value2 = 200;
}

class Child2 extends Child1 {
	public static void main(String[] args) {
		Child2 test = new Child2();
		System.out.println(test.value);
		System.out.println(test.value2);
	}
}


