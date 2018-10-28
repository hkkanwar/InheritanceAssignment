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
double ht;
// Constructs a new Triangle given side lengths.
public Triangle(double a, double b, double c, double ht) {
this.a = a;
this.b = b;
this.c = c;
this.ht = ht;
}
// Returns a triangle's area using Heron's formula.
 @Override
public double area() {
double s = (b*ht) / 2.0;
return s;
}
// Returns the perimeter of the triangle.
 @Override
 
public double perimeter() {
return a + b + c;
}
}
