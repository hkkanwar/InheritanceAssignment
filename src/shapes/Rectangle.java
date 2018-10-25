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
public class Rectangle implements ShapeInterface {
private double width, height;
// Constructs a new rectangle with the given dimensions.
public Rectangle(double width, double height) {
this.width = width;
this.height = height;
}
// Returns the area of this rectangle.
public double area() {
return width * height;
}
// Returns the perimeter of this rectangle.
public double perimeter() {
return 2.0 * (width + height);
}
}