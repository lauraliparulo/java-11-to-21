package de.demo.syntax;

public class SealedTypes {

}

abstract sealed class Shape permits Circle, Rectangle {}


final class Circle extends Shape {}

non-sealed class Rectangle extends Shape {}

final class Square extends Rectangle {}

//class Rectangle extends Shape {}  it must be final!!

//final class Book extends Shape {}  compiler error