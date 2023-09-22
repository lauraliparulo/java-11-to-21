package de.demo.syntax;

import java.util.Date;

public class Records {

	public static void main(String[] args) {
		final MyPoint myPoint = new MyPoint(12,23);
		
		System.out.println(myPoint);
		System.out.println(myPoint.x());
		
		var pair = new Pair<>("one",2);
		System.out.println(pair);
	}
}


record MyPoint(int x,int y) {}

record MyPointExtended(int x,int y) {
	
	//constructor
	public MyPointExtended(int x) {
		this(x,x);
		//exception can be thrown
		if(x<0) throw new IllegalArgumentException("x is negative!");
	}
	
	//custom method
	public int sum() {
		return x+y;
	}
}

//records with generics and interface implementation

interface Description {
	String description();
	Date date();
}

record Pair<T1,T2> (T1 first,T2 second) implements Description{

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date date() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}

record Multi<T1,T2,T3> (T1 first, T2 second, T3 third){
	
	@Override
	public String toString() {
		return first.toString();
	}
}

