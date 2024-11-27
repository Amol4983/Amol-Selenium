package com.Interface;

public class Driver1 {
	
	public static void main(String[] args) {
		
		Calculator c=new CalciImpl();
		c.add(10, 20);
		c.sub(80, 20);
		c.mul(5, 3);
		c.div(10, 2);
	}

}
