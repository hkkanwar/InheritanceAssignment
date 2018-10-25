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
public class Circle implements ShapeInterface {
private double radius;
// Constructs a new circle with the given radius.
public Circle(double radius) {
this.radius = radius;
}
// Returns the area of the circle.
@Override
public double area() {
return Math.PI * radius * radius;
}
// Returns the perimeter of the circle.
@Override
public double perimeter() {
return 2.0 * Math.PI * radius;
}
}