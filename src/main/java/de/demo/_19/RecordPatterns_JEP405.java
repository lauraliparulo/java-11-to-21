package de.demo._19;

public class RecordPatterns_JEP405 {

	public static void main(String[] args) {

		printCoordinateInfo(new Point(3,4));
	}

	static void printCoordinateInfo(Object obj) {

		if (obj instanceof Point(int x,int y)) {
			System.out.println("x: %d y: %d, sum: %d".formatted(x, y, x + y));
		}
	}

}

record Point(int x, int y) {
}
