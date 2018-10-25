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
public class Octagon implements ShapeInterface {
    double side;
    public Octagon (double side) {
    this.side = side;
    }

// Returns the area of this octagon.
    @Override
    public double area() {
    return 2.0 * (1 + Math.sqrt(2)) * side * side;
    }

// Returns the perimeter of this rectangle.
     @Override
    public double perimeter() {
    return 8.0 * side;
    }
}

