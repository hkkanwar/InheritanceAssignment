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
public class Parallelogram implements ShapeInterface {
private double base, height;

// Constructs a new rectangle with the given dimensions.
public Parallelogram (double base, double height) {
    this.base = base;
    this.height = height;
}

// Returns the area of this parallelogram.
 @Override
public double area() {
    return base * height;
}

// Returns the perimeter of this parallelogram.
 @Override
public double perimeter() {
    return 2.0 * (base + height);
}
}
