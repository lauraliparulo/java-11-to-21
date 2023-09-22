package de.demo.jep;

abstract sealed class SealedClass_JEP_409 permits Circle, Rectangle {}


final class Circle extends SealedClass_JEP_409 {}

final class Rectangle extends SealedClass_JEP_409  {}

//final class Polygon extends SealedClass_JEP_409 {}
