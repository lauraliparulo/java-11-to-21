package de.demo.syntax;

public class LocalEnumsAndInterfaces {
	
	public static void main(String[] args) {
		
		enum State { BAD, GOOD, UNKNOWN }
		
		interface Evaluation {
			State evaluate(String info);
		}
		
		class AlwaysBad implements Evaluation {
			@Override
			public State evaluate(String info) {
				return State.BAD;
			}
		}
		
		
		var result = new AlwaysBad().evaluate("DOES NOT MATTER");
			System.out.println(result);
	}

}
