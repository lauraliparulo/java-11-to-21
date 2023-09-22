//package de.demo.incubator;
//
//import jdk.incubator.vector.IntVector;
//
//public class VectorAPI_JEP417 {
//	
//	public static void main(String[] args) {
//		
//		int[] a = { 1,2,3,4,5,6,7,8};
//		int[] b = { 1,2,3,4,5,6,7,8};
//		
//		var c = new int[a.length];
//		
//		var vectorA = IntVector.fromArray(IntVector.SPECIES_256,a,0);
//		var vectorB = IntVector.fromArray(IntVector.SPECIES_256,b,0);
//		
//		var vectorC = vectorA.add(vectorB);
//		
//		vectorC.intoArray(c,0);
//		
//		
//	}
//
//}
