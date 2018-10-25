/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapes;

/**
 *
 * @author hkkanwar
 */
public class Triangle implements ShapeInterface {
double a;
double b;
double c;
// Constructs a new Triangle given side lengths.
public Triangle(double a, double b, double c) {
this.a = a;
this.b = b;
this.c = c;
}
// Returns a triangle's area using Heron's formula.
 @Override
public double area() {
double s = (a + b + c) / 2.0;
return Math.sqrt(s * (s-a)*(s-b)*(s-c));
}
// Returns the perimeter of the triangle.
 @Override
 
public double perimeter() {
return a + b + c;
}
}
